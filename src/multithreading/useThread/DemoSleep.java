package multithreading.useThread;

public class DemoSleep extends Thread {

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " Tạm dừng 1s");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Kết thúc!");
	}

}
