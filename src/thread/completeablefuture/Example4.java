package thread.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example4 {

    public static int squared(int n) {
        System.out.println(Thread.currentThread().getName() + ": " + n);
        return n * n;
    }

    public static int duplicated(int n) {
        System.out.println(Thread.currentThread().getName() + ": " + n);
        return n * 2;
    }

    public static int separate(int n) {
        System.out.println(Thread.currentThread().getName() + ": " + n);
        return n / 2;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> separate(4))
                .thenApply(n -> squared(n))
                .thenApply(n -> duplicated(n))
                .thenAccept((n) -> System.out.println(Thread.currentThread().getName() + ": " + n));

        completableFuture.get();
    }
}
