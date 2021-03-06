package com.zhy.service;

import com.zhy.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName: BookService
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/5 16:04
 * @Version: 1.0
 **/
public class BookService {
    @Autowired
    BookDao bookDao;
    /**
     * 结账：传入哪个用户买了哪本书
     * @param username
     * @param id
     */
    // 开启注解
    /*@Transactional(timeout = 3,noRollbackFor = {ArithmeticException.class,NullPointerException.class})
    public void checkout(String username,int id){
        bookDao.updateStock(id);
        int price = bookDao.getPrice(id);
        bookDao.updateBalance(username,price);
        int i = 1/0;
    }*/

    public void checkout(String username,int id) {
        bookDao.updateStock(id);
        int price = bookDao.getPrice(id);
        bookDao.updateBalance(username,price);
        int i = 1/0;
    }



    public void updatePrice(int id,int price){
        bookDao.updatePrice(id,price);
    }

    public void mulTx(){
        checkout("zhangsan",1);
        updatePrice(1,1000);
        int i = 1/0;
    }
}
