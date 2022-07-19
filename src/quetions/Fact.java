import java.util.*;
public class Fact {

    public static void main(String[] args) {
        int a,fact=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value :");
        a=in.nextInt();
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
