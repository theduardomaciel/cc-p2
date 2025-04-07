package activity2_2025_02_12.products;

import activity2_2025_02_12.Product;

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
