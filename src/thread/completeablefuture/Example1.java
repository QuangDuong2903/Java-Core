package thread.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example1 {

    public static String doSomeThing() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ": doing ....");
        Thread.sleep(3000);
        return Thread.currentThread().getName() + ": work done";
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println(Thread.currentThread().getName() + ": application start");
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.complete(doSomeThing());
        System.out.println(completableFuture.get());
        System.out.println(Thread.currentThread().getName() + ": application stop");
    }
}
