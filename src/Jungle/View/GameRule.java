package Jungle.View;

import java.util.Scanner;

public class GameRule implements Page {
    
    private String[] rule= {
        "                               Game   Rule                                                      ",
        "   Animal Chess is played with two players, red and blue.The aim of the g",
        "   ame is to place a piece in the opponent's den at the opposite ends of ",
        "   the board. You can also win by capturing all opponent's pieces.",
        "   ",
        "   Movement - Every piece can move one step once. Only rat can enter the ",
        "   river area,while lions and tigers can leap across the river. Capturing",
        "    a piece can be done simply by moving your piece onto the square occup",
        "   ied by the opponents. You can't go into your own den.",
        "   ",
        "   Capturing pieces - Each animal piece can only capture an animal ranked",
        "   lower or equal to itself. Elephant can't capture rat, while rat can ca",
        "   pture elephant.Rat can capture the other rat if both are in the river.",
        "   ",
        "   Traps - The three squares around the den, act as traps for the oppnent",
        "   pieces. Any opponent piece in traps can be captured by any animal.",
        "   ",
        "   More details: http://ancientchess.com/page/play-doushouqi.htm",
    } ;  

    private int returnTo;

    /**
     * Set the game rule
     * @param content the content of game rule
     */
    public void setRule(String[] content){
         this.rule = content;
    }
    
    /**
     * Get the game rule
     * @return the explanation of game rule
     */
    public String[] getRule(){

        return this.rule;
    }

    /**
     * If returnTo is 1, the user will return to welcome page.
     * If returnTo is 2, the user will return to GameBoard (Map page).
     * @param returnTo
     */
    public void setReturnTo(int returnTo) {
        this.returnTo = returnTo;
    }

    /**
     * Get the return location.
     * @return the number of returnTo
     */
    public int getReturnTo() {
        return returnTo;
    }

    /**
     * Print the game rule to the user
     */
    public void printRule(){
        System.out.println("- - - - - - - - - - -- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        for (int line=0; line<this.rule.length;line++){
            System.out.println(this.rule[line]);
        }
        System.out.println();
        System.out.println("Game: return to game    Back: return to menu");
        System.out.println("- - - - - - - - - - -- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

    }

    /**
     * Print the quit message to players.
     * such as "One of the player has quited the game. Thank you for your playing."
     */
    public void printToQuit(){
        System.out.println("One of the player has quited the game. Thank you for your playing.");
    }
 
    /**
     * Action as return and quit button on the GameRule page.
     * It will print "Please enter "R" to close the GameRule page or enter "Q" to quit the game:  " and waiting until player inputs "R" or "Q".
     * If "R" is entered, it will return the returnTo number to indicate which page to open.
     * @return the number of returnTo 
     */
    public int playerPrompt(){
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Please enter 'R' to close the GameRule page or enter 'Q' to quit the game:R" );
            String input = in.next();
            if(input.equals("R")|| input.equals("r")){
                in.close();
                return this.getReturnTo();
            }else if(input.equals("q")|| input.equals("Q")){
                in.close();
                printToQuit();
                return 0;
            }else{
                System.out.println("Wrong Input ! You can only enter R/Q.") ; 
            }
        }   
    }
    public static void main(String[] args) {
       GameRule a=new GameRule();
       a.printRule();
       //int k = a.playerPrompt();
    }

}
