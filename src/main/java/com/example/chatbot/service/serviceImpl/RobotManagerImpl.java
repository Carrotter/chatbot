package com.example.chatbot.service.serviceImpl;

import com.example.chatbot.dao.QuestionMapper;
import com.example.chatbot.domain.Question;
import com.example.chatbot.domain.hotQuestion;
import com.example.chatbot.result.ResultTab;
import com.example.chatbot.service.RobotManager;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class RobotManagerImpl implements RobotManager {

    @Resource
    QuestionMapper mapper;

    @Override
    public ResultTab selectAll(int page, int limit) {
        PageHelper.startPage(page, limit);
        Page<Question> all = mapper.selectAll();
        if (all == null) {
            return new ResultTab(0, "success", "0", null);
        }
        PageInfo<Question> alls= new PageInfo<>(all);
        return new ResultTab(0, "success", String.valueOf(all.getTotal()), alls.getList());
    }

    @Override
    public ResultTab deleteQuestion(String id) {
        int result = mapper.deleteQuestion(id);
        return new ResultTab(0, "success", "0", null);
    }

    /*@Override
    public int updateNum(String id) {
        return mapper.updateNum(id);
    }*/

    @Override
    public ResultTab selectHotQuesiton() {
        return new ResultTab(0, "success", "0", mapper.selectHotQuestion());
    }

    @Override
    public List<hotQuestion> selectOutHotQuestion(String key) {
        return mapper.selectOutHotQuestion(key);
    }

    @Override
    public int insertOutHotQuestion(String question) {
        mapper.insertOutHotQuestion(question);
        return 0;
    }

    @Override
    public int updateOutHotQuestion(String id) {
        mapper.updateOutHotQuestion(id);
        return 0;
    }

    @Override
    public ResultTab selectOutHotQuestions() {
        List<hotQuestion> list = mapper.selectOutHotQuestions();
        return new ResultTab(0, "success", "0", list);
    }
}
