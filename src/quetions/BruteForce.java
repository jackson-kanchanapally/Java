import java.util.*;
public class BruteForce {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your four digit password : ");
        int a=in.nextInt();
        for(int i=0000;i<10000;i++)
        {
            if(i==a)
            {
                System.out.println("your Password is "+i);
                break;
            }
        
        }
    }
}
