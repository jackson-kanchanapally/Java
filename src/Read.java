import java.io.*;
public class Read {
    
    public static void main(String args[])
    {
        try{
            Reader r=new FileReader("file.txt");
            int d=r.read();
            while(d!=-1)
            {
                System.out.print((char)d);
                d=r.read();
            }
        }
        catch(IOException e)
        {

        }
    }
}
