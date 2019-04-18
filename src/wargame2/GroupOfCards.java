package wargame2;

//GroupOfCards class
public class GroupOfCards extends Card {

    //Declaring Variables to make the connection with other classes
    private Card[] card = new Card[52];
    private Card[] playerDeck = new Card[52];
    private Card.Suit suit;
    private int num;

    //Constructor
    public GroupOfCards() {
        super();
        clubsDeck();
        diamondsDeck();
        heartsDeck();
        spadesDeck();
        makeTheCards();
    }

    //Making heart cards
    public void heartsDeck() {
        suit = Card.Suit.HEARTS;
        for (int i = 2; i <= 14; i++) {
            card[i - 2] = new Card(suit, i);
        }
    }

    //Making diamond cards
    public void diamondsDeck() {
        suit = Card.Suit.DIAMONDS;
        for (int i = 2; i <= 14; i++) {
            card[i - 2 + 13] = new Card(suit, i);
        }
    }

    //Making clubs cards
    public void clubsDeck() {
        suit = Card.Suit.CLUBS;
        for (int i = 2; i <= 14; i++) {
            card[i - 2 + 13 + 13] = new Card(suit, i);
        }
    }

    //Making spades cards
    public void spadesDeck() {
        suit = Card.Suit.SPADES;
        for (int i = 2; i <= 14; i++) {
            card[i - 2 + 13 + 13 + 13] = new Card(suit, i);
        }
    }

    //the method that randomize the cards
    public void makeTheCards() {
        for (int i = 0; i < 52; i++) {
            playerDeck[i] = card[(int) (Math.random() * 52)];

            for (int j = 0; j < i; j++) {
                if (playerDeck[i].equals(playerDeck[j])) {
                    //System.out.println("DUPLICATE FOUND: " + playerDeck[i]); //ENABLE FOR TESTING
                    playerDeck[i] = card[(int) (Math.random() * 52)];
                }
            }
            //System.out.println(playerDeck[i]); //Test
        }
    }

    public Card[] getCard() {

        return playerDeck;
    }

}
