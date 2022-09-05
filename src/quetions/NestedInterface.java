interface A{
    void m1();
    interface B{
        void m2();
    }
}

public class Nestedinterface implements A.B{
public void m2(){
    System.out.println("jack");
}
public static void main(String args[])
{
    A.B obj=new Nestedinterface();
    obj.m2();
}
}