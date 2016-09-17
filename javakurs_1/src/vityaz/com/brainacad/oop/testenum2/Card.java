package vityaz.com.brainacad.oop.testenum2;


public class Card {
    private Rank cardRank;
    private Suit cardSuit;

    public Card(Rank cardRank, Suit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    @Override
    public String toString() {
        return  "The card: " + cardRank +"_"+ cardSuit;
    }
}
