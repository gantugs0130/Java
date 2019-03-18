import java.util.Scanner;

public class CheckPass {
    public CheckPass(){
        String password = input();
        check(password);


    }
    //a.matches("((?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*\\W)(.{8,}))")
    String input(){
        Scanner input = new Scanner(System.in);
        String b = input.next();
        return b;
    }
    void check(String a){
        if(a.length()<8){
            System.out.println("Invalid Password");
            return;
        }
        if(a.matches(".*\\W.*")){
            System.out.println("Invalid Password");
        }
        else{
            int x=0;
            for(int i=0; i<a.length(); i++){
                if(Character.isDigit(a.charAt(i)))
                    x++;
            }
            if(x>=2){
                System.out.println("Valid Password");

            }
            else{
                System.out.println("Invalid Password");
            }

        }
    }



    public static void main(String[] args) {
        new CheckPass();
    }
}
//6.18