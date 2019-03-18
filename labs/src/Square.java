public class Square extends GeometricObject implements Colorable {

    double side;
    public Square(){
        super();
        this.side=1;
    }
    public Square(double side, String color, Boolean filled){
        super(color, filled);
        this.side=side;
    }
    @Override
    public double getPerimeter() {
        return 4*this.side;
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return super.toString()+"\nside = "+side+"\narea = "+this.getArea();
    }
}
