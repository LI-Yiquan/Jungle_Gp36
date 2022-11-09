package Jungle.View;
import Jungle.Model.Board;
import Jungle.Model.Player;



public class Map implements Page{
    /** current game board */
    private Board gameBoard;
    /** the game informations of players */
    private String gameInfo;
    /** tell players the standard format of their input */
    private String inputRequirement;
    /** the Game Rule page for the game board */
    private GameRule ruleInMap;

    
    /** Initialize the game board */
    public Map(Board _board){

    }

    /**
     * Set the game board
     * @param gameBoard
     */
    public void setGameBoard(Board gameBoard) {
       
    }
    
    /**
     * Get the game board
     * @return the current board
     */
    public Board getGameBoard() {
        return gameBoard;
    }

    /**
     * Set the game information, such as what is the last step, the mumber of pieces of player 1 and 2
     * @param gameInfo
     */
    public void setGameInfo(String gameInfo) {
       
    }
    
    /**
     * Get the game information, such as what is the last step, the mumber of pieces of player 1 and 2
     * @return the game infoemation
     */
    public String getGameInfo() {
        return gameInfo;
    }
    
    /**
     * Set the standard format of players' input 
     * "u","d","l","r" means move up , down, left, right seperately
     * user's input should follow the format of "row column direction action"
     * (4 directions: "u","d","l","r"  2 actions:"jump","walk")
     * If player want to jump left the piece which is in the first row , second colomn , he should enter "1,2,l,jump". 
     * Two adjacent elements are separated by ','.
     * @param inputRequirement
     */
    public void setInputRequirement(String inputRequirement) {
        
    }
    
    /**
     * Get the standard format of players' input 
     * @return the input reqirements
     */
    public String getInputRequirement() {
        return inputRequirement;
    }
    
    /**
     * Set the GameRule page for map page
     * @param ruleInMap
     */
    public void setRuleInMap(Page ruleInMap) {
        
    }

    /**
     * Get the GameRule page for map page
     * @return GameRule Page
     */
    public GameRule getRuleInMap() {
        return ruleInMap;
    }

    /**
     * Print the chessboard
     */
    public void printBoard(){

    }

    /**
     * Print the game information to user
     */
    public void printGameInfo(){
        
    }

    /**
     * Print the input requirements to user
     */
    public void printInputRequiement(){
        
    }
    
    /**
     * Print the content of game rule
     */
    public void printRule(){
        
    }
    
    /**
     * Print the quit message
     */
    public void printToQuit(){
        
    }
    
    /**
     * Print the game result
     */
    public void printResult(){
        
    }
    
    /**
     * Print the user prompt such as "Player [Player_name] enters the next step:"
     * @param player
     */
    public void printPlayerPrompt(Player player){

    }
    
    /**
     * Scan the player's input string and return the input
     * @return player's input
     */
    public String scanPlayerInput(){
        String input=null;

        return input;
    }
   
    /**
     * Preliminary check whether the input is valid (only check the format of the input, not the logic)
     * Returns an array of processed strings if the input passes preliminary checks.
     * If the check fails, print a prompt statement.
     * @return processed player input
     */
    public String[] processPlayerInput(){
           String[] processedInput=null;
           
           return processedInput;
    }


}
