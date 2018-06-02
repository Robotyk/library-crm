package com.robotyk.service;

import com.robotyk.dao.BookDao;
import com.robotyk.dao.ReaderDao;
import com.robotyk.entity.Book;
import com.robotyk.entity.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Robotyk on 2018-06-02.
 */

@Service
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    ReaderDao readerDao;

    @Autowired
    BookDao bookDao;

    @Transactional
    @Override
    public List<Reader> getReaders() {
        return readerDao.getReaders();
    }

    @Transactional
    @Override
    public List<Book> getBooks() {
        return bookDao.getBooks();
    }

}