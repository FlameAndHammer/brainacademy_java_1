package torba.Lab_2_13;

public class Card {

    private Suit cardSuit;
    private Rank cardRank;

    public Card (Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public String toString() {
        return "" + cardRank + " " + cardSuit;
    }

}
