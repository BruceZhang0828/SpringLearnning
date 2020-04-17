package com.zhy.test;

import com.zhy.inter.Calculator;
import com.zhy.inter.MyCalculator;
import com.zhy.proxy.CalculatorProxy;

/**
 * @ClassName: MyTest
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/16 8:58
 * @Version: 1.0
 **/
public class MyTest {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        Calculator proxy = CalculatorProxy.getProxy(myCalculator);
        System.out.println(proxy.add(1, 2));
    }
}
