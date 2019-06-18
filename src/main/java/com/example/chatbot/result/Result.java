package com.example.chatbot.result;

public class Result<T> {
/**
 * @author ZFC
 * @create 2018-07-25 20:27
 * @desc  This class is the role of result code and result type
 **/
      private int code;
      private String msg;
      private T data;


    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    public Result(CodeMsg cm) {
        if (cm == null){
            return;
        }else {
            this.code = cm.getCode();
            this.msg = cm.getMsg();
            this.data = null;
        }

    }
    public Result() {
        super();
    }

    public static <T> Result<T> success(T data){
        return new Result<T>(data);
    }

    public static <T> Result<T> error(CodeMsg cm){
        return new Result<T>(cm);
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void appendMsg(String str){
            this.msg += "\n"+str;

    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
