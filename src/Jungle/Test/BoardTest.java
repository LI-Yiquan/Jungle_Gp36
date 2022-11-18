package Jungle.Test;

import Jungle.Model.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *  This test part will check the functions in Board
 */
public class BoardTest {

    Board gameboard;

    @Test
    public void boardInitTest()
    {
        //To check whether the game board is initialed correctly or not

        //Check the location type of each element in board
        gameboard = new Board();
        assertEquals(LocationType.TRAP, gameboard.board[1][3].getLocationType());
        assertEquals(LocationType.DEN, gameboard.board[1][4].getLocationType());
        assertEquals(LocationType.RIVER, gameboard.board[4][2].getLocationType());

        //Check the group type
        assertEquals(GroupType.RED, gameboard.board[1][3].getGroup());
        assertEquals(GroupType.RED, gameboard.board[1][4].getGroup());
        assertEquals(GroupType.BLUE, gameboard.board[9][3].getGroup());
        assertEquals(GroupType.BLUE, gameboard.board[8][4].getGroup());
        assertEquals(GroupType.OTHER, gameboard.board[4][2].getGroup());

        //Check the location row
        assertEquals(1, gameboard.board[1][3].getRow());
        assertEquals(2, gameboard.board[2][3].getRow());
        assertEquals(3, gameboard.board[3][3].getRow());
        assertEquals(4, gameboard.board[4][3].getRow());

        //Check the location col
        assertEquals(1, gameboard.board[7][1].getCol());
        assertEquals(2, gameboard.board[7][2].getCol());
        assertEquals(3, gameboard.board[7][3].getCol());
        assertEquals(4, gameboard.board[7][4].getCol());
    }
}
