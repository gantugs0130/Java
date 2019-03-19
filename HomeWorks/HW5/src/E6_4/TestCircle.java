package E6_4;

public class TestCircle {

    Circle circle;
    public TestCircle(){
        circle = new Circle(10);
        System.out.println("Radius = "+circle.getRadius()+"\nPerimeter = "+circle.getPerimeter()+"\nArea = "+circle.getArea());
    }
    public static void main(String[] args) {
        new TestCircle();
    }
}
