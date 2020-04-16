package com.zhy.test;

import com.zhy.inter.MyCalculator;

/**
 * @ClassName: MyTest
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/16 8:58
 * @Version: 1.0
 **/
public class MyTest {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.add(1, 2));
    }
}
