class A{
    int a=10;
}
class B extends A{
    int b=5;
}
class C extends B{
    int sum=a+b;
}
public class MultiLevel {
    public static void main(String[] args) {
        C obj=new C();
        System.out.println(obj.sum);
    }
}
