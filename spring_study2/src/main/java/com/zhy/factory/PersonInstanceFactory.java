package com.zhy.factory;

import com.zhy.bean.Person;

/**
 * @ClassName: PersonInstanceFactory
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/14 16:06
 * @Version: 1.0
 **/
public class PersonInstanceFactory {
    public Person getPerson(String name){
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        return person;
    }
}
