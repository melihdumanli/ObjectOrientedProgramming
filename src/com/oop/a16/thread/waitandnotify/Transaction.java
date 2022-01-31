package com.oop.a16.thread.waitandnotify;

public class Transaction {
    public static void main(String[] args) {
        Customer customer = new Customer();

            new Thread() {
                public void run() {
                    customer.withdraw();
                }
            }.start();

            new Thread() {
                public void run() {
                    customer.deposit();
                }
            }.start();
            System.out.println("Current Balance Is = " + customer.getBalance());

    }
}
