package com.kamaldwip.coding.concurrent.thread;

import static com.kamaldwip.coding.concurrent.thread.ThreadColor.ANSI_RED;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_RED+"Hello from "+currentThread().getName());
        try {
            Thread.sleep(3000);
            System.out.println(ANSI_RED+currentThread().getName()+"Finished waiting for 3 seconds.");
        } catch (InterruptedException e) {
            System.out.println(ANSI_RED+"Another thread was interrupted.");
            return;
        }
        System.out.println(ANSI_RED+currentThread().getName()+"Finished execution.");
    }
}
