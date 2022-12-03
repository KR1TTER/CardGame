import java.security.SecureRandom;

public class DeckOfCards {
    
    private static final SecureRandom random = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52;

    private Card[] deck = new Card[NUMBER_OF_CARDS];
    private int currentCard = 0;
    int high = 11;
    int low = 1;
       
    public DeckOfCards() { // Fills dekc of cards.

        String[] face = {"Ace", "2", "3", "4", "5", "6", "7", "8",
             "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (int count = 0; count < deck.length; count++) { // Populates the Deck
            deck[count] =
                new Card(face[count % 13], suits[count / 13]);
        }       
    }

    public void shuffle() { //SHuffles the deck of cards
        currentCard = 0;

        for (int first = 0; first < deck.length; first++) {
            int second = random.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    public Card dealCard() { //Deals out cards
        if (currentCard <= NUMBER_OF_CARDS) {
            return deck[currentCard++];
        }
        else {
            return null;
        }
    } 
}

