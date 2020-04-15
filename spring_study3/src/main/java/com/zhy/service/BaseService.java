package com.zhy.service;

import com.zhy.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: BaseService
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/15 21:50
 * @Version: 1.0
 **/
public class BaseService<T> {
    @Autowired
    BaseDao<T> baseDao;

    public void save(){
        System.out.println("自动注入的对象："+baseDao);
        baseDao.save();
    }
}
