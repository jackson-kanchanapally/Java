import java.util.*;

class Q {
	private int i;
	private boolean available = false; // Assume as Buffer which is empty

	public synchronized void consume() // Multiple threads cannot access the block sametime.
	{
		while (!available) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		System.out.println("Data consumed "+i);
		notifyAll(); // This method is used to wakeup the threads which are waiting.
		
	}

	public synchronized void produce(int value) {
		while (available) {
			try {
				wait(0);
			} catch (InterruptedException e) {
			}
		}
		i = value;
		available = true;
		System.out.println("Data produced "+i);
		notifyAll();
	}

}
/*
 * 1.Producer only generate the element into buffer or box when it is EMPTY.
 * 2.Consumer take the element from the buffer when it contains an element.
 * 3.Produce and consumer can't work at same time.
 */

class consumer extends Thread {
	private Q q;

	public consumer(Q c) {
		this.q = c;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			q.consume();
		}
	}
}

class Producer extends Thread {
	private Q q;

	public Producer(Q c) {
		this.q = c;

	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			q.produce(i);
		}
	}
}
public class ProducerConsumer{
	public static void main(String[] args) {
		Q q=new Q();
		Producer p= new Producer(q);
		consumer c= new consumer(q);
		p.start();
		c.start();
	}
}