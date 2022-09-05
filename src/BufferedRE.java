import java.io.*;
public class BufferedRE {
    public static void main(String args[]) throws Exception
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(r);
        String name=bf.readLine();
        System.out.println("Hello "+name);
    }
}
