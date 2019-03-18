public class Card {
    public Card(){
        pick();
    }
    public void pick(){
        String[] rank = {"Ace","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] suit = {"Clubs","Diomands","Hearts","Spades"};
        int i = (int)(Math.random()*13);
        int j = (int)(Math.random()*4);
        System.out.println("The card you picked is " + rank[i] + " of " + suit[j]);
    }
    public static void main(String[] args) {
        new Card();
    }
}
//3.24