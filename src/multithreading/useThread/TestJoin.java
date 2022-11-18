package multithreading.useThread;

public class TestJoin {

	public static void main(String[] args) {
		DemoJoin t1 = new DemoJoin();
		DemoJoin t2 = new DemoJoin();
		DemoJoin t3 = new DemoJoin();
		t1.start();
		try {
			t1.join(); // Waits for this thread to die. 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}
}
