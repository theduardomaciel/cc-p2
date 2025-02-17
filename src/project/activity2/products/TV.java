package project.activity2.products;

import project.activity2.Product;

public class TV extends Product {
    private String inches;

    public TV(String brand, double price, String inches) {
        super(brand, price);
        this.inches = inches;
    }

    public String getInches() {
        return inches;
    }

    public String toString() {
        return "TV: " + getBrand() + " " + inches + " $" + getPrice();
    }
}
