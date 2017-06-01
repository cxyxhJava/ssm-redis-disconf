package com.frank.center;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by XG on 2017/6/1.
 */
public class main {
    public static void main(String[] args){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        Test test = (Test) ctx.getBean("test");
        test.getAxe();
        System.out.println(test.getAxe());
    }
}
