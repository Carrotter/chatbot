package com.example.chatbot;

import com.hankcs.hanlp.dictionary.CustomDictionary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 启动时，支付接口初始化
 * Created by 胡佑璞 on 2019/2/3 11:38
 */
@Component
public class MyInit implements ApplicationRunner {

    private static Logger logger = LoggerFactory.getLogger(MyInit.class);

    @Override
    public void run(ApplicationArguments applicationArguments){
        CustomDictionary.add("武汉理工大学");
        CustomDictionary.add("分数线");
        CustomDictionary.add("湖北省");
        CustomDictionary.add("2018");
        CustomDictionary.add("招生");
        CustomDictionary.add("简介");
        CustomDictionary.add("安徽省");
        CustomDictionary.add("北京市");
        CustomDictionary.add("校区");
        CustomDictionary.add("专业");
        CustomDictionary.add("学院");
        CustomDictionary.add("学费");
        CustomDictionary.add("双专业");
        CustomDictionary.add("中外");
        CustomDictionary.add("标准");
        CustomDictionary.add("兔子");
        CustomDictionary.add("萝卜");
        logger.info("词典初始化完成！");
    }
}
