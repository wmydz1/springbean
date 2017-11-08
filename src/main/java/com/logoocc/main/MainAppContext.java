package com.logoocc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class MainAppContext {
    public static void main(String[] args) {
//        ApplicationContext context = new FileSystemXmlApplicationContext
//                ("//Users/samchen/Documents/useful/springbean/src/main/resources/Beans.xml");
        ApplicationContext context = new  ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorldss");
        obj.getMessage();
    }
}
