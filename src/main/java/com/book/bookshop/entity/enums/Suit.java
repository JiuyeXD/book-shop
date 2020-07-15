package com.book.bookshop.entity.enums;
/*
 * @author: Jiuye
 * @date: 2020-07-13 23:20
 * @package: com.book.bookshop.entity.enums
 * @Description: 套装枚举类
 */

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum Suit {
    YES(1,"是"),
    NO(2,"否");

    Suit(int code, String descp){
        this.code = code;
        this.descp = descp;
    }

    @EnumValue//标记数据库存的值是code
    private final int code;
    private final String descp;
}
