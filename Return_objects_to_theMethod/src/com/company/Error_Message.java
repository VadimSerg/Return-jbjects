package com.company;

public class Error_Message {//class contains error messages and code error (severity)
 private    String messages [] = {"There is not enough space on hard disk!", " You don't understand English",
" The Hard Drive is injured!", "System error! ", " The battery is discharged!", " Blah-Blah"};
 private   int [] code_error ={1, 2, 3, 4 , 5, 6};



    Content getMessage (int i) {//Return object with the type "Content".We print word "Content" because this method must contain this type "Content (String message , int err_severity)"
        if (i >= 0 && i<messages.length) return  new Content (messages[i],code_error[i]);// we bind area element and code error  with Content class message and err severity
        return  new Content( "This is an error, there is not this index!!!! ", 0);
    }


}
