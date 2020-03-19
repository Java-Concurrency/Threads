package com.kamaldwip.coding.concurrent.thread;

import static com.kamaldwip.coding.concurrent.thread.ThreadColor.ANSI_BLUE;

public class RunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE+"Hello from Runnable implementation.");
    }
}
