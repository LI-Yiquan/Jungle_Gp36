package Jungle.View;

public class GameRule implements Page {
    
    private String[] rule= {
        "                               Game   Manual                                    ",
        "VALID INPUT",
        "   PieceName Direction - move your piece.",
        "                 [PieceName] Elephant Lion Tiger Leopard Wolf Dog Cat Rat",
        "                 [Direction] w s a d for Up Down Left Right",
        "   Manual - check the manual.",
        "   Quit - quit the game.",
        " ",
        "DETAILS",
        "   The aim of the game is to place a piece in the opponent's den at the o",
        "   pponent's den at the opposite ends of the board. You can also win by c",
        "   apturing all opponent's pieces. Every piece can move one step once. On",
        "   ly rat can enter the river area,while lions and tigers can leap across",
        "    the river. Capturing a piece can be done simply by moving your piece ",
        "   onto the square occupied by the opponents. You can't go into your own ",
        "   den. Each animal piece can only capture an animal ranked lower or equa",
        "   l to itself. Elephant can't capture rat, while rat can capture elephan",
        "   t.Rat can capture the other rat if both are in the river. The three sq",
        "   uares around the den, act as traps for the oppnent pieces. Any opponent",
        "    piece in traps can be captured by any animal.",
    } ;

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
     * Print the game rule to the user
     */
    public void printRule(){
        System.out.println("- - - - - - - - - - -- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        for (String s : this.rule) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Game: return to game    Back: return to menu");
        System.out.println("- - - - - - - - - - -- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

    }

}
