package com.example.chatbot;

import com.example.chatbot.dao.QuestionMapper;
import com.example.chatbot.domain.Question;
import com.hankcs.hanlp.HanLP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class MyService {

    @Autowired
    QuestionMapper mapper;

    private static Logger logger = LoggerFactory.getLogger(MyService.class);


    public static HashSet<String> set = new HashSet<String>() {{
        add("分数线");
        add("武汉理工大学");
        add("湖北省");
        add("2018");
        add("招生");
        add("简介");
        add("安徽省");
        add("北京市");
        add("校区");
        add("专业");
        add("学院");
        add("学费");
        add("双专业");
        add("中外");
        add("标准");
        add("兔子");
        add("萝卜");
    }};

    /**
     * 胡佑璞 2019-6-12 20:02:05
     * 提取关键词
     *
     * @param text 用户输入文本
     * @return 关键词list
     */
    public List<String> keyword(String text) {
        List<String> keywordList = HanLP.extractKeyword(text, 5);
        logger.info("提取关键词："+keywordList.toString());
        return keywordList;
    }

    //筛选自定义的关键词
    public List<String> chooseMyKeys(List<String> text) {
        List<String> result = new ArrayList<>();
        for (String key : text){
            if (set.contains(key))
                result.add(key);
        }
        return result;
    }


    /**
     * 根据关键词查询相关问题
     */
    public List<Question> selectLike(String key) {
        return mapper.selectLike(key);
    }

    public int insertQuestion(String question, String answer){
        return mapper.insertQuestion(question,answer);
    }

}
