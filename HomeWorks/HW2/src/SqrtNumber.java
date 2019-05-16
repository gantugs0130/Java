public class SqrtNumber {
    public SqrtNumber(){

        System.out.println(sqrt(50));
        System.out.println(Math.sqrt(50));
    }
    static double lastGuess = 1;
    static double nextGuess = 0;

    public static double sqrt(long n)
    {
        nextGuess = (lastGuess + n/lastGuess)/2;
        if(Math.abs(nextGuess - lastGuess) <0.0001){
            return lastGuess;
        }
        else{
            lastGuess = nextGuess;
            return sqrt(n);
        }

    }

    public static void main(String[] args) {
        new SqrtNumber();
    }
}
//6.22
