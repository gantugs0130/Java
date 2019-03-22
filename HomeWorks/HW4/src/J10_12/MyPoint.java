package J10_12;

public class MyPoint {
    private double x;
    private double y;
    MyPoint(){
        setX(0.0);
        setY(0.0);
    }
    MyPoint(double x, double y){
        setY(y);
        setX(x);
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public double distance(MyPoint p){
        return Math.sqrt( Math.pow(p.getX()-getX(),2) + Math.pow(p.getY()-getY(),2));
    }
}
