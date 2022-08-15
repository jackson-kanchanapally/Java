import java.util.*;

public class Bubble {

    public static void main(String args[])
    {
        int a[]=new int[5];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array values :");
        for(int i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                int temp;
                if(a[j]<a[i])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
