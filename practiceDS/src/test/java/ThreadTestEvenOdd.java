public class ThreadTestEvenOdd {

    public static void main(String args[])
    {
        System.out.print("s");
        ThreadTestEvenOdd threadTestEvenOdd  = new ThreadTestEvenOdd();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadTestEvenOdd.
                        printOdd();
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                    threadTestEvenOdd.printEven();
            }
        });
             t1.start();
             t2.start();


    }
    int num = 1;
    public void printOdd()
    {
        synchronized (this)
        {
            while(num<50)
            {
                if(num %2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println( " Thread 1  " + num);
                }
                num ++;
                notify();

            }

        }

    }



    public void printEven()
    {
        synchronized (this)
        {
            while(num<50)
            {
                if(num %2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println( " Thread 2  " + num);
                }
                num ++;
                notify();

            }

        }

    }



}
