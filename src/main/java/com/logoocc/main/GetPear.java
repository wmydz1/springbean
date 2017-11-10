package com.logoocc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by samchen on 11/9/17.
 */
public class GetPear {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Pear pear = (Pear) context.getBean("pear");
        pear.getMessage1();
        pear.getMessage2();

        System.out.println("----------splite--line------------");
        SmallPear smallPear = (SmallPear) context.getBean("smallpear");
        smallPear.getMessage1();
        smallPear.getMessage2();
        smallPear.getMessage3();

    }
}
