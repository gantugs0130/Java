package E6_4;
public class Circle implements GeometricObject {
    // Private variable
    protected double radius;

           // Constructor
    public Circle(){
        setRadius(1);
    }

    public Circle(double a){
       setRadius(a);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Implement methods defined in the interface GeometricObject
    @Override
    public double getPerimeter() {
        return Math.PI*2*getRadius();
    }

    @Override
    public double getArea() {
        return Math.pow( Math.PI,2)*getRadius();
    }


}

