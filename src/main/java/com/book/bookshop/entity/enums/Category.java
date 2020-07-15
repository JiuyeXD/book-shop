package com.book.bookshop.entity.enums;
/*
 * @author: Jiuye
 * @date: 2020-07-13 23:19
 * @package: com.book.bookshop.entity.enums
 * @Description: 图书类型枚举类
 */

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum Category {
    SELECTED(1,"精选图书"),
    RECOMMEND(2,"推荐图书"),
    BARGAIN(3,"特价图书");

    Category(int code, String descp) {
        this.code = code;
        this.descp = descp;
    }
    @EnumValue//标记数据库存的值是code
    private final int code;
    private final String descp;
}
