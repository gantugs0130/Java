import java.util.Scanner;

public class Rectangles {

    public Rectangles(){
        check();
    }

    void check(){
        double x1, x2, y1, y2, w1, w2, h1, h2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height:");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        w1 = input.nextDouble();
        h1 = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height:");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        w2 = input.nextDouble();
        h2 = input.nextDouble();

        if((x1+(w1/2) >= x2+(w2/2)) && (y1 + (h1/2) >= y2+(h2/2)) && (x1-(w1/2) <= x2-(w2/2)) && (y1-(h1/2) <= y2-(h2/2))){
            System.out.println("r2 is inside r1 ");
        }
        else {
            if (((x1 - (w1 / 2) < x2 + (w2 / 2)) && (y1 + (w1 / 2) > y2 - (w2 / 2))) || ((x1 + (w1 / 2) > x2 + (w2 / 2)) && (y1 - (w1 / 2) > y2 - (w2 / 2)))
                    || ((x1 - (h1 / 2) < x2 + (h2 / 2)) && (y1 + (h1 / 2) > y2 - (h2 / 2))) || ((x1 + (h1 / 2) > x2 + (h2 / 2)) && (y1 - (h1 / 2) > y2 - (h2 / 2))))
            {
                System.out.println("r2 overlaps r1");
            }
            else{
                System.out.println("r2 does not overlap r1");
            }
        }



    }


    public static void main(String[] args) {
        new Rectangles();
    }
}
//3.28