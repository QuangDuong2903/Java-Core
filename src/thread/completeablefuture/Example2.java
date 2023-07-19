package thread.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // async with runAsync() and don't need result
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName() + ": running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": done");
        });
        // get() will block main thread
        System.out.println(Thread.currentThread().getName() + ": application start");
        completableFuture.get();
        System.out.println(Thread.currentThread().getName() + ": application stop");
    }
}
