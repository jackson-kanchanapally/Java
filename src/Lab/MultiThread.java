import java.util.*;

class EvenNum implements Runnable{
    public int a;
    public EvenNum(int a){
        this.a=a;
    }
    public void run(){
        System.out.println("Thread "+a+" is even "+a*a);
    }
}

class OddNum implements Runnable{
    public int a;
    public OddNum(int a)
    {
      this.a=a;
    }
    public void run(){
        System.out.println("Thread is  "+a+" is odd "+a*a*a);
    }
}

class Rand extends Thread{
    public void run()
    {
        int n=0;
        Random r=new Random();
        try{
            for(int i=0;i<10;i++)
            {
                n=r.nextInt(20);
                System.out.println("Generated number is "+n);
                if(n%2==0)
                {
                    Thread t1=new Thread(new EvenNum(n));
                    t1.start();
                }
                else{
                    Thread t2=new Thread(new OddNum(n));
                    t2.start();
                }
                Thread.sleep(1000);
                System.out.println("_________");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

public class MultiThread {
    public static void main(String args[])
    {
        Rand ra=new Rand();
        ra.start();
    }
}
