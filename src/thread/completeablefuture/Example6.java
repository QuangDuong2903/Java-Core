package thread.completeablefuture;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example6 {

    public static CompletableFuture<String> download(String url) {
        int time = (new Random().nextInt(5) + 1) * 1000;
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + ": downloading " + url + " for " + time / 1000 + " s");
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": download done " + url);
            return "Done";
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<String> list = List.of("https://www.google.com.vn/", "https://vnexpress.net/", "http://gpcoder.com/");
        List<CompletableFuture<String>> downloadFutureList = list.stream().map(Example6::download).toList();
        CompletableFuture<Void> combineFuture =
                CompletableFuture.allOf(downloadFutureList.toArray(new CompletableFuture[downloadFutureList.size()]))
                        .thenApply(v -> downloadFutureList.stream().map(CompletableFuture::join).toList())
                        .thenApply(l -> l.stream().filter(i -> i.equals("Done")).count())
                        .thenAccept(c -> System.out.println("Number of download done: " + c));

        System.out.println(Thread.currentThread().getName() + ": running");
        CompletableFuture.runAsync(() -> {
            try {
                combineFuture.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }, executorService);
        System.out.println(Thread.currentThread().getName() + ": still running");
        executorService.shutdown();
    }
}
