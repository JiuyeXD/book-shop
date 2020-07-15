package com.book.bookshop.entity;
/*
 * @author: Jiuye
 * @date: 2020-07-13 23:02
 * @package: com.book.bookshop.entity
 * @Description: 图书的实体类
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;

@Data // lombok注解自动生成get/set方法
@TableName(value = "bs_book") // 注解指定表名
public class Bs_Book extends Model<Bs_Book> {
    @TableId(type = IdType.AUTO) // 指定主键 主键为自增 => AUTO
    private Integer id;
    private String isbn;
    private String name;
    private String author;
    private String publisher;
    private Date publishDate;
    private double oldPrice,newPrice;
    private String authorLoc;
    private String suit;
    private String category;
    private String info;
    private String imgUrl;
}
