package rest.menu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rest.menu.dao.PlaceDAO;
import rest.menu.model.Place;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService{

    private PlaceDAO placeDAO;

    @Autowired
    public void setMenuService(PlaceDAO placeDAO) {
        this.placeDAO = placeDAO;
    }

    @Override
    @Transactional
    public List<Place> allItems() {
        return placeDAO.allItems();
    }

    @Override
    @Transactional
    public void add(Place place) {
        placeDAO.add(place);
    }

    @Override
    @Transactional
    public void delete(Place place) {
        placeDAO.delete(place);
    }

    @Override
    @Transactional
    public void edit(Place place) {
        placeDAO.delete(place);
    }

    @Override
    @Transactional
    public Place getById(int id) {
        return placeDAO.getById(id);
    }
}
