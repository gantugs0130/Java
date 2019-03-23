package J10_12;

public class TestTriangle {

    public TestTriangle(){
        Triangle2D t1 = new Triangle2D(2.5, 2 ,4.2, 3, 5, 3.5);
        if(t1.contains(new MyPoint(3,3))){
            System.out.println("tseg aguulna");
        }
        if(t1.contains(new Triangle2D(2.9, 2, 4,1,1,3.4))){
            System.out.println("Bagtana");
        }
        if(t1.overlaps(new Triangle2D(2,5.5,4,-3,2,6.5))){
            System.out.println("ogtloltsno");
        }

    }
    public static void main(String[] args) {
        new TestTriangle();
    }
}
