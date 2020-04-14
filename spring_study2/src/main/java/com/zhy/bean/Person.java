package com.zhy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName: Person
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/14 9:24
 * @Version: 1.0
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private int id;
    private String name;
    private int age;
    private String gender;

    public Person(int id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Age");
    }

    public Person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        System.out.println("gender");
    }
}
