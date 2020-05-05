package com.zhy.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.zhy.bean.Emp;
import com.zhy.dao.EmpDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: MyTest
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/28 15:47
 * @Version: 1.0
 **/
public class MyTest {
    public static void main(String[] args) throws SQLException {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
//        String sql = "insert into emp(empno,ename) values(?,?) ";
//         int result = jdbcTemplate.update(sql, 11111, "zhangsan");
//        System.out.println(result);
        // 执行批量插入
//        List list = new ArrayList<Object[]>();
//        list.add(new Object[]{1,"zhangsan1"});
//        list.add(new Object[]{2,"zhangsan2"});
//        list.add(new Object[]{3,"zhangsan3"});
//        int[] ints = jdbcTemplate.batchUpdate(sql, list);
//
//        for (int i : ints) {
//            System.out.println(i);
//        }
        // 进行数据查询
//        String sql = "select * from emp where empno = ?";
//        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Emp>(Emp.class), 11111);
//        System.out.println(emp);
        // 进行数据集合的查询
//        String sql = "select * from emp where sal > ?";
//        List<Emp> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
//        for (Emp emp : query) {
//            System.out.println(emp);
//        }
        // 返回组合函数的值
//        String sql = "select max(sal) from emp";
//        Double aDouble = jdbcTemplate.queryForObject(sql, Double.class);
//        System.out.println(aDouble);

//        System.out.println(jdbcTemplate);
        // 使用具备具名函数的JdbcTemplate
//        NamedParameterJdbcTemplate namedParameterJdbcTemplate = context.getBean("namedParameterJdbcTemplate", NamedParameterJdbcTemplate.class);
//        String sql = "insert into emp(empno,ename) values(:empno,:ename)";
//        Map<String,Object> map = new HashMap<>();
//        map.put("empno",2222);
//        map.put("ename","sili");
//        int update = namedParameterJdbcTemplate.update(sql, map);
//        System.out.println(update);
//        System.out.println(namedParameterJdbcTemplate);

        // 整合Dao层
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = context.getBean("empDao", EmpDao.class);
        Emp emp = new Emp();
        emp.setEmpno(3333);
        emp.setEname("wangwu");
        empDao.save(emp);
    }
}
