package com.logoocc.main;

/**
 * Created by samchen on 11/8/17.
 */
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

}
