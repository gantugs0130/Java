package J21_4;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Word {
    public Word(String a){

        LinkedList<String> list = new LinkedList<String>();
        insert_Data(a, list);
    }

    void insert_Data(String a, LinkedList<String> list){
        try {
            FileReader fileReader = new FileReader(a);
            BufferedReader inp = new BufferedReader(fileReader);
            StringBuilder text = new StringBuilder();
            String line = null;
            while((line = inp.readLine()) != null) {
                text.append(line);
            }
            int niiturt=0;
            String text1 = new String(text.toString());
            String[] words = text1.split("[ \n\t\r.,;:!?(){]");
            for (int i = 0; i < words.length; i++) {
                String key = words[i].toLowerCase();
                niiturt+=words.length;
            }
            list.add(text1);
            int egshig = 0;
            int giiguulegch = 0;
            Character a1= new Character('a');
            Character a2= new Character('e');
            Character a3= new Character('i');
            Character a4= new Character('o');
            Character a5= new Character('u');

            if(list.contains(a1)){
                egshig++;
            }
            if(list.contains(a2)){
                egshig++;
            }
            if(list.contains(a3)){
                egshig++;
            }
            if(list.contains(a4)){
                egshig++;
            }

            System.out.println("egshig = "+egshig+"\ngiiguulegch = "+ (niiturt - egshig));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        if(args.length!=0){
            System.out.println("wrong name");
            System.exit(1);
        }else{
            new Word("/home/gantugs/Desktop/School/Java/lab8/src/J21_4/text.txt");
        }

    }
}
