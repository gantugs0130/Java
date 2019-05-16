package J20_4;

public class Point implements Comparable<Point>{
    public double x;
    public double y;
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y){
        setX(x);
        setY(y);
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.getX()!=o.getX()) return (int)(this.getX()-o.getX());
        else return (int)(this.getY()-o.getY());

    }

    @Override
    public String toString() {
        return "("+ this.getX() + ","+this.getY()+")";
    }
}
