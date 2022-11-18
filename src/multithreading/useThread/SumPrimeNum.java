package multithreading.useThread;

public class SumPrimeNum {

	private static int sum = 0;

	private static int x = 0;

	private static boolean flag = false;

	public static boolean checkPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					System.out.println("t1 running");
					if (checkPrime(i)) {
						x = i;
						flag = true;
						System.out.println(i);
						while(flag);
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				while (t1.isAlive()) {
					if (flag) {
						System.out.println("t2 sum");
						sum += x;
						flag = false;
					}
				}
			}
		};

		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(sum);

	}

}
