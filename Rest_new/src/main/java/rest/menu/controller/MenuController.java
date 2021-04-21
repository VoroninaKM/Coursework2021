package rest.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import rest.menu.model.Item;
import rest.menu.model.Place;
import rest.menu.service.*;
import rest.menu.dao.*;

import java.util.List;

@Controller
public class MenuController {

    private MenuService menuService;
    @Autowired
    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }

    private PlaceService placeService;
    @Autowired
    public void setMenuService(PlaceService placeService) {
        this.placeService = placeService;
    }


    @RequestMapping(value = "/places", method = RequestMethod.GET)
    public ModelAndView allPlaces() {
        List<Place> places = placeService.allItems();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("places.jsp");
        modelAndView.addObject("placesList", places);
        return modelAndView;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView Login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login.jsp");
        return modelAndView;
    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public ModelAndView allItems() {
        List<Item> items = menuService.allItems();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("menu.jsp");
        modelAndView.addObject("itemsList", items);
        return modelAndView;
    }

    /*@RequestMapping(method = RequestMethod.GET)
    public ModelAndView Menu() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("menu.jsp");
        return modelAndView;
    }*/

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage.jsp");
        return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPage(@PathVariable("id") int id) {
        Item item = menuService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage.jsp");
        modelAndView.addObject("item", item);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editMenu(@ModelAttribute("item") Item item, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        menuService.edit(item);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage.jsp");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addFilm(@ModelAttribute("item") Item item) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        menuService.add(item);
        return modelAndView;
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteFilm(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        Item item = menuService.getById(id);
        menuService.delete(item);
        return modelAndView;
    }

}
