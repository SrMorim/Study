package entities;

import java.util.Scanner;

public class Account {
    private int accNum;
    private String accName;
    private double balance;

    //Constructors
    public Account(int accNum, String accName) {
        this.accNum = accNum;
        this.accName = accName;
    }

    //Getters & Setters
        //balance
    public double getBalance() {
        return balance;
    }
        //name
    public String getAccName() {
        return accName;
    }

    public void setAccName(String name) {
        accName = name;
    }

        //Number
    public int getAccNum() {
        return accNum;
    }

    //Functions
    public String toString() {
        return "Account " + getAccNum() + ", Holder: " + getAccName() + ", Balance: $" + getBalance();
    }

    public void addBalance(double value) {
        this.balance += value;
    }

    public void withdrawBalance(double value) {
        this.balance -= (value + 5);
    }

    public void initialDeposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is there an initial deposit? [y/n] "); String option = sc.next();

        if (option.equals("y")) {
            System.out.print("enter initial deposit value: "); double value = sc.nextDouble();
            addBalance(value);
        }
    }







}
