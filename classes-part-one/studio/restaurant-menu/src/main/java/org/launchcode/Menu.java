package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Menu {

private List<MenuItem> dishes;


    public Menu() {
        this.dishes = new ArrayList<>();
    }
    public void addDishes(MenuItem dish){
        dishes.add(dish);
    }

    public List<MenuItem> getDishes() {
        return dishes;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "dishes=" + dishes +
                '}';
    }
}
