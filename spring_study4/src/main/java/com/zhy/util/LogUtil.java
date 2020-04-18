package com.zhy.util;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName: LogUtil
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/16 17:01
 * @Version: 1.0
 **/
@Component
@Aspect
public class LogUtil {

    /*
   设置下面方法在什么时候运行
       @Before:在目标方法之前运行：前置通知
       @After:在目标方法之后运行：后置通知
       @AfterReturning:在目标方法正常返回之后：返回通知
       @AfterThrowing:在目标方法抛出异常后开始运行：异常通知
       @Around:环绕：环绕通知

       当编写完注解之后还需要设置在哪些方法上执行，使用表达式
       execution(访问修饰符  返回值类型 方法全称)
    */

    @Before("execution(public int com.zhy.inter.MyCalculator.*(int ,int))")
    public static void start(){
//        System.out.println("XXX方法开始执行，使用的参数是："+ Arrays.asList(objects));
//        System.out.println(method.getName()+"方法开始执行，参数是："+ Arrays.asList(objects));
        System.out.println("方法开始执行,参数是:");
    }

    @AfterReturning("execution(public int com.zhy.inter.MyCalculator.*(int ,int))")
    public static void stop(){
//        System.out.println("XXX方法执行结束，结果是："+ Arrays.asList(objects));
//        System.out.println(method.getName()+"方法开始执行，参数是："+ Arrays.asList(objects));
        System.out.println("方法执行完成，结果是：");
    }

    @AfterThrowing("execution( public int com.zhy.inter.MyCalculator.*(int,int))")
    public static void logException(){
//        System.out.println(method.getName()+"方法出现异常："+ e.getMessage());
        System.out.println("方法出现异常：");
    }

    @After("execution( public int com.zhy.inter.MyCalculator.*(int,int))")
    public static void end(){
//        System.out.println(method.getName()+"方法执行结束了......");
    }
}
