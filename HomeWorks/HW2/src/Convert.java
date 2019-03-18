public class Convert {
    public Convert(){
        System.out.println(convertMillis(555550000));
    }

    public static String convertMillis(long millis){
        long hour = millis/3600000;
        millis = millis % 3600000;
        long minute = millis / 60000;
        millis = millis % 60000;
        long second = millis/1000;
        return hour+":"+minute+":"+second;

    }
    public static void main(String[] args) {
        new Convert();
    }
}
//6.25
