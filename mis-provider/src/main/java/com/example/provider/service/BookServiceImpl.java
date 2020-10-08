package com.example.provider.service;

import com.example.provider.bean.Book;
import com.example.provider.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl  implements  BookService {

    @Autowired(required =  false)
    private BookMapper bookMapper;

    @Override
    public Book getBook(Integer id) {
        return  bookMapper.selectByPrimaryKey(id);
    }
}
