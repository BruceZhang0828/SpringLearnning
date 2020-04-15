package com.zhy.controller;

import com.zhy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName: PersonController
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/15 19:10
 * @Version: 1.0
 **/
@Controller
public class PersonController {
    @Autowired
    private PersonService personServiceExt;

    public PersonController() {
        System.out.println("创建对象");
    }

    public void getPerson(){
        personServiceExt.getPerson();
    }

}
