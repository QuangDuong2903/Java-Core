package multithreading.synchronizedThread;

public class Customer {
	private int balance = 10000;

	public Customer() {
		System.out.println("Tài khoản hiện có: " + balance);
	}

	private synchronized void withdrawMoney(int money) {
		System.out.println("Giao dịch dc thực hiện với số tiền " + money);
		if (balance < money) {
			System.out.println("Số tiền trong tài khoản không đủ!");
			try {
				wait(); // Causes the current thread to wait until another thread invokes the notify() 
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}

		balance -= money;
		System.out.println("Rút thành công, số tiền hiện có trong tài khoản: " + balance);
	}

	private synchronized void payemt(int money) {
		System.out.println("Giao dịch nộp tiền đang thực hiện với: " + money);
		balance += money;
		System.out.println("Nộp tiền thành công, số tiền hiện có trong tài khoản: " + balance);
		notify(); // Wakes up a single thread that is waiting  
	}

	public static void main(String[] args) {
		final Customer customer = new Customer();
		Thread t1 = new Thread() {
			public void run() {
				customer.withdrawMoney(20000);
			}
		};

		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				customer.payemt(30000);
			}
		};

		t2.start();
	}
}
