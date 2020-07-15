package com.book.bookshop.service;
/*
 * @author: Jiuye
 * @date: 2020-07-15 23:16
 * @package: com.book.bookshop.service
 * @Description: 用户业务层
 */

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.book.bookshop.entity.User;
import com.book.bookshop.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService extends ServiceImpl<UserMapper, User> {
    @Autowired
    private UserMapper userMapper;
    /*
    * 验证用户是否存在
    */
    public String checkUser(String username){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        User user = userMapper.selectOne(queryWrapper);
        if (user == null){
            return "101";//用户不存在a
        }else{
            return "102";//用户已存在
        }
    }
}
