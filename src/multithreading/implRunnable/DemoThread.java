package multithreading.implRunnable;

public class DemoThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) { 
            System.out.println(Thread.currentThread().getId() + "\t" + 
                    Thread.currentThread().getName());
        }
	}

}
