package ThreadMethods;

class A extends Thread{
    public void run()
    {
        // System.out.println("Chating");
        int i=0;
       while(i<50)
       {
        System.out.println("Chating");
        i++;
       }
    }
}
class B extends Thread{
    public void run()
    {
        int i=0;
        while(i<50)
        {
        System.out.println("Programming");
        i++;
        }
    }
}
public class Join{
    public static void main(String[] args) {
        A t1=new A();
        B t2=new B();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}