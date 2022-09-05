import java.io.*;
public class GetDetail {
    public static void main(String args[])
    {
        File obj=new File("file.txt");
        if(obj.exists())
        {
            System.out.println("name "+obj.getName());
            System.out.println("path "+obj.getAbsolutePath());
            System.out.println("wrtieablle "+obj.canWrite());
            System.out.println("readable "+obj.canRead());
            System.out.println("size"+obj.length());
        }
    }
}
