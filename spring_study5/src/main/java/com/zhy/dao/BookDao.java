package com.zhy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: BookDao
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/5 16:03
 * @Version: 1.0
 **/
@Repository
public class BookDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 减去某个用户的余额
     * @param userName
     * @param price
     */
    public void updateBalance(String userName,int price){
        String sql = "update account set balance=balance-? where username=?";
        jdbcTemplate.update(sql,price,userName);
    }

    /**
     * 按照图书的id来获取图书的价格
     * @param id
     * @return
     */
    public int getPrice(int id){
        String sql = "select price from book where id=?";
        return jdbcTemplate.queryForObject(sql,Integer.class,id);
    }

    /**
     * 减库存，减去某本书的库存
     * @param id
     */
    public void updateStock(int id){
        String sql = "update book_stock set stock=stock-1 where id=?";
        jdbcTemplate.update(sql,id);
    }


    /**
     * 修改图书价格
     * @param id
     * @param price
     */
    public void updatePrice(int id,int price){
        String sql = "update book set price=? where id =?";
        jdbcTemplate.update(sql,price,id);
    }
}
