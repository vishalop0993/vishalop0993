package main.conncurrent.lock;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
    public static void main(String args[]) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(3);

                bq.put("Vishal001");
        bq.put("Vishal002");
        bq.put("Vishal003");
        System.out.println(bq);
        bq.take();
        bq.put("Vishal004");
      //  bq.take();

        System.out.println(bq);





    }
}
