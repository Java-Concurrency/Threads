package com.kamaldwip.coding.concurrent.thread;

import static com.kamaldwip.coding.concurrent.thread.ThreadColor.ANSI_RED;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_RED+"Hello from named class thread");
    }
}
