package Jungle.Controller;

import Jungle.Model.Board;
import Jungle.Model.Piece;
import Jungle.Model.Player;

public class GameKBL extends KeyboardListener{


    public Player P1;
    public Player P2;

    public Board GameBoard;

    public GameKBL(Player P1, Player P2, Board GameBoard)
    {

    }

    /**
     * check whether the format of user input is valid or invalid
     * @param sentence command to be checked
     * @return check result
     *
     *
     *
     *
     */
    @Override
    public boolean check(String sentence)
    {
        return true;
    }

    /**
     * check whether a piece will be in a river after conducting a movement.
     *
     */
    public boolean checkInRiver()
    {
        return true;
    }

    /**
     * check whether a piece will be in a trap after conducting a movement.
     *
     */
    public boolean checkInTrap()
    {
        return true;
    }

    /**
     * check whether a piece will be in a den after conducting a movement.
     *
     */
    public boolean checkInDen()
    {
        return true;
    }

    /**
     * modify the pieces information stored in Player class.
     *
     */


    public void move(String command)
    {
        
    }

}
