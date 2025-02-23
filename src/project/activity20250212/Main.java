package project.activity20250212;

import project.activity20250212.Product;
import project.activity20250212.products.Refrigerator;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(1);
        Product refrigerator1 = new Refrigerator(
            "Electrolux",
            3247.21,
            200
        );

        cart.addProduct(refrigerator1);
        System.out.println(cart.getContents());

        System.out.println("Total price: " + cart.getTotalPrice());
    }
}
