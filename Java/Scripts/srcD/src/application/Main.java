package application;

import entities.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Register Account!");

        System.out.print("Enter account number: "); int accNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: "); String accName = sc.nextLine();
        Account account = new Account(accNum, accName);

        account.initialDeposit();

        System.out.print("\nAccount data: " + account);

        System.out.print("\nEnter a deposit value: "); double value = sc.nextDouble();
        account.addBalance(value);

        System.out.print("\nUpdate account data: " + account);

        System.out.print("\nEnter a withdraw value: "); value = sc.nextDouble();
        account.withdrawBalance(value);

        System.out.print("\nUpdate account data: " + account);









    }
}