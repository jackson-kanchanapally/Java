import java.util.*;

public class Fact {

    public static void main(String[] args) {
        int val, fact = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value :");
        val = in.nextInt();
        for (int i = 1; i <= val; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of "+val+" is "+fact);
    }
}
