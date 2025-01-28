package main.java.com.banque;

import main.java.com.banque.models.BankAccount;
import main.java.com.banque.models.CurrentAccount;
import main.java.com.banque.models.SavingsAccount;


public class Main {
    public static void main(String[] args) {
        BankAccount currentAccount = new CurrentAccount("12345", 1000.0);
        currentAccount.deposit(500);
        currentAccount.withdraw(300);
        System.out.println("Solde du compte courant : " + currentAccount.getBalance() + "€");

        BankAccount savingsAccount = new SavingsAccount("67890", 2000.0);
        savingsAccount.deposit(1000);
        try {
            savingsAccount.withdraw(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Solde du compte épargne : " + savingsAccount.getBalance() + "€");
    }
}
