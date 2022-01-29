package com.oop.a16.threadsynchronization;

public class UnsynchedTable implements Testable{
    public void print(int num){
        for (int i = 0; i < 5; i++) {
            System.out.println(num*i);
            try {
                Thread.sleep(400);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
