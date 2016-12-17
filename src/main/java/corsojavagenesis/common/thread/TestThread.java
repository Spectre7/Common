package corsojavagenesis.common.thread;

public class TestThread {

	public static void main(String[] args) {
		Thread myThread = new MyThread();		
		myThread.start();
		
		MyThread2 myThread2 = new MyThread2();
		new Thread(myThread2).start();
		
		
		
		
		System.out.println("hello thread");
		
		
		
		
		

	}

}
