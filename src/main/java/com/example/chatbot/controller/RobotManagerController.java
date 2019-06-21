package com.example.chatbot.controller;

import com.example.chatbot.result.ResultTab;
import com.example.chatbot.service.serviceImpl.RobotManagerImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/manager")
public class RobotManagerController {

    @Resource
    RobotManagerImpl robotManagereSrvice;

    @RequestMapping("/all")
    @ResponseBody
    public ResultTab selectAll(String page, String limit) {
        return robotManagereSrvice.selectAll(Integer.parseInt(page), Integer.parseInt(limit));
    }

    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ResponseBody
    public ResultTab deleteQuestion(String id) {
        return robotManagereSrvice.deleteQuestion(id);
    }

    @RequestMapping("/hot")
    @ResponseBody
    public ResultTab selectHotQuestion() {
        return robotManagereSrvice.selectHotQuesiton();
    }

    @RequestMapping("noAdd")
    @ResponseBody
    public ResultTab selectOutHotQuestions() {
        return robotManagereSrvice.selectOutHotQuestions();
    }
}
