package com.zhy.service;

import com.zhy.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: BookService
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/5 16:04
 * @Version: 1.0
 **/
@Service
public class BookService {
    @Autowired
    BookDao bookDao;


    /**
     * 结账：传入哪个用户买了哪本书
     * @param username
     * @param id
     */
    // 开启注解
    @Transactional(timeout = 3)
    public void checkout(String username,int id){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bookDao.updateStock(id);
        int price = bookDao.getPrice(id);
        bookDao.updateBalance(username,price);
    }
}
