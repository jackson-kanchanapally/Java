import java.util.*;

class cl{
    int i;
    boolean value =false;
    synchronized void produce(int x)
    {
        if(value)
        {
            try {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            public cl(int i)
            {
                this.i=i;
            }
            value=!value;
            System.out.println("Data produced "+i);
        }
    }
}
public class ProducerConsumer {

}
