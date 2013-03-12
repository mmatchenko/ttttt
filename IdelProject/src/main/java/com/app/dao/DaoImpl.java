package com.app.dao;

import com.app.model.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Repository
public class DaoImpl {

    private SessionFactory sessionFactory;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public <T extends Serializable> T getById(Class<T>entityClass,long id) {
        return (T) getSession().get(entityClass,id);
    }

    @Transactional
    public <T extends Serializable> List<T> getAll() {
        final Query query = getSession().createQuery("");
        return query.list();
    }

    @Transactional
    public <T extends Serializable> void delete(T u) {
        getSession().delete(u);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public <T extends Serializable> void save(T u) {
        getSession().save(u);
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
