package project.activity20250212;

import java.util.ArrayList;

public class ShoppingCart {
    private int customerID;
    private ArrayList productList;

    public ShoppingCart(int customerID) {
        this.customerID = customerID;
        this.productList = new ArrayList();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public String getContents() {
        String contents = "";
        for (int i = 0; i < productList.size(); i++) {
            contents += productList.get(i).toString() + "\n";
        }
        return contents;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getItemCount() {
        return productList.size();
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < productList.size(); i++) {
            totalPrice += ((Product) productList.get(i)).getPrice();
        }
        return totalPrice;
    }
}
