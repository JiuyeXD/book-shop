package com.book.bookshop.web;
/*
 * @author: Jiuye
 * @date: 2020-07-14 13:40
 * @package: com.book.bookshop.web
 * @Description: 图书控制器
 */

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.book.bookshop.entity.Bs_Book;
import com.book.bookshop.entity.enums.Category;
import com.book.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /*
     * 获取图书信息
     * */
    @RequestMapping("/getBookData")
    public String getBookData(Model model,Integer page,Integer category){
        // mybatis plus的分页功能
        QueryWrapper<Bs_Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("category", 1);
        IPage<Bs_Book> iPage = bookService.page(new Page<>(1,4),queryWrapper);
        model.addAttribute("bookList",iPage.getRecords());
        model.addAttribute("pre",iPage.getCurrent() - 1);
        model.addAttribute("next", iPage.getCurrent() + 1);
        model.addAttribute("cur", iPage.getCurrent());
        model.addAttribute("last",iPage.getPages());
        model.addAttribute("pages", iPage.getPages());
        model.addAttribute("category",category);
        return "bookData";
    }

}
