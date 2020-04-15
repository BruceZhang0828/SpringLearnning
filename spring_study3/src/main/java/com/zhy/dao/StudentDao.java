package com.zhy.dao;

import com.zhy.bean.Student;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: StudentDao
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/15 21:43
 * @Version: 1.0
 **/
@Repository
public class StudentDao extends BaseDao<Student> {
    @Override
    public void save() {
        System.out.println("保存学生");
    }
}
