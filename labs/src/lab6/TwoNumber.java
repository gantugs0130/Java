package lab6;



import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoNumber {
    public TwoNumber(){
        input();
    }

    public void input(){
        Scanner inp = new Scanner(System.in);
        Boolean a = true;
        int num1, num2;
        while(a){
        try {
            num1 = inp.nextInt();
            num2 = inp.nextInt();
            System.out.println("Sum: = "+(num1+num2));
            a = false;
        }
        catch (InputMismatchException e){

            System.out.println("Ta buruu oruulsan");
            inp.nextLine();
        }

        }
    }
    public static void main(String[] args) {
        new TwoNumber();
    }
}
