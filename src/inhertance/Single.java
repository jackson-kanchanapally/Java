class A{
    int a=10;
    int b=5;
}
class B extends A{
    int sum=a+b;
}

public class Single {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.sum);
    }
}
