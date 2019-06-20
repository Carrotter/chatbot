package com.example.chatbot.domain;

public class YunKe {

    private String result;
    private String content;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "YunKe{" +
                "result='" + result + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
