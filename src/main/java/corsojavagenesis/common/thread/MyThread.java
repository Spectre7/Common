package corsojavagenesis.common.thread;

import java.util.Scanner;

public class MyThread extends Thread {
	
	public MyThread(){
		super("MyThread");
	}
	
	@Override
    public void run() {
        // compute primes larger than minPrime
        Scanner s = new Scanner(System.in);
        s.nextInt();
    }
}
