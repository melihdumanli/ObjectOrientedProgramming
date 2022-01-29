package com.oop.a16.threadsynchronization;

public class Second extends Thread{
    private Testable t;

    public Second(Testable t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.print(57);
    }
}
