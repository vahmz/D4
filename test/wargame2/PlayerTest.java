package wargame2;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of SetCardGroups method, of class Player.
     */
    @Test
    public void testSetCardGroups() {
        System.out.println("SetCardGroups");
        Player instance = new Player();
        instance.SetCardGroups();

    }


    /**
     * Test of setPlayers method, of class Player.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        ArrayList<Card> players = null;
        Player.setPlayers(players);

    }

    /**
     * Test of setAi method, of class Player.
     */
    @Test
    public void testSetAi() {
        System.out.println("setAi");
        ArrayList<Card> ai = null;
        Player.setAi(ai);

    }


    /**
     * Test of LostGame method, of class Player.
     */
    @Test
    public void testLostGame() {
        System.out.println("LostGame");
        Player.LostGame();

    }

    /**
     * Test of WinGame method, of class Player.
     */
    @Test
    public void testWinGame() {
        System.out.println("WinGame");
        Player.WinGame();

    }

}
