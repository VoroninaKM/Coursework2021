package rest.menu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rest.menu.model.Item;
import rest.menu.dao.ItemDAO;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    private ItemDAO itemDAO;

    @Autowired
    public void setMenuService(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }

    @Override
    @Transactional
    public List<Item> allItems() {
        return itemDAO.allItems();
    }

    @Override
    @Transactional
    public void add(Item item) {
        itemDAO.add(item);
    }

    @Override
    @Transactional
    public void delete(Item item) {
        itemDAO.delete(item);
    }

    @Override
    @Transactional
    public void edit(Item item) {
        itemDAO.edit(item);
    }

    @Override
    @Transactional
    public Item getById(int id) {
        return itemDAO.getById(id);
    }
}
