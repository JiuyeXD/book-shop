package com.book.bookshop.service;
/*
 * @author: Jiuye
 * @date: 2020-07-13 23:42
 * @package: com.book.bookshop.service
 * @Description: 图书业务层
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.book.bookshop.entity.Bs_Book;
import com.book.bookshop.mapper.BookMapper;
import org.springframework.stereotype.Service;

@Service
public class BookService extends ServiceImpl<BookMapper, Bs_Book> {
}
