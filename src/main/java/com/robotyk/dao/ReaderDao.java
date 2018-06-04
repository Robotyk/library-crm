package com.robotyk.dao;

import com.robotyk.entity.Book;
import com.robotyk.entity.Reader;

import java.util.List;

/**
 * Created by Robotyk on 2018-06-01.
 */

public interface ReaderDao {

    List<Reader> getAllReaders();
    Reader getReader(Integer id);
    void addReader(Reader reader);
    void deleteReader(Integer id);
    List<Book> getReaderBooks(Integer id);
    void borrowBook(Integer readerId, Integer bookId);
    void returnBook(Integer readerId, Integer bookId);
}
