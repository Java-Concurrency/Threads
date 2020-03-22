package com.kamaldwip.coding.concurrent.thread;

import static com.kamaldwip.coding.concurrent.thread.ThreadColor.ANSI_BLUE;

public class RunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE+"Hello from Runnable implementation.");
        try {
            Thread.sleep(4000);
            System.out.println(ANSI_BLUE+"myRunnable finished waiting for 4 seconds.");
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE+"myRunnable was Interrupted");
            return;
        }
    }
}
