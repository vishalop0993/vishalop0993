package main.conncurrent.lock;
/**
 * Lock vs Syncronisation
 * 1:- try -lock concept
 * 2:- we can lock in one method and unlock in another method using Lock Interface
 * 3:- We can multiple accuire lock in any order and close it in any order
 */

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static ReentrantLock lock = new ReentrantLock();

    public static void sharedResource() {
       // lock.lock();
        // access shared resource
        System.out.print(lock.isFair() +" : fairness policy ");
        if(lock.tryLock()) {
            try {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                }
            } finally {
                // always advisable to use unlock in finally
                lock.unlock();
            }
        }
        else
        {
            System.out.println(Thread.currentThread().getName() + " is in waiting state..");
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> sharedResource());
        t1.start();
        Thread t2 = new Thread(() -> sharedResource());
        t2.start();
        Thread t3 = new Thread(() -> sharedResource());
        t3.start();
        Thread t4 = new Thread(() -> sharedResource());
        t4.start();


    }
}
