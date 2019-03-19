package J17_7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectIO {

    File file;
    ObjectOutputStream output;
    ObjectInputStream input;
    ArrayList<Loan> loans;
    public ObjectIO(){
        file = new File("Exercise17_07.dat");
        try {
            toFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            readFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void toFile(File file) throws IOException{
        try {
            output = new ObjectOutputStream(file);

            for(int i=0; i<100; i++){
                output.write(i);
            }
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(output!=null){
                output.close();
            }
        }
    }
    void inputLoanData(){
        Scanner myinput = new Scanner(System.in);
        for(int i=0; i<5; i++) {
            System.out.println("Enter annualInterestRate: ");
            double interest = myinput.nextDouble();
            System.out.println("Enter numberOfYears: ");
            double years = myinput.nextInt();
            System.out.println("Enter loanAmount: ");
            double amount = myinput.nextDouble();
        }
    }
    void readFile(File file) throws IOException{
        try {
            int sum = 0;
            input = new FileInputStream(file);
            while(input.available()!=0){
                sum+=input.read();
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            input.close();
        }
    }
    public static void main(String[] args) {
        new ObjectIO();

    }
}

