package Jungle.Controller;

import java.awt.event.*;
import java.util.Scanner;

/**
 *
 */

public class WelcomeKBL extends KeyboardListener{

    public int listen()
    {
        int MODE;
        String input;
        final Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        while(!check(input))
        {
            input = scan.nextLine();
        }
        switch (input){
            case "Manual": MODE=1;break;
            case "Game": MODE=2;break;
            case "Quit": MODE=0;break;
            default: MODE=0;
        }
        return MODE;
    }
    @Override
    public boolean check(String sentence)
    {
        //check format
        return true;
    }



}
