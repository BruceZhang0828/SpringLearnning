package com.zhy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: MulService
 * @Description: 综合service
 * @Date: 2020/5/5 20:40
 * @Version: 1.0
 **/
@Service
public class MulService {

    @Autowired
    private BookService bookService;

    @Transactional
    public void mulTx(){
        bookService.checkout("zhangsan",1);
        bookService.updatePrice(1,1000);
    }
}
