package com.zhy.dao;

import com.zhy.bean.Teacher;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: TeacherDao
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/15 21:44
 * @Version: 1.0
 **/
@Repository
public class TeacherDao extends BaseDao<Teacher> {
    @Override
    public void save() {
        System.out.println("保存老师");
    }
}
