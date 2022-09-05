import java.io.*;
public class Write{
public static void main(String args[])
{
    try{
        Writer w=new FileWriter("file.txt");
        String s="hello fuile";
        w.write(s);
        w.close();
    }catch(IOException e)
    {
        
    }
}
}