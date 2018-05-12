package com.company;

public class Content {
 private   String message;
 private    int err_severity ;
    Content (String message , int err_severity) {//using constructor for return and display error message
        this.message = message;
        this.err_severity = err_severity;
    }

    int getErr_severity(){
        return  err_severity;
    }

    String getMessage(){
        return  message;
    }

}
