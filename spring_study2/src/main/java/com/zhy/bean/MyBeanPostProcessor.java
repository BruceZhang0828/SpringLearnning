package com.zhy.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName: MyBeanPostProcessor
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/15 10:22
 * @Version: 1.0
 **/
public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     * @Description 在初始化方法调用之前执行
     * @Date 10:27 2020/4/15
     * @Param [bean, beanName]
     * @return java.lang.Object
    **/
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization:"+beanName+"调用初始化前置方法");
        return bean;
    }
    /**
     * @Description 在初始化方法调用之后执行
     * @Date 10:28 2020/4/15
     * @Param [bean, beanName]
     * @return java.lang.Object
    **/
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization:"+beanName+"调用初始化后缀方法");
        return bean;
    }
}
