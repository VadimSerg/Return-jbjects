package com.company;

public class DisplayMessage {//this class using to display error messages

    public static void main(String[] args) {

        Error_Message sms = new Error_Message();//create reference variable to get a content(message, err_severity) rom class Error Message
        Content content;//--------------- created reference variable to refer the object of class Error_Message
        content = sms.getMessage(0);//- and to assign the values (message and severity)
        System.out.println(content.getMessage() + ":  "+ content.getErr_severity());
        content = sms.getMessage(10);
        System.out.println(content.getMessage() + ":  "+ content.getErr_severity());
        content = sms.getMessage(3);
        System.out.println(content.getMessage() + ":  "+ content.getErr_severity());


	// write your code here
    }
}
