package model;

import java.util.List;
import java.util.ArrayList;

public class Menu {
    private List<Item> items;

    public Menu() {
        items =new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item getItemById(int id) {
        for(Item x: items) {
            if(x.getId() == id) {
                return x;
            }
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Item> getVegItems() {
        List<Item> veg = new ArrayList<>();

        for(Item x: items) {
            if(x.isVeg()) {
                veg.add(x);
            }
        }

        return veg;
    }

    public List<Item> getVegItems() {
        List<Item> veg = new ArrayList<>();

        for(Item x: items) {
            if(!x.isVeg()) {
                veg.add(x);
            }
        }

        return veg;
    }
}