package vityaz.com.brainacad.oop.testenum2;



public class Main {
    public static void main(String[] args) {
        Card[] cardDeck = new Card[Suit.values().length * Rank.values().length];
        int i = 0;
        for (Suit suitElement:Suit.values()) {
            for (Rank rankElement:Rank.values()) {
                cardDeck[i] = new Card(rankElement, suitElement);
                i++;
            }
        }
        for (int j = 0; j < cardDeck.length; j++) {
            System.out.println(cardDeck[j]);
        }
    }
}
