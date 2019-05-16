package J30_4;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {

    public static Integer sum = 0;
    @Override
    public Integer call() throws Exception {
        synchronized (this){
            sum++;
        }
        return sum;
    }
}
