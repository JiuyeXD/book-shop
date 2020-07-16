package com.book.bookshop.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.book.bookshop.entity.OrderItem;
import com.book.bookshop.mapper.OrderItemMapper;
import org.springframework.stereotype.Service;

/**
 * @Auther: Jiuye
 * @Date: 2020/6/29 16:37
 * @Description:
 */
@Service
public class OrderItemService extends ServiceImpl<OrderItemMapper,OrderItem> {
}
