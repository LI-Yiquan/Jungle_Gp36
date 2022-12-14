package Jungle.Controller;

import Jungle.Model.*;
import Jungle.View.Map;


public class GameController {

    public Player P1;
    public Player P2;
    public Board board;
    public GameKBL gameKBL;

    public GameController(Player p1,Player p2, Board board)
    {
        P1 = p1;
        P2 = p2;
        this.board = board;
    }
    /**
     * provide the logic for two players to play the game in turn,
     * there will exist a 'while' loop to ensure the game keep running,
     * only when one of the players quit or one player wins the game will the while loop be broken.
     *
     */
    public void startGameController(int turn)
    {
        gameKBL = new GameKBL(P1,P2,board);
        boolean LOCK = true;
        Map map = new Map();
        map.printBoard(board,P1,P2);
        while(LOCK)
        {
            if(turn==0) gameKBL.listen(P1);
            else gameKBL.listen(P2);
            map.printBoard(board,P1,P2);
            turn = 1 - turn;
            switch(checkEnd()){
                case "P1":
                    System.out.println("\033[31;4mAlice\033[0m"+" wins the game!");
                    LOCK = false;
                    break;
                case "P2":
                    System.out.println("\033[34;4mBob\033[0m"+" wins the game!");
                    LOCK = false;
                    break;
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
        if(P1.PieceNum == 0) return "P2";
        if(P2.PieceNum == 0)  return "P1";
        for(int i=0;i<8;i++)
        {
            if(P1.pieces[i].inDen) return "P1";
            if(P2.pieces[i].inDen) return "P2";
        }
        return "continue";
    }
}
