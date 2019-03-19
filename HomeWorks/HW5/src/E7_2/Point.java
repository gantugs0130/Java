package E7_2;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        setXY(x,y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y){
        setY(y);
        setX(x);
    }
    public int[] getXY(){
        int[] a ={getX(),getY()};
        return a;
    }

    public double distance(Point another){
        return Math.sqrt(Math.pow(getX()-another.getX(),2)+Math.pow(getY()-another.getY(),2));
    }
    @Override
    public String toString() {
        return " x = "+getX()+"\ty = "+getY();
    }
}

