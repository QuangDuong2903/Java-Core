package synchronizedEx;

public class Test {

	public synchronized void a() {
		for (int i = 0; i < 10; i++) {
			System.out.println("a: " + i);
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void b() {
		for (int i = 0; i < 10; i++) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("b: " + i);
			notify();
		}
	}

	public static void main(String[] args) {
		Test test = new Test();
		Thread t1 = new Thread(() -> test.a());
		Thread t2 = new Thread(() -> test.b());
		t2.start();
		t1.start();
	}
}
