package J11_16;

import java.util.LinkedList;
import java.util.Scanner;

public class RepeatAdditionQuiz {

    LinkedList<Integer> list;
    private int first;
    private int second;

    public RepeatAdditionQuiz(){
        int answer;
        list = new LinkedList<Integer>();
        first = (int)(Math.random()*10);
        second = (int)(Math.random()*10);
        Scanner inp = new Scanner(System.in);
        System.out.println(" What is "+first+" + "+second+"?");
        boolean isRight = false;
        answer = inp.nextInt();
        isRight = input(answer);
        while(!isRight){
            System.out.println("Wrong answer. Try again. What is "+first+" + "+second+"?");
            answer = inp.nextInt();
            isRight = input(answer);
        }
            System.out.println("You got it!");

    }

    public boolean input(int answer){

        boolean in = false;
        if(first + second == answer){
            return true;
        }
        else {

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == answer) {
                    System.out.println("You already entered " + answer);
                    in = true;
                    }

                }

            if(!in){
                list.add(answer);
            }
            return false;
        }




    }

    public static void main(String[] args) {
        new RepeatAdditionQuiz();
    }
}
