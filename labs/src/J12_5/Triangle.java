package J12_5;

public class Triangle {
    double side1, side2,side3;
    public Triangle(int i, int i1, int i2) throws IllegalTriangleExeption{


        if(!isTriangle()){
            throw new IllegalTriangleExeption("Gurvaljin uusehgui taluudtai");
        }

        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }
    public Triangle(double side1, double side2, double side3, String color, boolean filled ) throws IllegalTriangleExeption{


        if(!isTriangle()){
            throw new IllegalTriangleExeption("Gurvaljin uusehgui taluudtai");
        }        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }



    boolean isTriangle(){
        return (side1>0&&side2>0&&side3>0&&side1+side2>side3&&side1+side3>side2&&side3+side2>side1);
    }

    public double getArea() {

        return Math.sqrt(getPerimeter()/2*(getPerimeter()/2-this.side1)*(getPerimeter()/2-this.side2)*(getPerimeter()/2-this.side3));
    }

    public double getPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return " \nside1 = "+this.side1 + " \nside2 = " + side2 +"\nside3 = "+side3  +
                "\n the area is: " + getArea()+
                "\n the perimeter is:" + getArea();
    }
}
