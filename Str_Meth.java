public class Str_Meth {
        public static void main(String[] args) {
            Thread t1 = new MyThread("Thread 1");
            Thread t2 = new MyThread("Thread 2");
            t1.start();
            t2.start();
            try 
            {Thread.sleep(2000);} 
            catch (InterruptedException e) 
            { e.printStackTrace(); }
            t1.interrupt();
            Thread.yield();
            try 
            {   t1.join();
                t2.join();} 
            catch (InterruptedException e) 
            { e.printStackTrace(); }
            System.out.println("Main thread finished");}
        static class MyThread extends Thread {
            private String name;
            public MyThread(String name)
             { this.name = name; }
            public void run() {
                System.out.println(name + " started");
                for (int i = 0; i < 5; i++) {
                    System.out.println(name + ": " + i);
                    try 
                    { Thread.sleep(500); } 
                    catch (InterruptedException e) 
                    {   System.out.println(name + " interrupted");
                        return;}
                }
                System.out.println(name + " finished");
            }
        }
    }

