package com.book.bookshop.entity;
/*
 * @author: Jiuye
 * @date: 2020-07-15 23:12
 * @package: com.book.bookshop.entity
 * @Description: 用户实体类
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName(value = "bs_user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String company;
}
