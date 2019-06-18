package com.example.chatbot;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service",url = "http://api.qingyunke.com/api.php")
public interface  QingYunKe {

    @RequestMapping(value = "", method= RequestMethod.GET)
    public String send(@RequestParam("key")String key,@RequestParam("appid")String appid,@RequestParam("msg")String msg);

}
