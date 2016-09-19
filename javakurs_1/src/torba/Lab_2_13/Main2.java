package torba.Lab_2_13;

public class Main2 {

    public static void main(String[] args) {

        int ind=0;
        Card[] cards = new Card[52];

        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                cards[ind] = new Card(s, r);
                ind = ind + 1;            }
        }

        for (Card card : cards) {
            System.out.println(card);
        }


    }

}
