package Jungle.View;
public class GameRule implements Page {
    private String rule;
    private int returnTo;

    /**
     * Set the game rule
     * @param content the content of game rule
     */
    public void setRule(String content){

    }
    
    /**
     * Get the game rule
     * @return the explanation of game rule
     */
    public String getRule(){

        return this.rule;
    }

    /**
     * If returnTo is 1, the user will return to welcome page.
     * If returnTo is 2, the user will return to GameBoard (Map page).
     * @param returnTo
     */
    public void setReturnTo(int returnTo) {
        
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

    }

    /**
     * Print the quit message to players.
     * such as "One of the player has quited the game. Thank you for your playing."
     */
    public void printToQuit(){

    }
 
    /**
     * Action as return and quit button on the GameRule page.
     * It will print "Please enter "R" to close the GameRule page or enter "Q" to quit the game:  " and waiting until player inputs "R" or "Q".
     * If "R" is entered, it will return the returnTo number to indicate which page to open.
     * @return the number of returnTo 
     */
    public int playerPrompt(){
        
        return this.getReturnTo();
    }

}
