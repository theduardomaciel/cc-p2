package project.activity20250212.products;

import project.activity20250212.Product;

public class Stove extends Product {
    private int burners;

    public Stove(String brand, double price, int burners) {
        super(brand, price);
        this.burners = burners;
    }

    public int getBurners() {
        return burners;
    }
}
