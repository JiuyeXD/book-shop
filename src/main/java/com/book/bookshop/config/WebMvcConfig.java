package com.book.bookshop.config;
/*
 * @author: Jiuye
 * @date: 2020-07-15 22:12
 * @package: com.book.bookshop.config
 * @Description:
 */

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/public/**").addResourceLocations("file://D:image/Book");
    }
}
