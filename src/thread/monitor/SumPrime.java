package thread.monitor;

public class SumPrime {

    public int sum = 0;

    private int num = 0;

    public boolean checkPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public synchronized void findPrime() throws InterruptedException {
        for (int i = 2; i <= 1000; i++)
            if (checkPrime(i)) {
                num = i;
                notifyAll();
                wait();
            }
        notifyAll();
    }

    public synchronized void plusPrime(Thread t1) throws InterruptedException {
        while (t1.isAlive()) {
            if (t1.getState() == Thread.State.WAITING) {
                sum += num;
                notifyAll();
                wait();
            }
        }
    }
}
