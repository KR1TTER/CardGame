// DeckOfCardsTest.java
// Card shuffling and dealing


import java.util.*;

public class DeckOfCardsTest {
   
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();
        Scanner s = new Scanner(System.in);
        String answer = "";
        boolean end = false;
        System.out.println("Player");
        
        for(int i = 1; i <= 2; i++) {   
            System.out.println(myDeckOfCards.dealCard());            
             if (i % 4 == 0) {
                 System.out.println();
            }
        }

        while(end == false) { //Allows the player to ask for another card or stay.
            answer = s.next();
            if (answer.startsWith("h") || answer.startsWith("H")) {
                System.out.println(myDeckOfCards.dealCard());
            }  else if (answer.startsWith("s") || answer.startsWith("S")) {
                end = true;
            } else {
                System.out.println("Invalid Response.");
            }
        }
    s.close();   
    }
}
