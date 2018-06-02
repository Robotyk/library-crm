package com.robotyk.dao;

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
    public List<Reader> getReaders() {
        Session session = sessionFactory.getCurrentSession();
        Query<Reader> query = session.createQuery("from Reader order by lastName", Reader.class);
        return query.getResultList();
    }

    @Override
    public void addReader(Reader reader) {
        Reader newReader = new Reader(reader.getFirstName(), reader.getLastName(), reader.getEmail());
        Session session = sessionFactory.getCurrentSession();
        session.save(newReader);
    }
}
