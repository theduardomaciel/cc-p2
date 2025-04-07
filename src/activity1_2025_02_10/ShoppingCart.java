package activity1_2025_02_10;

import java.util.ArrayList;

public class ShoppingCart {
    private int customerId;
    private ArrayList<Product> productsList;

    public ShoppingCart(int customerId) {
        this.customerId = customerId;
        this.productsList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productsList.add(product);
    }

    public void removeProduct(Product product) {
        productsList.add(product);
    }

    public String getContents() {
        StringBuilder contents = new StringBuilder();
        for (Product product : productsList) {
            contents.append("→ ").append(product.getName()).append(" - $").append(product.getPrice()).append("\n");
        }
        return contents.toString();
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getItemCount() {
        return productsList.size();
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : productsList) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
