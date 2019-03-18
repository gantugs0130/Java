import java.util.Scanner;
public class Lines {

    public Lines(){
        checkLines();
    }


    void checkLines(){
        double x1, x2, x3, x4, y1, y2, y3, y4;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        x4 = input.nextDouble();
        y4 = input.nextDouble();
        if((y1-y2)/(x1-x2)==(y3-y4)/(x3-x4)){
            System.out.println("The two lines are parallel");
        }
        else{
            double y = (((y1-y2)*x1 - (x1-x2)*y1)*(y3-y4)-((y3-y4)*x3 - (x3-x4)*y3)*(y1-y2)) /
                    ((y1-y2)*(x3-x4) -  (y3-y4)*(x1-x2));
            double x = ((y1-y2)*x1 - (x1-x2)*y1 + (x1-x2)*y)/(y1-y2);

            System.out.println("The intersecting point is at ( "+x+" "+y+")");
        }

    }
    public static void main(String[] args) {
        new Lines();
    }
}
//3.25
