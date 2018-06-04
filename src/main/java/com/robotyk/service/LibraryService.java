package com.robotyk.service;

import com.robotyk.entity.Book;
import com.robotyk.entity.Reader;
import java.util.List;

/**
 * Created by Robotyk on 2018-06-02.
 */

public interface LibraryService {

    void addReader(Reader reader);
    Reader getReader(Integer id);
    void deleteReader(Integer id);
    List<Reader> getAllReaders();
    List<Book> getReaderBooks(Integer id);
    void borrowBook(Integer readerId, Integer bookId);
    void returnBook(Integer readerId, Integer bookId);

    void addBook(Book book);
    Book getBook(Integer id);
    void deleteBook(Integer id);
    List<Book> getAllBooks();
    List<Book> getUnoccupiedBooks();
}
