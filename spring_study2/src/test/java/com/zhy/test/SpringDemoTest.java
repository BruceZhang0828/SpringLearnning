package com.zhy.test;

import com.zhy.bean.Address;
import com.zhy.bean.Book;
import com.zhy.bean.Person;
import com.zhy.factory.MyFactoryBean;
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
//        test13(context2);
//        test14(context2);
//        test15(context2);
//        test16(context2);
//        test17(context2);
        test18(context2);
    }
    /**
     * @Description 这个方法使用了BeanPostProcessor
     * @Date 10:30 2020/4/15
     * @Param [context2]
     * @return void
    **/
    private static void test18(ApplicationContext context2) {
        Address address4 = context2.getBean("address4", Address.class);
        System.out.println(address4);
        ((ClassPathXmlApplicationContext)context2).close();
    }


    //测试bean对象的初始化和销毁方法
    private static void test17(ApplicationContext context2) {
        Address address4 = context2.getBean("address4", Address.class);
        System.out.println(address4);
        //applicationContext没有close方法，需要使用具体的子类
        ((ClassPathXmlApplicationContext)context2).close();
    }

    private static void test16(ApplicationContext context2) {
        try {
            // 这里虽然注入的是工厂,但是直接就返回来你需要的类实例
            Person person = context2.getBean("myfactorybean", Person.class);
            // Person person = person1.getObject();
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void test15(ApplicationContext context2) {
        Person person9 = context2.getBean("person9", Person.class);
        System.out.println(person9);
    }

    private static void test14(ApplicationContext context2) {
        Person person8 = context2.getBean("person8", Person.class);
        System.out.println(person8);
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
