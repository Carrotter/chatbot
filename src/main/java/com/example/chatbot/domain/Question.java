package com.example.chatbot.domain;

public class Question {
    private Integer quesId;

    private String question;

    private String keys;

    private String answer;

    private String o1;

    private String o2;

    private String o3;

    public Integer getQuesId() {
        return quesId;
    }

    public void setQuesId(Integer quesId) {
        this.quesId = quesId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys == null ? null : keys.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getO1() {
        return o1;
    }

    public void setO1(String o1) {
        this.o1 = o1 == null ? null : o1.trim();
    }

    public String getO2() {
        return o2;
    }

    public void setO2(String o2) {
        this.o2 = o2 == null ? null : o2.trim();
    }

    public String getO3() {
        return o3;
    }

    public void setO3(String o3) {
        this.o3 = o3 == null ? null : o3.trim();
    }

    @Override
    public String toString() {
        return "Question{" +
                "quesId=" + quesId +
                ", question='" + question + '\'' +
                ", keys='" + keys + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}