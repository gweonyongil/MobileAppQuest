package com.example.caucse.week5project;

/**
 * Created by caucse on 2017-09-25.
 */

public class MenuItem {
    String title;
    String where;
    String open;
    String ride;
    String call;

    public MenuItem(String title, String where, String open, String ride, String call) {
        this.title = title;
        this.where = where;
        this.open = open;
        this.ride = ride;
        this.call = call;
    }

    public String getCall() {
        return call;
    }

    public String getTitle() {
        return title;
    }

    public String getWhere() {
        return where;
    }

    public String getOpen() {
        return open;
    }

    public String getRide() {
        return ride;
    }
}
