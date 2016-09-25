package tretiak.labworks.work13;


public class Card {
    private Suit cardSuit;
    private Rank cardRank;
    public Card(Suit cardSuit, Rank cardRank){
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }
    @Override
    public String toString(){
        return "Suit: " + cardSuit + "Rank: " + cardRank;
    }
}
