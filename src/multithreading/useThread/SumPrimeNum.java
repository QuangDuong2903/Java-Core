package multithreading.useThread;

public class SumPrimeNum {

	private static int sum = 0;

	private static int x = 0;

	private static boolean flag = false;

	public boolean checkPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}

	public void findPrime() {
		for (int i = 0; i <= 1000; i++) {
			if (checkPrime(i)) {
				x = i;
				flag = true;
				while (flag);
			}
		}
	}

	public void sumPrime(Thread t1) {
		while (t1.isAlive()) {
			if (flag) {
				sum += x;
				flag = false;
			}
		}
	}

	public static void main(String[] args) {

		SumPrimeNum sumPrimeNum = new SumPrimeNum();

		Thread t1 = new Thread() {
			public void run() {
				sumPrimeNum.findPrime();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				sumPrimeNum.sumPrime(t1);
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
