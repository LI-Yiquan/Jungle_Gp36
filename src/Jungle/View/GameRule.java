package Jungle.View;

import java.util.Scanner;

public class GameRule implements Page {
    
    private String[] rule= {
        "Animal Chess is played with two players, red and black. ",
        "The aim of the game is to place a piece in the opponent's den at opposite ends of the board. ",
        "You can also win by capturing all of the opponent's pieces.",
        "Movement - Every piece can move one step either forward, backward, left, or right, with some rules.",
        "No animal but the mouse can enter the river, while lions and tigers can leap across the river, either sideways or forward/backward. ",
        "Move pieces by clicking on a piece - a blue box should appear - and clicking on the target square.",
        "Capturing a piece can be done simply by moving your piece onto the square occupied by the opponents.",
        "If a move is illegal, the chessboard will not respond to your second click. You cannot go into your own den.",
        "Capturing pieces - Each piece corresponds to an animal, namely mouse, cat, dog, wolf, leopard, tiger, lion, and elephant.",
        "Each animal piece can only capture an animal ranked lower or equal to itself.",
        "The exception is that the elephant cannot capture the mouse, while the mouse can capture the elephant.",
        "No piece can capture the other while either is in the river.",
        " A mouse can capture the other mouse if both are in the river.",
        "Traps - The three squares around the den,act as traps for the opponent pieces.",
        "Any opponent piece occupying one of the traps loses its ranking and can be captured by any animal.",
        "The rank is : 1.Rat 2.Cat 3.Dog 4.Wolf 5.Leopard 6.Tiger 7.Lion 8.Elephant",
        "Further descriptions/instructions of this game can be found through this link :http://ancientchess.com/page/play-doushouqi.htm"
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
        System.out.println();
        for (int line=0; line<this.rule.length;line++){
            System.out.println(this.rule[line]);
        }
        System.out.println();

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
