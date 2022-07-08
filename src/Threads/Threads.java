
// Threads allows a program to operate more efficiently by doing multiple things at the same time.

// Threads can be used to perform complicated tasks in the background without interrupting the main program.

// https://www.codewithharry.com/videos/java-tutorials-for-beginners-70/

class Thread1 extends Thread{

    public void run()
    {
        // System.out.println("Chating");
        int i=0;
       while(i<500)
       {
        System.out.println("Chating");
        i++;
       }
    }
}
class Thread2 extends Thread{
    public void run()
    {
        int i=0;
        while(i<500)
        {
        System.out.println("Programming");
        i++;
        }
    }
}
public class Threads{
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start(); // start() method is used to start the thread
        t2.start();
    }
}