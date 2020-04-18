package com.zhy.test;

import com.zhy.inter.Calculator;
import com.zhy.inter.MyCalculator;
import com.zhy.proxy.CalculatorProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MyTest
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/16 8:58
 * @Version: 1.0
 **/
public class MyTest {
    public static void main(String[] args) {
//        MyCalculator myCalculator = new MyCalculator();
//        Calculator proxy = CalculatorProxy.getProxy(myCalculator);
//        System.out.println(proxy.add(1, 2));
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        MyCalculator bean = context.getBean(MyCalculator.class);
        System.out.println(bean);
        System.out.println(bean.getClass());
        bean.add(1,1);
    }
}
