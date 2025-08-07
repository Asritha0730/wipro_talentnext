package MultiThreading;

public class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}

public static void main(String[]args) {
	ThreadDemo t = new ThreadDemo();
	Thread Scooby = new Thread(t,"Scooby");
	Thread Shaggy = new Thread(t,"Shaggy");
	Scooby.start();
	Shaggy.start();
}
}