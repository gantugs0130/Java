package J10_12;

public class Triangle2D {
        private MyPoint p1,p2,p3;
        Triangle2D(){
            p1 = new MyPoint(0,0);
            p2 = new MyPoint(1,1);
            p3 = new MyPoint(2,5);
        }
        Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3){
            p1 = new MyPoint(x1, y1);
            p2 = new MyPoint(x2, y2);
            p3 = new MyPoint(x3, y3);
        }
       public double getArea(){

            return Math.sqrt((getPerimeter()/2 - p1.distance(p2))*
                    (getPerimeter()/2 - p1.distance(p3))*
                    (getPerimeter()/2 - p2.distance(p3))*(getPerimeter()/2));
       }
       public  double getPerimeter(){
            return p1.distance(p2)+p1.distance(p3)+p2.distance(p3);
       }
       public boolean contains(MyPoint p){
            return false;
       }
}
