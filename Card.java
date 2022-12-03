// Card.java
// Card class represents a playing card

public class Card {
    private final String face;
    private final String suit;

    // two-argument constructor initializes card's face and suit
    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }
    
    // returns String representation of Card
    public String toString() {
        return face + " of " + suit;
    }
}
