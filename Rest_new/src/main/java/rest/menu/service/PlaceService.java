package rest.menu.service;

import rest.menu.model.Place;
import java.util.List;

public interface PlaceService {
    List<Place> allItems();
    void add(Place place);
    void delete(Place place);
    void edit(Place place);
    Place getById(int id);
}
