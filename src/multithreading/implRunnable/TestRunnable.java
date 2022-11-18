package multithreading.implRunnable;

public class TestRunnable {

	public static void main(String[] args) {
		DemoThread demoThread0 = new DemoThread();
        Thread thread0 = new Thread(demoThread0);
        thread0.start();
         
        DemoThread demoThread1 = new DemoThread();
        Thread thread1 = new Thread(demoThread1);
        thread1.setName("Luồng 1");
        thread1.start();
         
        DemoThread demoThread2 = new DemoThread();
        Thread thread2 = new Thread(demoThread2);
        thread2.start();
	}
}
