package com.logoocc.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by samchen on 11/9/17.
 */
public class GetApple {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Apple obj = (Apple) context.getBean("apple");
        obj.getMessage();
        //context.registerShutdownHook();
    }
}
