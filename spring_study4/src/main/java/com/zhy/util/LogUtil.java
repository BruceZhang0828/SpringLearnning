package com.zhy.util;

import java.util.Arrays;

/**
 * @ClassName: LogUtil
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/16 17:01
 * @Version: 1.0
 **/
public class LogUtil {

    public static void start(Object ... objects){
        System.out.println("XXX方法开始执行，使用的参数是："+ Arrays.asList(objects));
    }

    public static void stop(Object ... objects){
        System.out.println("XXX方法执行结束，结果是："+ Arrays.asList(objects));
    }
}
