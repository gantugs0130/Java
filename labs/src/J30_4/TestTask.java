package J30_4;


import java.util.concurrent.*;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class TestTask {


    public TestTask() throws ExecutionException, InterruptedException {
        ExecutorService task;
        Callable<Integer> x = new Task();

        IntStream stream = IntStream.range(0,1000);

        task = Executors.newSingleThreadExecutor();

    }

    public static void main(String[] args) {
        try {
            new TestTask();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
Write an application in which multiple threads read all words from a collec-
tion of files. Use a ConcurrentHashMap<String, Set<File>> to track in which files
each word occurs. Use the merge method to update the map.
*/