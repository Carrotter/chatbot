package com.example.chatbot;

import com.example.chatbot.domain.Question;
import com.example.chatbot.result.Result;
import com.hankcs.hanlp.HanLP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/bot")
public class MyController {

    @Autowired
    MyService service;

    @Autowired
    QingYunKe qingYunKe;

    private static Logger logger = LoggerFactory.getLogger(MyController.class);

    /**
     * 胡佑璞 2019-6-12 20:02:05
     * 提取关键词
     * @param text 用户输入文本
     * @return 关键词list
     */
    @RequestMapping("/keyword")
    public Object keyword(String text) {
        List<String> keywordList = HanLP.extractKeyword(text, 5);
        System.out.println(keywordList);
        return keywordList;
    }

    /**
     * 2019-6-17 14:01:21 胡佑璞
     * @param key 关键词
     * @return 相关问题
     */
    @RequestMapping("/selectLike")
    public Result selectLike(String key) {
        List<Question> questionList = service.selectLike(key);
        return Result.success(questionList);
    }

    /**
     * 2019-6-17 14:01:21 胡佑璞
     * @param key 关键词
     * @return 相关问题
     */
    @RequestMapping("/talk")
    public Object talk(String key) {
        /*
        提取关键词
        筛选关键词
        找相关问题
        */
        logger.info("用户输入："+key);
        List<String> keys = service.keyword(key);
        keys = service.chooseMyKeys(keys);
        List<Question> result = new ArrayList<>();
        for (String word : keys){
            List<Question> questionList = service.selectLike(word);
            result.addAll(questionList);
        }
        logger.info("相关问题："+ result.toString());

        //如果数据库没有相关问题，则访问青云客API
        String yunke;
        if (result.size()==0){
            yunke = qingYunKe.send("free","0",key);
            logger.info("青云客接口："+ yunke);
            return yunke;
        }
        return Result.success(result);
    }

    //插入新问题
    @RequestMapping("/insertQuestion")
    public Result insertQuestion(String question, String answer){
        service.insertQuestion(question,answer);
        return Result.success(0);
    }


}
