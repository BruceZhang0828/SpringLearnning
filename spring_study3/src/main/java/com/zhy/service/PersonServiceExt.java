package com.zhy.service;

import com.zhy.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PersonServiceExt
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/15 21:29
 * @Version: 1.0
 **/
@Service
public class PersonServiceExt extends PersonService {
    @Autowired
    private PersonDao personDao;

    @Override
    public void getPerson(){
        System.out.println("PersonServiceExt......");
        personDao.getPerson();
    }
}
