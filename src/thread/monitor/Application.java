package thread.monitor;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        SumPrime sumPrime = new SumPrime();
        Thread a = new Thread(() -> {
            try {
                sumPrime.findPrime();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread b = new Thread(() -> {
            try {
                sumPrime.plusPrime(a);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        a.start();
        b.start();
        a.join(); // wait for thread a to die
        System.out.println(sumPrime.sum);
    }

}
