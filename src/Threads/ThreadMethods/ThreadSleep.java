// https://www.codewithharry.com/videos/java-tutorials-for-beginners-75/

package ThreadMethods;


class T1 extends Thread{
    public void run()
    {
        String n=Thread.currentThread().getName();
        int i=0;
       try{
        while(i<50)
        {
         System.out.println(n);
         Thread.sleep(1000);
      i++;
        }
       }catch(InterruptedException e)
       {
        System.out.println(e);
       }
    // String n=Thread.currentThread().getName();
    // int i=0;
 
    // while(i<50)
    // {
    //     try{
    //  System.out.println(n);
    //  Thread.sleep(1000);
    //  i++;
    // }
    // catch(InterruptedException e)
    //    {
    //     System.out.println(e);
    //    }
    // }
    // }
}
public class ThreadSleep{
    public static void main(String[] args) {
        T1 t1=new T1();
        t1.start();
        
    }    
}