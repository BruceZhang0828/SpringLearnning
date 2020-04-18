package com.zhy.proxy;

import com.zhy.inter.Calculator;
import com.zhy.util.LogUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @ClassName: CalculatorProxy
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/17 9:24
 * @Version: 1.0
 **/
public class CalculatorProxy {

    /**
     *
     *  为传入的参数对象创建一个动态代理对象
     * @param calculator 被代理对象
     * @return
     */
    public static Calculator getProxy(final Calculator calculator){
        //被代理对象的类加载器
        ClassLoader loader = calculator.getClass().getClassLoader();
        //被代理对象的接口
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler(){
            /**
             *  执行目标方法
             * @param proxy 代理对象，给jdk使用，任何时候都不要操作此对象
             * @param method 当前将要执行的目标对象的方法
             * @param args 这个方法调用时外界传入的参数值
             * @return
             * @throws Throwable
             */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    // LogUtil.start();
                    result = method.invoke(calculator, args);
                    // LogUtil.stop();
                } catch (Exception e) {
                    //LogUtil.logException();
                } finally {
                    // LogUtil.end();
                }
                //将结果返回回去
                return result;
            }
        };
        //方法执行器，执行被代理对象的目标方法
        Object proxyInstance = Proxy.newProxyInstance(loader, interfaces, invocationHandler);
        return (Calculator) proxyInstance;
    }
}
