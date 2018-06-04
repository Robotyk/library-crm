package com.robotyk.dao;

import com.robotyk.entity.Book;
import com.robotyk.entity.Reader;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by Robotyk on 2018-06-02.
 */

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void addBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(book);
    }

    @Override
    public Book getBook(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Book.class, id);
    }

    @Override
    public void deleteBook(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.get(Book.class, id);
        Reader reader = book.getReader();
        if (reader != null) {
            reader.decrementBooksAmount();
        }
        session.delete(book);
    }

    @Override
    public List<Book> getAllBooks() {
        Session session = sessionFactory.getCurrentSession();
        Query<Book> query = session.createQuery("from Book order by genre, author", Book.class);
        return query.getResultList();
    }

    @Override
    public List<Book> getUnoccupiedBooks() {
        Session session = sessionFactory.getCurrentSession();
        Query<Book> query = session.createQuery("from Book where reader is null order by genre, author", Book.class);
        return query.getResultList();
    }
}
