package com.app.dao;

import com.app.model.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vpestov
 * Date: 3/11/13
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class DaoImpl extends HibernateDaoSupport implements Dao{
    @Override
    public User loadById (long id) {
        final Query query = getSessionFactory().getCurrentSession().createQuery("from User u where u.id=:userId")
                .setParameter("userId",id);
        return (User) query.list().get(0);
    }

    @Override
    public List<User> loadAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(User u) {
        getHibernateTemplate().delete(u);
    }

    @Override
    public void save(User u) {
        getHibernateTemplate().save(u);
    }
}
