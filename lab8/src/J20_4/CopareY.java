package J20_4;

import java.util.Comparator;

public class CopareY implements Comparator<Point> {


    @Override
    public int compare(Point p1, Point p2) {
        if(p1.getY()!=p2.getY()) return (int)(p1.getY()-p2.getY());
        return p1.compareTo(p2);

    }
}
