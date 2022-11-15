package Jungle.View;
import Jungle.Model.*;



public class Map implements Page{
    /** current game board */
    private Board gameBoard;
    /** the game informations of players */
    private String gameInfo;
    /** tell players the standard format of their input */
    private String inputRequirement;
    /** the Game Rule page for the game board */
    private GameRule ruleInMap;
    /** the Game Player*/
    private Player P1,P2;
    
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
        String p1_info = P1.getName()+" has "+Integer.toString(P1.PieceNum)+"pieces now.\n";
        String p2_info = P2.getName()+" has "+Integer.toString(P2.PieceNum)+"pieces now.\n";
        gameInfo = p1_info+p2_info;
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
        inputRequirement ="Please input the piece name you want to move and the movement\n"+
                "The movement is consist 4 directions and 2 actions\n"+
                "Directions: [Up: u,  Down: d, Left: l, Right:r]; Actions:[jump, walk]"+
                "The input format should be [Piece,Direction,Action], eg(Lion,l,jump)";
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
        int r = 1;
        int c = 1;
        for(int i= 0; i< 19; i++) {
            if (i % 2 == 0)
            {
                for (int j = 0; j < 15; j++) {
                    if (j % 2 == 0) {System.out.print("|");}
                    else {System.out.print("————");}
                }
            }
            else{
                for (int j = 0; j < 15; j++) {
                    if (j % 2 == 0) {
                        System.out.print('|');
                    }
                    else {
                        switch(getGameBoard().board[r][c].l_type){
                            case LAND:
                                for(int p = 0; p<7;p++){
                                    //Red color for Player 1
                                    if(P1.pieces[p].getCol()==c && P1.pieces[p].getRow()==r){
                                        switch(Pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[31;4m 鼠  \033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[31;4m 象  \033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[31;4m 猫  \033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[31;4m 狗  \033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[31;4m 狮  \033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[31;4m 狼  \033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[31;4m 虎  \033[0m");
                                                break;
                                        }
                                    }
                                    //Blue color for Player 2
                                    if(P2.pieces[p].getCol()==c && P2.pieces[p].getRow()==r){
                                        switch(Pieces[0].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[34;4m 鼠  \033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[34;4m 象  \033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[34;4m 猫  \033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[34;4m 狗  \033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[34;4m 狮  \033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[34;4m 狼  \033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[34;4m 虎  \033[0m");
                                                break;
                                        }
                                    }
                                }
                                System.out.print("    ");
                                break;
                            case TRAP:
                                for(int p=0;p<7;p++){
                                    if(P1.pieces[p].getCol()==c && P1.pieces[p].getRow()==r){
                                        switch(Pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[31;4mX鼠 X\033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[31;4mX象 X\033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[31;4mX猫 X\033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[31;4mX狗 X\033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[31;4mX狮 X\033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[31;4mX狼 X\033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[31;4mX虎 X\033[0m");
                                                break;
                                        }
                                    }
                                    if(P2.pieces[p].getCol()==c && P2.pieces[p].getRow()==r){
                                        switch(Pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[34;4mX鼠 X\033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[34;4mX象 X\033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[34;4mX猫 X\033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[34;4mX狗 X\033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[34;4mX狮 X\033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[34;4mX狼 X\033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[34;4mX虎 X\033[0m");
                                                break;
                                        }
                                    }
                                }
                                System.out.print("XXXX");
                                break;
                            case RIVER:
                                for(int p=0;p<7;p++){
                                    if(P1.pieces[p].getCol()==c && P1.pieces[p].getRow()==r){
                                        switch(Pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[31;4m~鼠 ~\033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[31;4m~象 ~\033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[31;4m~猫 ~\033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[31;4m~狗 ~\033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[31;4m~狮 ~\033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[31;4m~狼 ~\033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[31;4m~虎 ~\033[0m");
                                                break;
                                        }
                                    }
                                    if(P2.pieces[p].getCol()==c && P2.pieces[p].getRow()==r){
                                        switch(Pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[34;4m~鼠 ~\033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[34;4m~象 ~\033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[34;4m~猫 ~\033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[34;4m~狗 ~\033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[34;4m~狮 ~\033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[34;4m~狼 ~\033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[34;4m~虎 ~\033[0m");
                                                break;
                                        }
                                    }
                                }
                                System.out.print("~~~~");
                                break;
                            case DEN:
                                for(int p=0;p<7;p++){
                                    if(P1.pieces[p].getCol()==c && P1.pieces[p].getRow()==r){
                                        switch(Pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[31;4m*鼠 *\033[0m");
                                                break;
                                        }
                                    }
                                    if(P2.pieces[p].getCol()==c && P2.pieces[p].getRow()==r){
                                        switch(Pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[34;4m*鼠 *\033[0m");
                                                break;
                                        }
                                    }
                                }
                                System.out.print("****");
                                break;
                        }
                        c++;
                    }
                }
                r++;
                c=1;
            }
            System.out.println();
        }
    }

    /**
     * Print the game information to user
     */
    public void printGameInfo(){
        System.out.println()
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
