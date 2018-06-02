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
    List<Book> getBooks();
}
