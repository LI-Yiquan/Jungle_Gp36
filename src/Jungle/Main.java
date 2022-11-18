package Jungle;

import Jungle.Controller.GlobalController;
import Jungle.Model.Board;
import Jungle.Model.GroupType;
import Jungle.Model.Player;

public class Main {

    //Jungle Game can be triggered here
    public static void main(String[] args) {
        Player P1 = new Player("Alice", GroupType.RED);
        Player P2 = new Player("Bob",GroupType.BLUE);
        Board board = new Board();
        GlobalController globalController = new GlobalController(P1,P2,board);
        globalController.startGlobalController(0);
    }
}














