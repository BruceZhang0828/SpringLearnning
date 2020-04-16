package com.zhy.inter;

import com.zhy.util.LogUtil;

/**
 * @ClassName: MyCalculator
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/16 8:57
 * @Version: 1.0
 **/
public class MyCalculator implements Calculator{

    public int add(int i, int j) {
        LogUtil.start(i,j);
        int result = i + j;
        LogUtil.stop(result);
        return result;
    }

    public int sub(int i, int j) {
        LogUtil.start(i,j);
        int result = i - j;
        LogUtil.stop(result);
        return result;
    }

    public int mult(int i, int j) {
        LogUtil.start(i,j);
        int result = i * j;
        LogUtil.stop(result);
        return result;
    }

    public int div(int i, int j) {
        LogUtil.start(i,j);
        int result = i / j;
        LogUtil.stop(result);
        return result;
    }
}
