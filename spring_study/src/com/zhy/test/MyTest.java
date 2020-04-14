package com.zhy.test;

import com.zhy.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MyTest
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/13 16:58
 * @Version: 1.0
 **/
public class MyTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
        Person person1 = (Person) applicationContext.getBean("person1");
        Person person2 = (Person) applicationContext.getBean("person1");
        System.out.println(person1 == person2);
        System.out.println(person1);
    }
}
