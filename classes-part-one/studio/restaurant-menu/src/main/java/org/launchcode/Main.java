package org.launchcode;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem spaghetti = new MenuItem("Spaghetti", 12.99, "A classic favorite for tastes of every age. Our traditional Italian Spaghetti and Meatballs is served with tender spaghetti noodles smothered with a lightly spiced, crushed tomato marinara sauce and the juicy goodness of five large, flavorful meatballs then topped with a generous sprinkling of shredded parmesan cheese.","Dinner");
        MenuItem surfAndTurf = new MenuItem("Surf and Turf", 65.00, "Succulent Steak served with Fresh lobster from Maine","Dinner");
        Menu todaysMenu = new Menu();
        todaysMenu.addDishes(surfAndTurf);
        todaysMenu.addDishes(spaghetti);
        spaghetti.setAvailability(true);
        surfAndTurf.setAvailability(false);
        System.out.println(spaghetti.isAvailability());
        System.out.println(surfAndTurf.isAvailability());
        List<MenuItem> allDishes = todaysMenu.getDishes();
        for (MenuItem item : allDishes ) {
            System.out.println(item);
        }
        }

    }

