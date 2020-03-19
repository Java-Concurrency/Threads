package com.kamaldwip.coding.concurrent.thread;

import static com.kamaldwip.coding.concurrent.thread.ThreadColor.ANSI_GREEN;
import static com.kamaldwip.coding.concurrent.thread.ThreadColor.ANSI_PURPLE;

public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE+"Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN+"Hello from anonymous class thread");
            }

        }.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");
    }
}
