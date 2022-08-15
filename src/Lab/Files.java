import java.util.*;
import java.io.*;

public class Files {
    public static void main(String args[])
    {
        String a="C:\\Users\\Jackson\\IdeaProjects\\JAVA\\src";
        try{
            File f=new File(a);
            File List[] =f.listFiles();
            for(File i:List)
            {
                System.out.println("Name : "+i.getName());
            }
        }
        catch(SecurityException err)
        {
            System.out.println("Errot was fopund");
        }
    }
}
