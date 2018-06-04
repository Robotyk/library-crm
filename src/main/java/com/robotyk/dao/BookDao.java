package com.robotyk.dao;

import com.robotyk.entity.Book;
import java.util.List;

/**
 * Created by Robotyk on 2018-06-02.
 */

public interface BookDao {

    List<Book> getAllBooks();
    void addBook(Book book);
}
