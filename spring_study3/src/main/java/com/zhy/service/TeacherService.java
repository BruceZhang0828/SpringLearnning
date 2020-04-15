package com.zhy.service;

import com.zhy.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: TeacherService
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/15 21:46
 * @Version: 1.0
 **/
@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public void save(){
        teacherDao.save();
    }
}
