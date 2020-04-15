package com.zhy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName: Address
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/14 14:47
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@ToString
public class Address {
    private String province;
    private String city;
    private String town;

    public Address() {
        System.out.println("address被创建了");
    }

    public void init(){
        System.out.println("对象被初始化");
    }

    public void destory(){
        System.out.println("对象被销毁");
    }



}
