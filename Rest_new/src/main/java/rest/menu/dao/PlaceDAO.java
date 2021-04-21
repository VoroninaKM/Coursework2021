package rest.menu.dao;

import rest.menu.model.Place;
import java.util.List;

public interface PlaceDAO {
    List<Place> allItems();
    void add(Place place);
    void delete(Place place);
    void edit(Place place);
    Place getById(int place);
}
