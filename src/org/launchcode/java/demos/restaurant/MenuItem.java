package org.launchcode.java.demos.restaurant;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = true;
    }
}
