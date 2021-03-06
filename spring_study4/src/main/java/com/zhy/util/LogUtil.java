package com.zhy.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
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


    @Pointcut("execution( public int com.zhy.inter.MyCalculator.*(int,int))")
    public void myPoint(){}



    /**
     * 环绕通知是spring中功能最强大的通知
     * @param proceedingJoinPoint
     * @return
     */
    @Around("myPoint()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint){
        Object[] args = proceedingJoinPoint.getArgs();
        String name = proceedingJoinPoint.getSignature().getName();
        Object proceed = null;
        try {
            System.out.println("环绕前置通知:"+name+"方法开始，参数是"+Arrays.asList(args));
            //利用反射调用目标方法，就是method.invoke()
            proceed = proceedingJoinPoint.proceed(args);
            System.out.println("环绕返回通知:"+name+"方法返回，返回值是"+proceed);
        } catch (Throwable e) {
            System.out.println("环绕异常通知"+name+"方法出现异常，异常信息是："+e);
        }finally {
            System.out.println("环绕后置通知"+name+"方法结束");
        }
        return proceed;
    }

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

    @Before("myPoint()")
    public static void start(JoinPoint joinPoint){
//        System.out.println("XXX方法开始执行，使用的参数是："+ Arrays.asList(objects));
//        System.out.println(method.getName()+"方法开始执行，参数是："+ Arrays.asList(objects));
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法开始执行,参数是:"+Arrays.asList(args));
    }

    @AfterReturning(value = "myPoint()",returning = "result")
    public static void stop(JoinPoint joinPoint,Object result){
//        System.out.println("XXX方法执行结束，结果是："+ Arrays.asList(objects));
//        System.out.println(method.getName()+"方法开始执行，参数是："+ Arrays.asList(objects));
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法执行完成，结果是："+result);
    }

    @AfterThrowing(value = "myPoint()",throwing = "exception")
    public static void logException(JoinPoint joinPoint,Exception exception){
//        System.out.println(method.getName()+"方法出现异常："+ e.getMessage());
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法出现异常："+exception);
    }

    @After("myPoint()")
    public static void end(JoinPoint joinPoint){
//        System.out.println(method.getName()+"方法执行结束了......");
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法执行结束了......");
    }
}
