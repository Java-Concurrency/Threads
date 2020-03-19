package com.kamaldwip.coding.concurrent.thread;

import static com.kamaldwip.coding.concurrent.thread.ThreadColor.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE+"Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN+"Hello from anonymous class thread");
            }

        }.start();

        Thread myRunnable = new Thread(new RunnableThread());
        myRunnable.start();

        Thread myAnonymousRunnable = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_CYAN+"Hello from anonymous runnable implementation");
            }
        });

        myAnonymousRunnable.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");
    }
}
