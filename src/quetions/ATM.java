import java.util.*;

public class ATM {
    static int balance = 9312;

    public static void main(String[] args) {
        int opt;
        int amount = 0;
        boolean on = true;
        Scanner in = new Scanner(System.in);
        while (on) {
            System.out.println("1.Deposit\n2.Withdrwal\n3.Balance\n4.Exit");
            opt = in.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Amount to be deposited");
                    amount = in.nextInt();
                    balance = deposit(amount, balance);
                    break;
                case 2:
                    System.out.println("Amount to be Withdrawed :");
                    amount = in.nextInt();
                    balance = withdrawal(amount, balance);
                    break;
                case 3:
                    System.out.println("Your Balance : " + balance);
                    break;
                case 4:
                    on = false;
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }
        }

    }

    static int deposit(int amount, int balance) {
        if (amount >= balance) {
            System.out.println("Amount is more than your balance");
        } else {
            balance = balance - amount;
            System.out.println("Success Total funds: " + balance);
        }
        return balance;
    }

    static int withdrawal(int amount, int balance) {
        if (amount > balance) {
            System.out.println("Amount is more than your balance");
        } else {
            balance = balance - amount;
            System.out.println("Success Total funds: " + balance);
        }
        return balance;
    }
}