public class TestTriangle {
    Triangle tri;
    public TestTriangle(){
        tri = new Triangle(2,4,5,"Black", true);
        System.out.println(tri);
    }

    public static void main(String[] args) {
        new TestTriangle();
    }
}
