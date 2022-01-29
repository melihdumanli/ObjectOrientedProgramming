package com.oop.a16.thread.locking;

public class First extends Thread{
    private Testable t;

    public First(Testable t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.print(10);
    }
}
