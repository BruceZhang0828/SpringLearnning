package com.zhy.service;

import com.zhy.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PersonService
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/15 19:13
 * @Version: 1.0
 **/
@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public void getPerson() {
        personDao.getPerson();
    }
}
