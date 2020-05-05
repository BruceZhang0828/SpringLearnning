package com.zhy.dao;

import com.zhy.bean.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: EmpDao
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/5 15:52
 * @Version: 1.0
 **/
@Repository
public class EmpDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void save(Emp emp){
        String sql = "insert into emp(empno,ename) values(?,?)";
        int update = jdbcTemplate.update(sql, emp.getEmpno(), emp.getEname());
        System.out.println(update);
    }
}
