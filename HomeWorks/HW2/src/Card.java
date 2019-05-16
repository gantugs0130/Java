public class Card {
    public Card(){
        if(isValid(4388576018402626l)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }
    }
    /** Return true if the card number is valid */
    public static boolean isValid(long number){
        if((sumOfOddPlace(number)+sumOfDoubleEvenPlace(number)) % 10 == 0){
            return true;
        }else{
            return false;
        }
    }
    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number){
        if(number == 0){
            return 0;
        }
        return getDigit((int)(number%100/10*2)) + sumOfDoubleEvenPlace(number/100);
    }
    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number){
        if(number==0){
            return 0;
        }
        return number % 10 + getDigit(number/10);
    }
    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number){
        if(number/100==0){
            return (int)number%10;
        }
        return (int)(number%10) + sumOfOddPlace(number/100);
    }
    /** Return the number of digits in d */
    public static int getSize(long d){
        if(d==0){
            return 0;
        }
        return getSize(d/10) + 1;
    }
    public static void main(String[] args) {
        new Card();
    }
}
//6.31
