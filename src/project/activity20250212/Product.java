package project.activity20250212;

public class Product {
    private String brand;
    private double price;

    public Product(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
