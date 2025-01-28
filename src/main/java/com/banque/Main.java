package main.java.com.banque;

import main.java.com.banque.models.BankAccount;
import main.java.com.banque.models.CurrentAccount;
import main.java.com.banque.models.SavingsAccount;




public class Main {
    public static void main(String[] args) {
        BankAccount currentAccount = new CurrentAccount("CA12345", 1000.0);
        BankAccount savingsAccount = new SavingsAccount("SA12345", 2000.0);

        // Opérations sur le compte courant
        currentAccount.deposit(500.0);
        System.out.println("Solde compte courant : " + currentAccount.getBalance());
        currentAccount.withdraw(300.0);
        System.out.println("Solde après retrait : " + currentAccount.getBalance());

        // Opérations sur le compte d'épargne
        savingsAccount.deposit(1000.0);
        System.out.println("Solde compte épargne : " + savingsAccount.getBalance());

        try {
            savingsAccount.withdraw(200.0);
        } catch (UnsupportedOperationException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
