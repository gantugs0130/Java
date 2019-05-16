import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Bodlogo {
    PrintWriter oPW;
    File file;

    double[][] array;

    public Bodlogo(){
        array = new double[360][2];
        input();
        write();
        read(array);

        serial(array);
        readserial(array);

    }

    void input(){

        try {
            file = new File("sin.txt");
            oPW = new PrintWriter(file);

           for(int i=0; i<361;i++){

               oPW.println(i+" "+Math.sin(Math.toRadians(i)));
           }
            oPW.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    void write(){
        try {
            file = new File("input.txt");
            oPW = new PrintWriter(file);

            oPW.println((int) Math.round(Math.random()*360));
            oPW.flush();
            oPW.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void read(double[][] array){
        try {
            Scanner scanner = new Scanner(new File("sin.txt"));
            Scanner scanner1 = new Scanner(new File("input.txt"));


            for(int i = 0; i<360; i++){

                array[i][0] = (double)scanner.nextInt();
                array[i][1] = scanner.nextDouble();
            }
            int a = scanner1.nextInt();
            System.out.println(array[a][1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  void serial(double[][] array){
        try {
            FileOutputStream file1 = new FileOutputStream("sin2.dat");
            ObjectOutputStream out = new ObjectOutputStream(file1);
            out.writeObject(array);
            out.close();
            file1.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void  readserial(double[][] array){
        FileInputStream file = null;
        try {
            file = new FileInputStream("sin2.dat");
            ObjectInputStream in = new ObjectInputStream(file);
            array = (double[][])in.readObject();
            for (int i = 0; i<360; i++){
                System.out.print(array[i][0]+" ");
                System.out.println(array[i][1]);
            }
            in.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Bodlogo();
    }
}
