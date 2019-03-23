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

            Triangle2D x1 = new Triangle2D(this.p1.getX(), this.p1.getY(),
                    this.p2.getX(), this.p2.getY(), p.getX(), p.getY());
           Triangle2D x2 = new Triangle2D(this.p1.getX(), this.p1.getY(),
                   this.p3.getX(), this.p3.getY(), p.getX(), p.getY());
           Triangle2D x3 = new Triangle2D(this.p3.getX(), this.p3.getY(),
                   this.p2.getX(), this.p2.getY(), p.getX(), p.getY());
            return x1.getArea()+x2.getArea()+x3.getArea()<this.getArea()+0.000000001;

       }
       public  boolean contains(Triangle2D t){
            return this.contains(t.p1) && this.contains(t.p2) && this.contains(t.p3);
       }
       public  boolean overlaps(Triangle2D t){
            return contains(intersect(t.p1,t.p2,this.p1,this.p2)) && t.contains(intersect(t.p1,t.p2,this.p1,this.p2))||
                    contains(intersect(t.p1,t.p3,this.p1,this.p3)) && t.contains(intersect(t.p1,t.p3,this.p1,this.p3))||
                    contains(intersect(t.p2,t.p3, this.p2, this.p3)) && t.contains(intersect(t.p2,t.p3, this.p2, this.p3))||
                    contains(intersect(t.p1,t.p2,this.p1,this.p3)) && t.contains(intersect(t.p1,t.p2,this.p1,this.p3))||
                    contains(intersect(t.p1,t.p2,this.p2, this.p3)) && t.contains(intersect(t.p1,t.p2,this.p2, this.p3))||
                    contains(intersect(t.p1, t.p3, this.p1,this.p2)) && t.contains(intersect(t.p1, t.p3, this.p1,this.p2))||
                    contains(intersect(t.p1, t.p3, this.p2,this.p3)) && t.contains(intersect(t.p1, t.p3, this.p2,this.p3))||
                    contains(intersect(t.p2, t.p3, this.p1,this.p3)) && t.contains(intersect(t.p2, t.p3, this.p1,this.p3))||
                    contains(intersect(t.p2, t.p3, this.p1,this.p2)) && t.contains(intersect(t.p2, t.p3, this.p1,this.p2))
                    ;
       }
       public  MyPoint intersect(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4){
            double a = (p1.getY() - p2.getY())/(p1.getX()-p2.getX());
            double c = (p3.getY() - p4.getY())/(p3.getX()-p4.getX());
            double b = (p1.getY()*(p1.getX()-p2.getX()) - p1.getX()*(p1.getY()-p2.getY()))/(p1.getX() - p2.getX());
            double d = (p3.getY()*(p3.getX()-p4.getX()) - p3.getX()*(p3.getY()-p4.getY()))/(p3.getX() - p4.getX());
            if(a == c){
                return new MyPoint(0,0);
            }else{
                double x = (d - b)/(a-c);
                double y = (a*(d-b) + b*(a-c))/(a-c);
                return  new MyPoint(x, y);
            }

        }

}
