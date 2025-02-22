package corejava;

import java.util.concurrent.atomic.AtomicInteger;

class Counter1 {
    int count;
    public synchronized void increment() {
        count++;
    }
}
class Counter {
    AtomicInteger  count = new AtomicInteger();
    public synchronized void increment() {
        count.incrementAndGet();
    }
}
public class SyncDemo {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++)
                    c.increment();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++)
                    c.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count " + c.count);
    }
}
