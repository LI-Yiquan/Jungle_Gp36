package Jungle.Controller;


import Jungle.Model.Board;
import Jungle.Model.Player;
import Jungle.View.GameRule;
import Jungle.View.WelcomePage;

public class GlobalController {

    Player P1;
    Player P2;
    Board board;
    public GlobalController(Player p1, Player p2,Board board)
    {
       this.P1 = p1;
       this.P2 = p2;
       this.board = board;
    }
    /**
     * control the overall logic of this system, once the method
     * is triggered, there will be a while loop to ensure the system
     * will keep running unless the user want to quit the game.
     * This method will also trigger some methods to help the user
     * switch between different pages, specifically we provide game
     * page, manual page and the welcome page. The game will be started
     * after the user switch to game page.
     *
     *
     *
     */
    public void startGlobalController()
    {
        int MODE;
        WelcomeKBL welcomeKBL = new WelcomeKBL();
        onWelcome();
        MODE = welcomeKBL.listen();
        switch(MODE){
            case 1:
                onManual();
                break;
            case 2:
                onGame();
                break;
            case 3:
                onQuit();
                break;
            default:
                onQuit();
        }
        //scan.close();
    }

    /**
     * This method provides the logic to display the welcome page,
     * also it will interact with the WelcomPage in the View part.
     *
     */
    public void onWelcome()
    {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.printWelcomePage();
    }

    /**
     * This method provides the logic to display the manual page,
     * it will interact with GameRule class in the View part and
     * the ManualKBL class in the Controller part.
     *
     */
    public void onManual()
    {
        //show manual
        System.out.println("Manual!");
        GameRule a=new GameRule();
        a.printRule();
        ManualKBL manualKBL = new ManualKBL();
        manualKBL.listen(P1,P2,board);
    }

    /**
     * This method provides the logic to trigger the game through
     * calling the corresponding methods in the GameController class
     * in the Controller part, also it will call Map class in the
     * View part to display the game map for the users.
     *
     */
    public void onGame()
    {
        //start game
        System.out.println("Game!");
        GameController gameController = new GameController(P1, P2, board);
        gameController.startGameController();
    }

    /**
     * This method provides the logic to quit the system.
     *
     */
    public void onQuit()
    {
        //quit the game
        System.out.println("Quit!");
    }

}
