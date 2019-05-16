package Chapter30.J30_12;


import java.util.concurrent.*;

public class ParallelAssign {
    final int N = 9000000;
    int[] list = new int[N];

    public ParallelAssign(){
        long startTime = System.currentTimeMillis();
        assign(list);
        long endTime = System.currentTimeMillis();
        System.out.println("time = "+(endTime-startTime));
    }

    public static void assign(int[] list) {
        RecursiveTask<Void> task = new AssingTask(list, 0, list.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
    }

    private static class AssingTask extends RecursiveTask<Void> {
        private final static int THRESHOLD = 500;
        private int[] list;
        private int low;
        private int high;
        public AssingTask(int[] list, int low, int high) {
            this.list = list;
            this.low = low;
            this.high = high;
        }
    @Override
    public Void compute() {
        if (high - low < THRESHOLD) {
            int max = list[0];
            for (int i = low; i < high; i++){
                list[i] = (int)(Math.random()*1000000);
             if(isPrimeNumber(list[i])){
                 System.out.println(list[i]);
             }
            }
        }
        else {
            int mid = (low + high) / 2;
            RecursiveTask<Void> left = new AssingTask(list, low, mid);
            RecursiveTask<Void> right = new AssingTask(list, mid, high);
            right.fork();
            left.fork();

            right.join();
            left.join();

        }
        return null;
    }
}
public static boolean isPrimeNumber(int b){
        boolean a =true;

        for (int i = 2; i*i < b; i++){
            if (b%i==0){
                a = false;
            }
        }
        if(b==1){
            a = false;
        }
        return a;
}

    public static void main(String[] args) {
        new ParallelAssign();
    }

}
//14-31 hunsnii zah d zoriulsan similuats zohiono ynz buriin jims baidag alim ... bgaa bagtaamj n hzgaardmagdmal