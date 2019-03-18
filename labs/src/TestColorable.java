public class TestColorable {
    Triangle tri;
    Square square;
    GeometricObject[] geo = new GeometricObject[5];
    public TestColorable(){
       geo[0]= new Triangle();
       geo[1]= new Square(2,"red",true);
       geo[2]= new Triangle(4,5,6,"black",false);
       geo[3]= new Square(5,"green",false);
       geo[3]= new Square(6,"brown",false);

        for (GeometricObject g:geo) {
            
            if(g instanceof Colorable){
                ((Colorable) g).howToColor();
            }
        }
    }

    public static void main(String[] args) {
        new TestColorable();
    }
}
