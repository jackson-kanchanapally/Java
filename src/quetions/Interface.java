interface A{
    void name();
}
interface B{
    void came();
}

public class Interface implements A,B{
    public void name()
    {
        System.out.println("hja");
    }
    public void came(){
        System.out.println("asfd");
    }
    public static void main(String args[])
    {
        Interface obj=new Interface();
        obj.came();
        obj.name();
    }
}
