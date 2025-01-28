package main.java.com.banque.models;

public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le montant du dépôt doit être positif.");
        }
        balance += amount;
        System.out.println(amount + "€ déposé. Nouveau solde : " + balance + "€");
    }

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(double amount);
}
