package main.java.com.banque.models;

import main.java.com.banque.exceptions.AccountOperationException;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }


    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new AccountOperationException("Le montant du retrait doit être positif.");
        }
        if (amount > balance) {
            throw new AccountOperationException("Fonds insuffisants.");
        }
        balance -= amount;
        System.out.println(amount + "€ retiré. Nouveau solde : " + balance + "€");
    }


}
