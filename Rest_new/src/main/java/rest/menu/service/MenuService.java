package rest.menu.service;

import rest.menu.model.Item;
import java.util.List;

public interface MenuService {
    List<Item> allItems();
    void add(Item item);
    void delete(Item item);
    void edit(Item item);
    Item getById(int id);
}
