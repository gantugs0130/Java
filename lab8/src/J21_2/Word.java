package J21_2;

import java.io.*;
import java.util.TreeSet;

public class Word {
    public Word(String a){

        TreeSet<String> set = new TreeSet<String>();
        insert_Data(a, set);
    }

    void insert_Data(String a, TreeSet<String> set){
        try {
            FileReader fileReader = new FileReader(a);
            BufferedReader inp = new BufferedReader(fileReader);
            StringBuilder text = new StringBuilder();
            String line = null;
            while((line = inp.readLine()) != null) {
                text.append(line);
            }
            String text1 = new String(text.toString());
            String[] words = text1.split("[ \n\t\r.,;:!?(){]");
            for (int i = 0; i < words.length; i++) {
                String key = words[i].toLowerCase();
                set.add(words[i]);
            }
            System.out.println(set);

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
            new Word("/home/gantugs/Desktop/School/Java/lab8/src/J21_2/ug.txt");
        }

    }
}
