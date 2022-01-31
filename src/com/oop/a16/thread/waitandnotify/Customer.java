package com.oop.a16.thread.waitandnotify;

import java.util.Scanner;

public class Customer {
    private double balance = 10_000.00;
    Scanner scanner = new Scanner(System.in);
    private double amount;

    synchronized public void withdraw(){
        System.out.println("Please enter the amount you want to withdraw: ");
        this.amount = scanner.nextDouble();
        if(this.balance<this.amount){
            System.out.println("You don't have enough money you looser.");
            System.out.println("Current balance is = " + getBalance() );
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.balance -= this.amount;
        System.out.println("Mission Accomplished");
    }

    synchronized public void deposit(){
        System.out.println("Please enter the amount you want to deposit");
        this.amount = scanner.nextDouble();
        this.balance +=amount;
        System.out.println("Mission Accomplishes You Lucky Bitch :)");
        System.out.println("Current balance is = " + getBalance());
        notify();
    }

    public double getBalance(){
        return this.balance;
    }
}
