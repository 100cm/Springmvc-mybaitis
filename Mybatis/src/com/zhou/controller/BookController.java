package com.zhou.controller;

import com.zhou.model.Books;
import com.zhou.service.BookService;
import com.zhou.service.impl.BookServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by icepoint on 8/18/15.
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
   @RequestMapping("/test")
    public void test(){
        Books book=new Books();
        book.setName("十万个为什么");
        book.setUserid(1);
        book.setAbout("一本书");
        bookService.insertBooks(book);
    }
    //借阅书籍
    @RequestMapping("/borrow_books")
    public String borrow(){


        return "book_view/borrow_books";
    }

    //归还书籍
    @RequestMapping("/return_books")
    public String return_books(){

        return "book_view/return_books";
    }
    //读者类型管理
    @RequestMapping("/reader_type")
    public String reader_type(){

        return "reader_view/reader_type";
    }
    //读者档案
    @RequestMapping("/reader_profile")
    public String reader_profile(){

        return "reader_view/reader_profile";
    }
    //读者统计
    @RequestMapping("/reader_count")
    public String reader_count(){

        return "reader_view/reader_count";
    }
    //图书类型
    @RequestMapping("/book_type")
    public  String book_type(){

        return "/book_view/book_type";
    }
    //图书档案
    @RequestMapping("/book_profile")
    public String book_profile(){


        return "/book_view/book_profile";
    }

   //借阅排行
    @RequestMapping("/top_books")
    public  String top_books(){

        return "/top_view/top_books";
    }
    //读者排行
    @RequestMapping("/top_readers")
    public String top_readers(){

        return "top_view/top_readers";
    }
    //查询借阅
    @RequestMapping("search_book")
    public String search_book(){

        return "/search_view/search_book";
    }
    //查询档案
    @RequestMapping("search_borrow")
    public String search_borrow(){

        return "/search_view/search_borrow";
    }
    //学生权限
    @RequestMapping("/student")
    public String student(){

        return "/rule/student";
    }


}
