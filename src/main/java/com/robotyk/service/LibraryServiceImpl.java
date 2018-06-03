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
    private
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
    public void addReader(Reader reader) {
        readerDao.addReader(reader);
    }

    @Transactional
    @Override
    public Reader getReader(Integer id) {
        return readerDao.getReader(id);
    }

    @Transactional
    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Transactional
    @Override
    public List<Book> getBooks() {
        return bookDao.getBooks();
    }

}
