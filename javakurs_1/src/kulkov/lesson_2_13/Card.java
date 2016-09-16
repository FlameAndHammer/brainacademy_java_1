package kulkov.lesson_2_13;

/**
 * Created by User on 13.09.2016.
 * Describing a card
 */
class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {             //Every card has suit and rank
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {                              //Override toString method to get correct info about cards
        return "The Card: " + cardRank + "_" + cardSuit;
    }
}
