package com.robotyk.dao;

import com.robotyk.entity.Reader;

import java.util.List;

/**
 * Created by Robotyk on 2018-06-01.
 */

public interface ReaderDao {

    List<Reader> getReaders();
    void addReader(String firstName, String lastName, String email);
}
