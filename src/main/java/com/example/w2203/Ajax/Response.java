package com.example.w2203.Ajax;

import lombok.Data;

@Data
public class Response {
    private boolean isok;
    private int code;
    private String message;
    private Object data;

    public Response(){}

    public static Response success(){
        Response response=new Response();
        response.setIsok(true);
        response.setCode(200);
        response.setMessage("ok");
        return response;
    }
    public static Response success(Object obj,String message){
        Response response=new Response();
        response.setIsok(true);
        response.setCode(200);
        response.setMessage(message);
        response.setData(obj);
        return response;
    }

}
