package J17_3;

import java.io.*;

public class SumInteger {

    File file;
    FileOutputStream output;
    FileInputStream input;
    public SumInteger(){
        file = new File("gantugs");
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
            output = new FileOutputStream(file);

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
        new SumInteger();

    }
}
