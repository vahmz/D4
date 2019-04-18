package wargame2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
     * Test of heartsDeck method, of class GroupOfCards.
     */
    @Test
    public void testHeartsDeck() {
        System.out.println("heartsDeck");
        GroupOfCards instance = new GroupOfCards();
        instance.heartsDeck();

    }

    /**
     * Test of diamondsDeck method, of class GroupOfCards.
     */
    @Test
    public void testDiamondsDeck() {
        System.out.println("diamondsDeck");
        GroupOfCards instance = new GroupOfCards();
        instance.diamondsDeck();

    }

    /**
     * Test of clubsDeck method, of class GroupOfCards.
     */
    @Test
    public void testClubsDeck() {
        System.out.println("clubsDeck");
        GroupOfCards instance = new GroupOfCards();
        instance.clubsDeck();

    }

    /**
     * Test of spadesDeck method, of class GroupOfCards.
     */
    @Test
    public void testSpadesDeck() {
        System.out.println("spadesDeck");
        GroupOfCards instance = new GroupOfCards();
        instance.spadesDeck();

    }

    /**
     * Test of makeTheCards method, of class GroupOfCards.
     */
    @Test
    public void testMakeTheCards() {
        System.out.println("makeTheCards");
        GroupOfCards instance = new GroupOfCards();
        instance.makeTheCards();

    }


    
}
