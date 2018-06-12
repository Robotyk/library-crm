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

    private final ReaderDao readerDao;
    private final BookDao bookDao;

    @Autowired
    public LibraryServiceImpl(ReaderDao readerDao, BookDao bookDao) {
        this.readerDao = readerDao;
        this.bookDao = bookDao;
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
    public void deleteReader(Integer id) {
        readerDao.deleteReader(id);
    }

    @Transactional
    @Override
    public List<Reader> getAllReaders() {
        return readerDao.getAllReaders();
    }

    @Transactional
    @Override
    public List<Book> getReaderBooks(Integer id) {
        return readerDao.getReaderBooks(id);
    }

    @Transactional
    @Override
    public void borrowBook(Integer readerId, Integer bookId) {
        readerDao.borrowBook(readerId, bookId);
    }

    @Transactional
    @Override
    public void returnBook(Integer readerId, Integer bookId) {
        readerDao.returnBook(readerId, bookId);
    }

    @Transactional
    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Transactional
    @Override
    public Book getBook(Integer id) {
        return bookDao.getBook(id);
    }

    @Transactional
    @Override
    public void deleteBook(Integer id) {
        bookDao.deleteBook(id);
    }

    @Transactional
    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Transactional
    @Override
    public List<Book> getUnoccupiedBooks() {
        return bookDao.getUnoccupiedBooks();
    }
}
