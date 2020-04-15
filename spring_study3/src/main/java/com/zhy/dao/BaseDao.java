package com.zhy.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName: BaseDao
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/15 21:42
 * @Version: 1.0
 **/
@Repository
public abstract class BaseDao<T> {
    public abstract void save();
}
