package Jungle.Controller;


import java.awt.event.KeyEvent;
import java.util.Scanner;

public class ManualKBL extends KeyboardListener{

    public void listen()
    {
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Manual====>");
        input = scan.nextLine();
        while(!check(input))
        {
            System.out.println("Wrong command, please try again.");
            System.out.print("Manual====>");
            input = scan.nextLine();
        }
        switch (input){
            case "Back":
                GlobalController globalController = new GlobalController();
                globalController.startGlobalController();
                break;
            case "Game":
                GameController gameController = new GameController();
                gameController.startGameController();
                break;
        }

    }
    /**
     * This method will override the method in KeyBoardListener class,
     * and it will be modified to help check whether the user correctly
     * input “r” to return or “q” to quit the system.
     * @param sentence command to be checked
     * @return check result
     *
     */
    @Override
    public boolean check(String sentence)
    {
        return sentence.equals("Back") || sentence.equals("Game");
    }


}
