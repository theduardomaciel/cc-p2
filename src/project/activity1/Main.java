package project.activity1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Maçã", 4.99);
        Product product2 = new Product("Banana", 3.59);
        Product product3 = new Product("Laranja", 5.79);

        ShoppingCart cart = new ShoppingCart(1);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        System.out.println("🧑 ID do cliente: " + cart.getCustomerId());
        System.out.println("🛒 Quantidade de itens no carrinho: " + cart.getItemCount());
        System.out.printf("💵 Preço total: $%.2f\n", cart.getTotalPrice());
        System.out.println("🗒️ Conteúdos do carrinho:");
        System.out.println(cart.getContents());
    }
}
