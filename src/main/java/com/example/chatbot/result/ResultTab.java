package com.example.chatbot.result;

import java.util.List;

public class ResultTab {

/**
 * @Description:
 * Created by shanzhihong on 2018/08/13-18:58.
 * @version 1.0
 */
    private int code;
    private String msg;
    private String count;
    private List data;

    public ResultTab(int code, String msg, String count, List data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public static ResultTab getResultTab(List data){
        return new ResultTab(0,"success",data.size()+"",data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

}
