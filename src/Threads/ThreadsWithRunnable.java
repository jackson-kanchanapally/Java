class ThreadRun1 implements Runnable{
    public void run()
    {
        int i=0;
        while(i<8)
        {
            System.out.println("Hey jackson");
        }
    }
}
class ThreadRun2 implements Runnable{
    public void run()
    {
        int i=0;
        while(i<8)
        {
            System.out.println("Hey Mintu");
        }
    }
}

public class ThreadsWithRunnable {
    public static void main(String[] args) {

        // When using Runnable Interface we cannot directly use the start() method on the object 

        // So an object is created from Thread class and the start() method is used on that object 

        ThreadRun1 t1=new ThreadRun1();
        Thread r1=new Thread(t1);

        ThreadRun2 t2=new ThreadRun2();
        Thread r2=new Thread(t2);

        r1.start();
        r2.start();
    }
}
