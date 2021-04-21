package rest.menu.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rest.menu.model.Item;
import java.util.*;


@Repository("ItemDAO")
public class ItemDAOImpl implements ItemDAO{

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Item> allItems() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Item").list();
    }

    @Override
    public void add(Item item) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(item);
    }

    @Override
    public void delete(Item item) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(item);
    }

    @Override
    public void edit(Item item) {
        Session session = sessionFactory.getCurrentSession();
        session.update(item);
    }

    @Override
    public Item getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Item.class, id);
    }
}
