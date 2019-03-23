package J10_27;

public class MyStringBuilder1 {
    private String s;

    public MyStringBuilder1(String s){
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s){
        return new MyStringBuilder1(this.s+s);
    }

    public MyStringBuilder1 append(int i){
        return new MyStringBuilder1(this.s+i);
    }
    public int length(){
        return s.length();
    }
    public char charAt(int index){
        return s.charAt(index);
    }
    public MyStringBuilder1 toLowerCase(){
        return new MyStringBuilder1(s.toLowerCase());
    }
    MyStringBuilder1 substring(int begin,int end){
        return new MyStringBuilder1(s.substring(begin,end));
    }
    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        MyStringBuilder1 a = new MyStringBuilder1("GanTugs");
        MyStringBuilder1 b = new MyStringBuilder1(" is ");
        a = a.append(b);
        System.out.println(a);
        a = a.append(5);
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.charAt(2));
        a = a.toLowerCase();
        System.out.println(a);
        a = a.substring(1,5);
        System.out.println(a);
    }
}

