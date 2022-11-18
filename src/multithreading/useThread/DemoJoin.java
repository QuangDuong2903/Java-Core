package multithreading.useThread;

public class DemoJoin extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println(Thread.currentThread().getName() + " đang chạy!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Kết thúc " + Thread.currentThread().getName());
	}
}
