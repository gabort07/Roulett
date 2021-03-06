package Roulett;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player player;

    @Before
    public void setUp() throws Exception {
        player = new Martingales(0,20,10000,"red");
    }

    @Test
    public void addWinToBudget() {
        player.setBudget(100);
        assertEquals(100, player.getBudget());
        player.addWin(50);
        assertEquals(150, player.getBudget());
    }

    @Test
    public void divideLossFromBudget() {
        player.setBudget(100);
        player.addLoose(70);
        assertEquals(30,player.getBudget());
    }

    @Test
    public void doubleColorStrategy() {

    }
}