package com.zhy.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

/**
 * @ClassName: MyTest
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/28 15:47
 * @Version: 1.0
 **/
public class MyTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "insert into emp(empno,ename) values(?,?) ";
        int result = jdbcTemplate.update(sql, 11111, "zhangsan");
        System.out.println(result);
        System.out.println(jdbcTemplate);
    }
}
