package com.robotyk.service;

import com.robotyk.entity.Book;
import com.robotyk.entity.Reader;

import java.util.List;

/**
 * Created by Robotyk on 2018-06-02.
 */
public interface LibraryService {

    List<Reader> getReaders();
    void addReader(Reader reader);
    Reader getReader(Integer id);
    List<Book> getReaderBooks(Integer id);
    void borrowBook(Integer readerId, Integer bookId);

    List<Book> getAllBooks();
    void addBook(Book book);
    List<Book> getUnoccupiedBooks();
}
