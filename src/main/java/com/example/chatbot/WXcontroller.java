package com.example.chatbot;

import com.alibaba.fastjson.JSON;
import com.example.chatbot.domain.Question;
import com.example.chatbot.domain.YunKe;
import com.example.chatbot.result.Result;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/wx")
public class WXcontroller {

    private static Logger logger = LoggerFactory.getLogger(WXcontroller.class);

    @Autowired
    MyController myController;

    //微信token验证
    @RequestMapping(method = RequestMethod.GET)
    public void login(HttpServletRequest request, HttpServletResponse response) {
        logger.info("收到微信token验证");
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            if (CheckUtil.checkSignature(signature, timestamp, nonce)) {
                out.write(echostr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }
    }

    //接受微信推送消息
    @RequestMapping(method = RequestMethod.POST)
    public void dopost(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("utf-8");
        PrintWriter out = null;
        //将微信请求xml转为map格式，获取所需的参数
        Map<String, String> map = MessageUtil.xmlToMap(request);
        String ToUserName = map.get("ToUserName");//接受者
        String FromUserName = map.get("FromUserName");//发送者
        String MsgType = map.get("MsgType");//消息类型
        String content = "null";//用户输入
        String message = null;//返回微信的XML
        TextMessageUtil textMessage = new TextMessageUtil();
        String reply = "null";//给用户回复内容
        StringBuilder builder = new StringBuilder();
        boolean flag = true;

        switch (MsgType) {//提取用户输入文本
            case "text"://文本消息
                content = map.get("Content");
                logger.info("用户文本：" + content);
                break;
            case "voice"://语音消息
                content = map.get("Recognition");
                logger.info("用户语音：" + content);
                builder.append(content).append("\n").append("\n");
                break;
            case "event"://关注\取关推送消息
                flag = false;
                break;
        }

        //接入聊天接口
        if (flag && StringUtils.isNoneBlank(content)) {
            Result result = (Result) myController.talk(content);
            if (result.getCode() == 0) {//数据库问题返回
                List<Question> questionList = (List<Question>) result.getData();
                for (Question item : questionList){
                    builder.append(item.getQuestion()).append("\n").append(item.getAnswer()).append("\n").append("\n");
                }
                reply = builder.toString();
            } else if (result.getCode() == 1) {//青云客接口
                YunKe yunKe = JSON.parseObject(String.valueOf(result.getData()), YunKe.class);
                reply = yunKe.getContent().replace("{br}","\n");
            }
        } else {
            reply = "感谢关注，我是智能招生聊天机器人。您可以试着输入：武汉理工、分数线、专业、校区...等关键词。无聊的时候，也可以和我聊天哦。";
        }

        message = textMessage.initMessage(FromUserName, ToUserName, reply);
        try {
            out = response.getWriter();
            out.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("自动回复：" + reply);
        out.close();
    }
}
