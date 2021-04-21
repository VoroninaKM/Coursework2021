package rest.menu.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rest.menu.model.Place;

import java.util.List;

@Repository("PlaceDAO")
public class PlaceDAOImpl implements PlaceDAO{

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {

        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Place> allItems() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Place").list();
    }

    @Override
    public void add(Place place
    ) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(place
        );
    }

    @Override
    public void delete(Place place
    ) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(place
        );
    }

    @Override
    public void edit(Place place
    ) {
        Session session = sessionFactory.getCurrentSession();
        session.update(place
        );
    }

    @Override
    public Place getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Place.class, id);
    }

}
