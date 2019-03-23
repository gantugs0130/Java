package J10_25;

import java.util.ArrayList;
import java.util.Collections;

public class MySplit {
    public static String[] split(String s, String regex) {
        String[] strings = s.split(regex);


        ArrayList<String> list = new ArrayList<String>();
        int a = 0;
        for(int i = 0; i < strings.length-1; i++){

            list.add(strings[i]);
            StringBuilder s1 = new StringBuilder(s.substring(strings[i].length()+a));
            a = s1.substring(0,s1.indexOf(strings[i+1])).length();
            list.add(s1.substring(0,s1.indexOf(strings[i+1])));
            s = s1.toString();
        }
        list.add(strings[strings.length-1]);
        String[] array = list.toArray(new String[list.size()]);
        return array;
    }


    public static void main(String args[]) {

        for (String a : split("a?b?gf#e", "[?#]"))
            System.out.print(a + " ");
    }

}