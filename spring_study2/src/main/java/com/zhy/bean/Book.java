package com.zhy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName: Book
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/14 14:48
 * @Version: 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private String name;
    private String author;
    private double price;

}
