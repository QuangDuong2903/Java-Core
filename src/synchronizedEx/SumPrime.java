package synchronizedEx;

import java.lang.Thread.State;

public class SumPrime {

	static int sum = 0;

	static int x = 0;

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}

	public synchronized void calculate(Thread t1) {
		while (t1.isAlive()) {
			if (t1.getState() == State.WAITING) {
				sum += x;
				notify();
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public synchronized void findPrime() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			if (isPrime(i)) {
				x = i;
				notify();
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		notify();
	}

	public static void main(String[] args) throws InterruptedException {
		SumPrime sumPrime = new SumPrime();
		Runnable r1 = () -> sumPrime.findPrime();
		Thread thread1 = new Thread(r1);
		Runnable r2 = () -> sumPrime.calculate(thread1);
		Thread thread2 = new Thread(r2);
		thread1.start();
		thread2.start();
		thread1.join();
		System.out.println("sum:" + sum);
	}
}
