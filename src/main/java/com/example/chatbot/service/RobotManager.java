package com.example.chatbot.service;

import com.example.chatbot.domain.hotQuestion;
import com.example.chatbot.result.ResultTab;

import java.util.List;

public interface RobotManager {

    //获取语料库内容
    public ResultTab selectAll(int page, int limit);

    //删除问题
    public ResultTab deleteQuestion(String id);

    //更新问题被访问数量
    //public int updateNum(String id);

    //获取排名前十热点问题
    public ResultTab selectHotQuesiton();

    //获取没有录入的问题
    public List<hotQuestion> selectOutHotQuestion(String key);

    //未录入表插入问题
    public int insertOutHotQuestion(String question);

    //更新数量
    public int updateOutHotQuestion(String id);

    //咨询最多的前20个未录入问题
    public ResultTab selectOutHotQuestions();
}
