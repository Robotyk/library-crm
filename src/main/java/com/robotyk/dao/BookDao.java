package com.robotyk.dao;

import com.robotyk.entity.Book;
import java.util.List;

/**
 * Created by Robotyk on 2018-06-02.
 */

public interface BookDao {

    void addBook(Book book);
    Book getBook(Integer id);
    void deleteBook(Integer id);
    List<Book> getAllBooks();
    List<Book> getUnoccupiedBooks();
}
