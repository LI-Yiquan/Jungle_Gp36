package Jungle.Test;

import Jungle.Model.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

/**
 *  This test part will check the functions in Player
 *  To Test whether the game player is initialed correctly or not
 */

public class PlayerTest {
    Player p1;
    Player p2;
    @Test
    public void playerInitTest()
    {
        //To check whether the game player is initialed correctly or not
        p1 = new Player("Alice",GroupType.RED);
        p2 = new Player("Bob",GroupType.BLUE);

        assertSame("Alice", p1.getName());
        assertSame(p1.getGroup(), GroupType.RED);

        assertSame("Bob", p2.getName());
        assertSame(p2.getGroup(), GroupType.BLUE);

    }
}
