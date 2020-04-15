package com.zhy.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: PersonDao
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/15 19:13
 * @Version: 1.0
 **/
@Repository("personDao")
@Scope(value="prototype")
public class PersonDao {
    public void getPerson() {
        System.out.println("PersonDao:getPerson");
    }
}
