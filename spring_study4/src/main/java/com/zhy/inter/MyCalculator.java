package com.zhy.inter;

/**
 * @ClassName: MyCalculator
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/16 8:57
 * @Version: 1.0
 **/
public class MyCalculator implements Calculator{

    public int add(int i, int j) {
        System.out.println("add 方法开始执行，参数为："+i+","+j);
        int result = i + j;
        System.out.println("add 方法开始完成结果为："+result);
        return result;
    }

    public int sub(int i, int j) {
        System.out.println("sub 方法开始执行，参数为："+i+","+j);
        int result = i - j;
        System.out.println("add 方法开始完成结果为："+result);
        return result;
    }

    public int mult(int i, int j) {
        System.out.println("mult 方法开始执行，参数为："+i+","+j);
        int result = i * j;
        System.out.println("add 方法开始完成结果为："+result);
        return result;
    }

    public int div(int i, int j) {
        System.out.println("div 方法开始执行，参数为："+i+","+j);
        int result = i / j;
        System.out.println("add 方法开始完成结果为："+result);
        return result;
    }
}
