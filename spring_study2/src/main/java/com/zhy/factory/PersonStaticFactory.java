package com.zhy.factory;

import com.zhy.bean.Person;

/**
 * @ClassName: PersonStaticFactory
 * @Description: 工厂类
 * @Date: 2020/4/14 15:47
 * @Version: 1.0
 **/
public class PersonStaticFactory {

    public static Person getPerson(String name){
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        return person;
    }
}
