package Jungle.Controller;

import Jungle.Model.*;


import java.util.Scanner;


public class GameController {

    public Player P1;
    public Player P2;

    public Board board;

    public GameKBL gameKBL;


    /**
     * provide the logic for two players to play the game in turn,
     * there will be a while loop to ensure the game keep running,
     * only when one of the players quit or one player wins the game will the while loop be broken.
     *
     */
    public void startGameController()
    {
        P1 = new Player("Alice",GroupType.RED);
        P2 = new Player("Benjen",GroupType.BLUE);
        board = new Board();
        gameKBL = new GameKBL(P1,P2,board);
        int turn = 0;
        boolean LOCK = true;
        while(LOCK)
        {
            if(turn==0) gameKBL.listen(P1);
            else gameKBL.listen(P2);
            turn = 1 - turn;
            if(checkEnd().equals("P1"))
            {
                System.out.println("P1 wins the game!");
                LOCK = false;
            }
            else if(checkEnd().equals("P2"))
            {
                System.out.println("P2 wins the game!");
                LOCK = false;
            }

        }

    }

    /**
     * check whether the game will be ended. The game will be
     * ended when a player quit the game or one of two players
     * wins the game. The return integer value will indicate the status of how the game ends.
     * @return end status
     *
     */
    public String checkEnd()
    {
        if(P1.PieceNum == 0)  return "P2";
        if(P2.PieceNum == 0)  return "P1";
        for(int i=0;i<8;i++)
        {
            if(P1.pieces[i].inDen) return "P1";
            if(P2.pieces[i].inDen) return "P2";
        }
        return "continue";
    }
}
