package com.zhou.service.impl;

import com.zhou.dao.BooksMapper;
import com.zhou.dao.UserDAO;
import com.zhou.model.Books;
import com.zhou.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

/**
 * Created by icepoint on 8/18/15.
 */
@Service
public class BookServiceImp implements BookService {
    @Autowired
    @Qualifier("booksMapper")
    private BooksMapper booksMapper;
    @Override


    public int insertBooks(Books book) {
        return booksMapper.insert(book);
    }
}
