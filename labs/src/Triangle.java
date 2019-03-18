public class Triangle extends GeometricObject {
    double side1, side2,side3;
    public Triangle(){

    }
    public Triangle(double side1, double side2, double side3, String color, boolean filled ){
        super(color, filled);
        if(isTriangle()){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        }
        else{
            System.out.println("Gurvarljin uusheergui bn");
        }
    }



    boolean isTriangle(){
        return (side1>0&&side2>0&&side3>0&&side1+side2>side3&&side1+side3>side2&&side3+side2>side1);
    }
    @Override
    public double getArea() {

        return Math.sqrt(getPerimeter()/2*(getPerimeter()/2-this.side1)*(getPerimeter()/2-this.side2)*(getPerimeter()/2-this.side3));
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return super.toString() + " \nside1 = "+this.side1 + " \nside2 = " + side2 +"\nside3 = "+side3  +
                "\n the area is: " + getArea()+
                "\n the perimeter is:" + getArea();
    }
}
