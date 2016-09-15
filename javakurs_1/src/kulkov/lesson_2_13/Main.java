package kulkov.lesson_2_13;

import java.util.Scanner;

/**
 * Created by User on 12.09.2016.
 * Practice with enumerations
 */
public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek day : MyDayOfWeek.values()) {              //Treat enumeration as array of constants
            System.out.println(day);                                //Print every element of it to the console
        }
        System.out.println();       //lines separator

        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            switch (day) {                                          //Use enum to control a switch statement
                case MONDAY:
                    System.out.println("My Java day: " + day);
                    break;
                case WEDNESDAY:
                    System.out.println("My Java day: " + day);
                    break;
                case FRIDAY:
                    System.out.println("My Java day: " + day);
                    break;
            }
        }
        System.out.println();       //lines separator

        Scanner sc = new Scanner(System.in);                        //Create Scanner instance to read from console. Then search for constant in enum
        MyDayOfWeek.valueOf(sc.nextLine().toUpperCase()).nextDay(); //Which coincide with value from console, and invoke nextDay() method to it
        System.out.println();       //lines separator

        Card[] cardDeck = new Card[52];                             //Create a card deck as an array of cards
        int i = 0;                                                  //Every card in a deck should be unique
        for (Suit suit : Suit.values()) {                           //To achieve this use nested loops
            for (Rank rank : Rank.values()) {                       //First create every rank card for one suit, then repeat for the others
                cardDeck[i] = new Card(suit, rank);                 //Call Card constructor
                i++;                                                //Increment to define a new card
            }
        }
        for (Card card : cardDeck) {                                //For each card in the card deck
            System.out.println(card);                               //Print an info about it
        }
    }
}
