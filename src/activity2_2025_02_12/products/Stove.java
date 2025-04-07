package activity2_2025_02_12.products;

import activity2_2025_02_12.Product;

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
