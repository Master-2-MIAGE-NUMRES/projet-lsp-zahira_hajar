package main.java.com.banque.models;

import main.java.com.banque.exceptions.AccountOperationException;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        throw new AccountOperationException("Les retraits ne sont pas autorisés sur un compte épargne.");
    }

}

