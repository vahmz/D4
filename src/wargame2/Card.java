package wargame2;

//Card Class
public class Card {

    //enum used to declare the card types
    public enum Suit {
        HEARTS, SPADES, DIAMONDS, CLUBS
    }

    //Declaring the Suit and nubmer of the cards
    Suit suit;
    int cardNum;

    //Constructor (defult)
    public Card() {

    }

    //Constructor that sets the cards for GroupOfCards
    public Card(Suit suit, int cardNum) {
        this.setSuit(suit);
        this.setCardNum(cardNum);
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public String toString() {
        return cardNum + " of " + suit;
    }
}
