package com.zhy.inter;

import com.zhy.util.LogUtil;
import org.springframework.stereotype.Service;

/**
 * @ClassName: MyCalculator
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/16 8:57
 * @Version: 1.0
 **/
@Service
public class MyCalculator{

    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    public int mult(int i, int j) {
        int result = i * j;
        return result;
    }

    public int div(int i, int j) {
        int result = i / j;
        return result;
    }
}
