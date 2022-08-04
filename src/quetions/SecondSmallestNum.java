public class SecondSmallestNum {
    public static void main(String[] args) {
        int arr[] ={1,3,5,2,31,6};
        int a=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
            if(arr[i]<arr[j])
            {
                a=arr[i];
            }
        }
    }
    System.out.println(a);
    }
}
