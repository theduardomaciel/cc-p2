package project.activity1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void clearConsole(){
        // Gambiarra para limpar o console porque nada que eu tentei funcionou
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    private static void printMenu() {
        System.out.println("🛒 Bem-vindo ao seu carrinho de compras!");
        System.out.print("👤 Insira o ID do cliente: ");
    }

    public static void main(String[] args) {

        /*
        * Exemplos de produtos:
        * Product product1 = new Product("Maçã", 4.99);
        * Product product2 = new Product("Banana", 3.59);
        * Product product3 = new Product("Laranja", 5.79);
        * */

        Scanner scanner = new Scanner(System.in);

        printMenu();

        int customerId = -1;

        while (customerId == -1) {
            try {
                customerId = scanner.nextInt();

                if (customerId < 0) {
                    clearConsole();
                    System.out.println("❌ Erro: insira um valor positivo.");
                    printMenu();
                    customerId = -1;
                }
            } catch (InputMismatchException e) {
                clearConsole();
                System.out.println("❌ Erro: insira um valor válido (número inteiro).");
                printMenu();
                return;
            }
        }

        ShoppingCart cart = new ShoppingCart(customerId);

        while (true) {
            System.out.println("➕ Adicione itens ao carrinho: (decimais devem usar vírgulas, envie 's' para terminar)");
            System.out.print("✏️ Nome do produto: ");
            String name = scanner.next();

            if (name.equalsIgnoreCase("s")) {
                break;
            }
            double price = -1;

            while (price == -1) {
                try {
                    System.out.print("💸 Preço do produto: ");
                    price = scanner.nextDouble();

                    if (price < 0) {
                        clearConsole();
                        System.out.println("❌ Erro: insira um valor positivo.");
                        price = -1;
                    }
                } catch (InputMismatchException e) {
                    clearConsole();
                    System.out.println("❌ Erro: insira um valor válido (número nulo ou positivo)");
                    scanner.next();
                }
            }

            Product product = new Product(name, price);
            cart.addProduct(product);
        }

        System.out.println("🧑 ID do cliente: " + cart.getCustomerId());
        System.out.println("\n== Resumo do carrinho ==");
        System.out.println("🛒 Quantidade de itens no carrinho: " + cart.getItemCount());
        System.out.printf("💵 Preço total: $%.2f\n", cart.getTotalPrice());
        System.out.println("🗒️ Conteúdos do carrinho:");
        System.out.println(cart.getContents());
    }
}
