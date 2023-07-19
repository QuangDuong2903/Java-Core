package thread.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example5 {

    public static int squared(int n) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ": squared");
        Thread.sleep(2000);
        return n * n;
    }

    public static int duplicated(int n) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName() + ": duplicated");
        return n * 2;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> squared = CompletableFuture.supplyAsync(() -> {
            try {
                return squared(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<Integer> duplicated = CompletableFuture.supplyAsync(() ->
        {
            try {
                return duplicated(4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<Integer> combineFuture = squared.thenCombine(duplicated, (x, y) -> x + y);
        System.out.println(Thread.currentThread().getName() + ": " + combineFuture.get());
    }
}
