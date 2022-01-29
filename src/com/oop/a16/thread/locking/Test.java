package com.oop.a16.thread.locking;

public class Test {
    public static void main(String[] args) {
        Testable table = new SynchedTable();
        First first = new First(table);
        Second second = new Second(table);

        first.start();
        second.start();


    }
}
