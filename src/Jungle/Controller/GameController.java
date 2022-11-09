package Jungle.Controller;

import Jungle.Model.Board;
import Jungle.Model.Player;


public class GameController {

    public Player P1;
    public Player P2;

    public Board GameBoard;

    public KeyboardListener GameListener = new GameKBL(P1, P2, GameBoard);


    /**
     * provide the logic for two players to play the game in turn,
     * there will be a while loop to ensure the game keep running,
     * only when one of the players quit or one player wins the game will the while loop be broken.
     *
     */
    public void startGameController()
    {

    }

    /**
     * check whether the game will be ended. The game will be
     * ended when a player quit the game or one of two players
     * wins the game. The return integer value will indicate the status of how the game ends.
     * @return end status
     *
     */
    public int checkEnd()
    {
        return 0;
    }
}
