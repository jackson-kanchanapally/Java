import java.util.*;

public class QuickSort {
    public static void main(String args[]){
        String[] a={"F","B","D","C","A"};
        qs(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    static void qs(String arr[],int low,int hi)
    {
        int s=low;
        int e=hi;
        int mid=(low+hi)/2;
        String pivot=arr[mid];
        while(s<=e)
        {
            while(arr[s].compareToIgnoreCase(pivot)<0)
            {
                s++;
            }
            while(arr[e].compareToIgnoreCase(pivot)>0)
            {
                e--;
            }
            if(s<=e)
            {
                String temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        if ( low < e ) 
        qs(arr,low,e);
        if ( hi > s ) 
        qs(arr,s,hi);
    }
}
