package udovenko.labwork213;

/**
 * Created by gladi on 14.09.2016.
 */
public class TestEnum2 {
    public static void main(String[] args) {
        Card[] packOfCards = new Card[52];
        int cardIndex = 0;
        for(Card.Suit suit: Card.Suit.values()){
            for (Card.Rank rank: Card.Rank.values()){
                packOfCards[cardIndex++] = new Card(rank, suit);
            }
        }

        int countCard = 1;
        for (Card card: packOfCards){
            if (countCard%13 != 0) {
                System.out.print(card + ", ");
            } else {
                System.out.print(card + "\n");
            }
            countCard++;
        }
    }
}
