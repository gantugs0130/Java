package J20_4;


import java.lang.reflect.Array;
import java.util.*;

public class TestPoint {
    Point[] vec = new Point[100];
    public TestPoint(){
        createPoints();
    }

    public void createPoints(){
        Point p;
        Random rand = new Random(123);
        for (int i=0; i<100; i++){
           vec[i]=new Point((double)rand.nextInt(2000),(double)rand.nextInt(2000));
        }
        for (Point s: vec)
        System.out.print(s);
        Arrays.sort(vec,new CopareY());
        System.out.println();
        for (Point s: vec)
            System.out.print(s);
    }
    public static void main(String[] args) {
        new TestPoint();
    }
}
