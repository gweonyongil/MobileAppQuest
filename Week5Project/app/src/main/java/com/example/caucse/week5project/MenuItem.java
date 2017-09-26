package com.example.caucse.week5project;

/**
 * Created by kyi42 on 2017-09-26.
 */

public class MenuItem {
    String menu;
    String price;

    public MenuItem(String menu, String price){
        this.menu = menu;
        this.price = price;
    }
    public String getMenu() {
        return menu;
    }

    public String getPrice() {
        return price;
    }
}
