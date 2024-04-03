package org.example.school.common.exception;

import lombok.Getter;

@Getter
public class MyBlogException extends  RuntimeException {


    private  Integer code;
     private  String msg;

     public MyBlogException(Integer code, String msg){
         super(msg);
         this.code=code;
         this.msg=msg;
     }
     public MyBlogException(Integer code, String msg, Throwable throwable){
         super(msg,throwable);
         this.code=code;
         this.msg=msg;

     }

     public MyBlogException(String msg){
         super(msg);
         this.code=403;
         this.msg=msg;
     }

     public MyBlogException(String msg , Throwable throwable){
         super(msg,throwable);
         this.code=403;
         this.msg=msg;
     }

}
