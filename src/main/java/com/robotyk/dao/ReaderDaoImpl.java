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
 * Created by Robotyk on 2018-06-01.
 */

@Repository
public class ReaderDaoImpl implements ReaderDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Reader> getAllReaders() {
        Session session = sessionFactory.getCurrentSession();
        Query<Reader> query = session.createQuery("from Reader order by lastName", Reader.class);
        return query.getResultList();
    }

    @Override
    public void addReader(Reader reader) {
        if (reader.getBooksAmount() == null) {
            reader.setBooksAmount(0);
        }
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(reader);
    }

    @Override
    public void deleteReader(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Reader reader = session.get(Reader.class, id);
        List<Book> readerBooks = reader.getBooks();
        readerBooks.forEach(book -> book.setReader(null));
        session.delete(reader);
    }

    @Override
    public Reader getReader(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Reader.class, id);
    }

    @Override
    public List<Book> getReaderBooks(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Reader reader = session.get(Reader.class, id);
        return reader.getBooks();
    }

    @Override
    public void borrowBook(Integer readerId, Integer bookId) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.get(Book.class, bookId);
        Reader reader = session.get(Reader.class, readerId);
        book.setReader(reader);
        reader.incrementBooksAmount();
    }

    @Override
    public void returnBook(Integer readerId, Integer bookId) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.get(Book.class, bookId);
        Reader reader = session.get(Reader.class, readerId);
        book.setReader(null);
        reader.decrementBooksAmount();
    }
}
