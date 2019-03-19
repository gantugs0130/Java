package lab6;

import java.util.Scanner;

public class IndexOut {

    public  IndexOut(){
        int[] a;
        a = new int[100];
        for (int i=0; i<100; i++){
            a[i] = (int)(Math.random()*100);
        }
        check(a);

    }

    void check(int[] a){
        try{
            Scanner inp = new Scanner(System.in);
            int b;
            b = inp.nextInt();
            System.out.println("index = "+ b +"value = "+a[b]);

        }
        catch(IndexOutOfBoundsException e ){

        }


    }

    public static void main(String[] args) {

    }
}
