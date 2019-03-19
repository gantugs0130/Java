package J12_5;

public class TestTriangle {

    Triangle tri;
    public  TestTriangle(){
        try {
            tri = new Triangle(1,1,1, "red",true);
        } catch (IllegalTriangleExeption illegalTriangleExeption) {
            illegalTriangleExeption.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new TestTriangle();
    }
}
