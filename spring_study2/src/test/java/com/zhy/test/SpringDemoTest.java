package com.zhy.test;

import com.zhy.bean.Book;
import com.zhy.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: SpringDemoTest
 * @Description: Spring的ioc测试
 * @Date: 2020/4/14 9:28
 * @Version: 1.0
 **/
public class SpringDemoTest {


    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
//        test01(context);
//        test02(context);
//        test03(context);
//        test04(context);
//        test05(context);
//        test06(context);
//        test07(context);
//        test08(context);

        ApplicationContext context2 = new ClassPathXmlApplicationContext("ioc2.xml");
//        test09(context2);
//        test10(context2);
//        test11(context2);
//        test12(context2);
        test13(context2);
    }

    private static void test13(ApplicationContext context2) {
        Person person = context2.getBean("person7", Person.class);
        Person person7 = context2.getBean("person7", Person.class);
        System.out.println(person == person7);
    }

    private static void test12(ApplicationContext context2) {
        Book book3 = context2.getBean("book3", Book.class);
        System.out.println(book3);
    }

    private static void test11(ApplicationContext context2) {
        Person person5 = context2.getBean("person5", Person.class);
        System.out.println(person5);
    }

    private static void test10(ApplicationContext context2) {
        Person person3 = context2.getBean("person3", Person.class);
        System.out.println(person3);
    }

    private static void test09(ApplicationContext context) {
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

    private static void test08(ApplicationContext context) {
        Person person7 = context.getBean("person7", Person.class);
        System.out.println(person7);
    }

    private static void test07(ApplicationContext context) {
        Person person6 = context.getBean("person6", Person.class);
        System.out.println(person6);
    }


    private static void test06(ApplicationContext context) {
        Person person5 = context.getBean("person5", Person.class);
        System.out.println(person5);
    }

    private static void test05(ApplicationContext context) {
        Person person4 = context.getBean("person4", Person.class);
        System.out.println(person4);
    }

    private static void test04(ApplicationContext context) {
        Person person3 = context.getBean("person3", Person.class);
        System.out.println(person3);
    }

    private static void test03(ApplicationContext context) {
        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);
    }

    // 直接更具类型获取容器中的bean
    public static void test02(ApplicationContext context) {
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
    }

    // 根据id 以及类型获取容器中的bean
    public static void test01(ApplicationContext context) {
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
