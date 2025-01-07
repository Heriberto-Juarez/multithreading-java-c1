package com.heribertojuarezjaimes.main;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            // Code that will run in a new thread.
            System.out.println("Hello, Im inside the thread that was started: " + Thread.currentThread().getName());
        });

        thread.setName("My Thread #1 - IntelliJ");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before starting a new thread");
        thread.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " after starting a new thread");

        Thread.sleep(10000);

    }


}
