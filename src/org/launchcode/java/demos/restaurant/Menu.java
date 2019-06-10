package org.launchcode.java.demos.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu() {
        this.items = new ArrayList<>();
        this.lastUpdated = new Date();
    }
}
