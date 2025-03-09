package project.activity20250226;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(
            6423424,
            "Fulaninho da Silva",
            2300.0,
            1500.0
        );

        System.out.println("Dados iniciais da conta:");
        account.print();

        // 2300 - 500 = 1800, portanto, o saldo é suficiente
        try {
            account.withdraw(500.0);
            System.out.println("Saldo: " + account.getBalance() + "\n");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "\n");
        }

        // 1800 - 1700 = 100, portanto, o saldo é suficiente, porém, o valor de saque EXCEDE o limite.
        // Uma exceção será lançada.
        try {
            account.withdraw(1700.0);
            System.out.println("Saldo: " + account.getBalance() + "\n");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "\n");
        }

        // 1800 - 1200 = 600, portanto, o saldo é suficiente
        try {
            account.withdraw(1200.0);
            System.out.println("Saldo: " + account.getBalance() + "\n");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "\n");
        }

        // 600 - 700 = -100, portanto, o saldo NÃO é suficiente
        // Uma exceção será lançada.
        try {
            account.withdraw(700);
            System.out.println("Saldo: " + account.getBalance() + "\n");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "\n");
        }

        account.deposit(100.0);
        System.out.println("Saldo: " + account.getBalance() + "\n");

        // 600 (+100) - 700 = 0, portanto, o saldo é suficiente
        try {
            account.withdraw(700.0);
            System.out.println("Saldo: " + account.getBalance() + "\n");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "\n");
        }
    }
}
