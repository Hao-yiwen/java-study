package org.example;

public class ThreadTest implements Runnable{
    @Override
    public void run() {
        try {
            go();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    void go() throws InterruptedException {
        doMore();
    }

    private void doMore() throws InterruptedException {
        System.out.println("top o' the stack");
        Thread.sleep(1);
        System.out.println("top o' the stack");
        Thread.sleep(1);
        System.out.println("top o' the stack");
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable threadJob = new ThreadTest();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        Thread.sleep(1);
        System.out.println("back in main");
        Thread.sleep(1);
        System.out.println("back in main");
        Thread.sleep(1);
        System.out.println("back in main");

    }
}
