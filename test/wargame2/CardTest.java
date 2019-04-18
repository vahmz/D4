package wargame2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = new Card();
        Card.Suit expResult = null;
        Card.Suit result = instance.getSuit();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSuit method, of class Card.
     */
    @Test
    public void testSetSuit() {
        System.out.println("setSuit");
        Card.Suit suit = null;
        Card instance = new Card();
        instance.setSuit(suit);

    }

    /**
     * Test of getCardNum method, of class Card.
     */
    @Test
    public void testGetCardNum() {
        System.out.println("getCardNum");
        Card instance = new Card();
        int expResult = 0;
        int result = instance.getCardNum();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCardNum method, of class Card.
     */
    @Test
    public void testSetCardNum() {
        System.out.println("setCardNum");
        int cardNum = 0;
        Card instance = new Card();
        instance.setCardNum(cardNum);

    }


}
