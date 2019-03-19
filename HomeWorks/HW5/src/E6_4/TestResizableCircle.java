package E6_4;

public class TestResizableCircle {
    ResizableCircle resizableCircle;
    TestResizableCircle(){
        resizableCircle = new ResizableCircle(80);
        System.out.println("Omno n:" +"\nRadius = "+resizableCircle.getRadius()+
                "\nPerimeter = "+resizableCircle.getPerimeter()+"\nArea = "+resizableCircle.getArea());
        resizableCircle.resize(200);
        System.out.println("Daraa n:" +"\nRadius = "+resizableCircle.getRadius()+
                "\nPerimeter = "+resizableCircle.getPerimeter()+"\nArea = "+resizableCircle.getArea());
    }
    public static void main(String[] args) {
        new TestResizableCircle();
    }
}
