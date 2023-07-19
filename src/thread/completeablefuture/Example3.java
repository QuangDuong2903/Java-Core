package thread.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // supplyAsync() need result return
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + ": running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": done");
            return "Result";
        });
        System.out.println(Thread.currentThread().getName() + ": application start");
        System.out.println(Thread.currentThread().getName() + ": " + completableFuture.get());
        System.out.println(Thread.currentThread().getName() + ": application stop");
    }
}
