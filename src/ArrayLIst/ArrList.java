import java.util.*;
public class ArrList{
    public static void main(String args[])
    {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(12);
        l1.add(1);
        l1.add(2);
        l1.add(192);
        l1.add(72);
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
    }
}