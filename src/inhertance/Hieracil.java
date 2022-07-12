class p{
    int a=10,b=5;
}
class A extends p{
    int sum =a+b;
}
class B extends p{
    int sub=a-b;
}
public class Hieracil {
    public static void main(String[] args) {
        A add=new A();
        B s=new B();
        System.out.println(add.sum);
        System.out.println(s.sub);
    }
}