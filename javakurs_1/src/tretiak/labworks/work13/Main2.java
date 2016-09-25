package tretiak.labworks.work13;


public class Main2 {
    public static void main(String[] args){
        Card[] cards = new Card[52];
        int ind = 0;
        for (Rank r : Rank.values()){
            for (Suit s : Suit.values()){
                cards[ind] = new Card(s, r);
                ind++;
            }
        }
        for (Card card :  cards){
            System.out.println(card);
        }
    }
}
