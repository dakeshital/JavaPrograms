package threadprograms;

class Yieldclass extends Thread {

	public void run() {
		Thread.yield();
		for (int i = 1; i <= 5; i++) {
			System.out.println("child thread: " + i);
		}
	}
}

public class YieldMethodInThread {

	public static void main(String[] args) {

		Yieldclass yc = new Yieldclass();
		yc.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("main thread: " + i);
		}
		
	}
}
