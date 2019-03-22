package J11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
    public RemoveDuplicate(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        input(list);
        removeDuplicate(list);
    }

    public void input(ArrayList<Integer> list){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        int a;
        for(int i = 0; i<10; i++){
            a = inp.nextInt();
            list.add(a);
        }
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        System.out.print("The distinct integers are ");
        for (int i = 0; i<list.size(); i++){
            boolean ishere = false;
            for(int j = 0; j < i; j++){
                if(list.get(i)==list.get(j))
                    ishere =true;
            }
            if(!ishere)
                System.out.printf("%d ", list.get(i));
        }

    }
    public static void main(String[] args) {
        new RemoveDuplicate();
    }
}
