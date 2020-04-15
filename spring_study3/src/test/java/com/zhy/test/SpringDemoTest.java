package com.zhy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: SpringDemoTest
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/15 19:15
 * @Version: 1.0
 **/
public class SpringDemoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object personDao = context.getBean("personDao");
        System.out.println(personDao);
    }
}
