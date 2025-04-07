package activity4_2025_02_26;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private double withdrawLimit;

    public Account(int accountNumber, String accountHolder, double balance, double withdrawLimit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depósito de R$" + amount + " realizado com sucesso!");
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("Saque de R$" + amount + " não realizado: " + "Saldo insuficiente");
        } else if (amount > withdrawLimit) {
            throw new IllegalArgumentException("Saque de R$" + amount + " não realizado: " + "O valor de saque excede o limite estabelecido.");
        } else {
            balance -= amount;
            System.out.println("Saque de R$" + amount + " realizado com sucesso!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void print() {
        System.out.println("Número da Conta: " + accountNumber);
        System.out.println("Proprietário: " + accountHolder);
        System.out.println("Saldo: " + "R$" + balance + "\n");
    }
}
