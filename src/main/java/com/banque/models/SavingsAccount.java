package main.java.com.banque.models;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Les retraits ne sont pas autorisés sur un compte d'épargne.");
    }
}

