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
        Scanner scan = new Scanner(System.in);
        String input = "";
        boolean LOCK = true;
        while(LOCK)
        {
            input = scan.nextLine();
            while(!gameKBL.check(input))
            {
                scan = new Scanner(System.in);
                input = scan.nextLine();
            }
            gameKBL.move(input);
            if(checkEnd()) LOCK = false;
        }
        scan.close();
    }

    /**
     * check whether the game will be ended. The game will be
     * ended when a player quit the game or one of two players
     * wins the game. The return integer value will indicate the status of how the game ends.
     * @return end status
     *
     */
    public boolean checkEnd()
    {
        return true;
    }
}
