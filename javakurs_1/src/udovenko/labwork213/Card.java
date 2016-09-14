package udovenko.labwork213;

/**
 * Created by gladi on 14.09.2016.
 */
class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Rank cardRank, Suit cardSuit) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString(){
        return cardRank.name() + "_" + cardSuit.name();
    }
}
