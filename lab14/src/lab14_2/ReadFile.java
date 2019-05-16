package lab14_2;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class ReadFile {


    public static void main(String args[]) {
        HashMap<String, Integer> ug = new HashMap<String,Integer>();

        String fileName = "src/lab14_1/SupplyAsyncExample.java";
        StringBuffer stringBuffer = new StringBuffer();

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(
                    (String s)->{
                        Arrays.stream( s.split("\\W")).forEach(
                                word->{
                                    if(!ug.containsKey(word)){
                                        ug.put(word,1);
                                    }else {
                                        ug.replace(word,ug.get(word)+1);
                                    }
                                }
                        );
                    }
            );

            ug.entrySet().stream().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
