package Jungle.Controller;


import java.util.Scanner;

public class GlobalController {

    public static void main(String[] args)
    {
        GlobalController globalController = new GlobalController();
        globalController.startGlobalController();
    }

    public KeyboardListener ManualListener = new ManualKBL();

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
        String input = "";
        Scanner scan = new Scanner(System.in);
        WelcomeKBL welcomeKBL = new WelcomeKBL();
        onWelcome();
        input = scan.nextLine();
        while(welcomeKBL.check(input))
        {
            input = scan.nextLine();
        }
        switch(input){
            case "Manual":
                onManual();
                break;
            case "Game":
                onGame();
                break;
            case "Quit":
                onQuit();
                break;
            default:
                onQuit();
        }


        scan.close();
    }

    /**
     * This method provides the logic to display the welcome page,
     * also it will interact with the WelcomPage in the View part.
     *
     */
    public void onWelcome()
    {
        System.out.println("Welcome!");
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
        GameController gameController = new GameController();
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
