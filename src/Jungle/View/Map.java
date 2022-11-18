package Jungle.View;
import Jungle.Model.Board;
import Jungle.Model.*;

public class Map implements Page{


    public static void main(String[] args)
    {
        Board gameBoard = new Board();
        Player P1 = new Player("Alice", GroupType.RED);
        Player P2 = new Player("Bob",GroupType.BLUE);
        Map map = new Map();
        map.printBoard(gameBoard, P1, P2);
    }
    /** current game board */
    private Board gameBoard;
    /** the Game Rule page for the game board */
    private GameRule ruleInMap;

    /**
     * Get the game board
     * @return the current board
     */
    public Board getGameBoard() {
        return gameBoard;
    }


    /**
     * Print the chessboard
     */
    public void printBoard(Board gameBoard, Player P1, Player P2){
        this.gameBoard=gameBoard;
        int lock = 0;
        int r = 1;
        int c = 1;
        System.out.println("- - - - - - - - - - -- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println();
        for(int i= 0; i< 19; i++) {
            if (i % 2 == 0)
            {
                for (int j = 0; j < 15; j++) {
                    if (i==0 & j==14){
                        System.out.print("|              中英文对照表");
                    }
                    else if (i==2 & j==14){
                        System.out.print("|    Chinese-English Comparison Table");
                    }
                    else if (i==4 & j==14){
                        System.out.print("|       1. 鼠  Rat      2. 猫  Cat");
                    }
                    else if (i==6 & j==14){
                        System.out.print("|       3. 狗  Dog      4. 狼  Wolf");
                    }
                    else if (i==8 & j==14){
                        System.out.print("|       5. 豹  Leopard  6. 虎  Tiger");
                    }
                    else if (i==10 & j==14){
                        System.out.print("|       7. 狮  Lion     8. 象  Elephant");
                    }else if (i==12 & j==14){
                        System.out.print("|    数字代表等级  Number means the rank");
                    }else if (i==14 & j==14){
                        System.out.print("|          兽穴    Den    ****   ");
                    }else if (i==16 & j==14){
                        System.out.print("|          陷阱    Trap   XXXX   ");
                    }else if (i==18 & j==14){
                        System.out.print("|          河流    River  ~~~~   ");
                    }
                    else if(j % 2 == 0) {System.out.print("|");}
                    else {System.out.print("————");}
                }
            }
            else{
                for (int j = 0; j < 15; j++) {
                    if (j % 2 == 0) {
                        System.out.print('|');
                    }
                    else {
                        switch(getGameBoard().board[10-r][c].l_type){
                            case LAND:
                                lock =0;
                                for(int p = 0; p<8;p++){
                                    //Red color for Player 1
                                    if(P1.pieces[p].getCol()==c && 10-P1.pieces[p].getRow()==r&&P1.pieces[p].alive){
                                        lock = 1;
                                        switch(P1.pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[31;4m 鼠 \033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[31;4m 象 \033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[31;4m 猫 \033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[31;4m 狗 \033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[31;4m 狮 \033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[31;4m 狼 \033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[31;4m 虎 \033[0m");
                                                break;
                                            case Leopard:
                                                System.out.print("\033[31;4m 豹 \033[0m");
                                                break;
                                        }
                                    }
                                    //Blue color for Player 2
                                    if(P2.pieces[p].getCol()==c && 10-P2.pieces[p].getRow()==r&&P2.pieces[p].alive){
                                        lock = 1;
                                        switch(P2.pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[34;4m 鼠 \033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[34;4m 象 \033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[34;4m 猫 \033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[34;4m 狗 \033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[34;4m 狮 \033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[34;4m 狼 \033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[34;4m 虎 \033[0m");
                                                break;
                                            case Leopard:
                                                System.out.print("\033[34;4m 豹 \033[0m");
                                                break;
                                        }
                                    }
                                }
                                if(lock==0) System.out.print("    ");
                                break;
                            case TRAP:
                                lock = 0;
                                for(int p=0;p<8;p++){
                                    if(P1.pieces[p].getCol()==c && 10-P1.pieces[p].getRow()==r&&P1.pieces[p].alive){
                                        lock = 1;
                                        switch(P1.pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[31;4mX鼠X\033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[31;4mX象X\033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[31;4mX猫X\033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[31;4mX狗X\033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[31;4mX狮X\033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[31;4mX狼X\033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[31;4mX虎X\033[0m");
                                                break;
                                            case Leopard:
                                                System.out.print("\033[31;4mX豹X\033[0m");
                                                break;
                                        }
                                    }
                                    if(P2.pieces[p].getCol()==c && 10-P2.pieces[p].getRow()==r&&P2.pieces[p].alive){
                                        lock = 1;
                                        switch(P2.pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[34;4mX鼠X\033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[34;4mX象X\033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[34;4mX猫X\033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[34;4mX狗X\033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[34;4mX狮X\033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[34;4mX狼X\033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[34;4mX虎X\033[0m");
                                                break;
                                            case Leopard:
                                                System.out.print("\033[34;4mX豹X\033[0m");
                                                break;
                                        }
                                    }
                                }
                                if(lock==0) System.out.print("XXXX");
                                break;
                            case RIVER:
                                lock = 0;
                                for(int p=0;p<8;p++){
                                    if(P1.pieces[p].getCol()==c && 10-P1.pieces[p].getRow()==r&&P1.pieces[p].alive){
                                        lock = 1;
                                        switch(P1.pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[31;4m~鼠~\033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[31;4m~象~\033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[31;4m~猫~\033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[31;4m~狗~\033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[31;4m~狮~\033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[31;4m~狼~\033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[31;4m~虎~\033[0m");
                                                break;
                                            case Leopard:
                                                System.out.print("\033[31;4m~豹~\033[0m");
                                                break;
                                        }
                                    }
                                    if(P2.pieces[p].getCol()==c && 10-P2.pieces[p].getRow()==r&&P2.pieces[p].alive){
                                        lock = 1;
                                        switch(P2.pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[34;4m~鼠~\033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[34;4m~象~\033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[34;4m~猫~\033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[34;4m~狗~\033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[34;4m~狮~\033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[34;4m~狼~\033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[34;4m~虎~\033[0m");
                                                break;
                                            case Leopard:
                                                System.out.print("\033[34;4m~豹~\033[0m");
                                                break;
                                        }
                                    }
                                }
                                if(lock==0) System.out.print("~~~~");
                                break;
                            case DEN:
                                lock = 0 ;
                                for(int p=0;p<8;p++){
                                    if(P1.pieces[p].getCol()==c && 10-P1.pieces[p].getRow()==r&&P1.pieces[p].alive){
                                        lock = 1;
                                        switch(P1.pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[31;4m*鼠*\033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[31;4m*象*\033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[31;4m*猫*\033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[31;4m*狗*\033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[31;4m*狮*\033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[31;4m*狼*\033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[31;4m*虎*\033[0m");
                                                break;
                                            case Leopard:
                                                System.out.print("\033[31;4m*豹*\033[0m");
                                                break;
                                        }
                                    }
                                    if(P2.pieces[p].getCol()==c && 10-P2.pieces[p].getRow()==r&&P2.pieces[p].alive){
                                        lock = 1;
                                        switch(P2.pieces[p].getPieceType()){
                                            case Rat:
                                                System.out.print("\033[34;4m*鼠*\033[0m");
                                                break;
                                            case Elephant:
                                                System.out.print("\033[34;4m*象*\033[0m");
                                                break;
                                            case Cat:
                                                System.out.print("\033[34;4m*猫*\033[0m");
                                                break;
                                            case Dog:
                                                System.out.print("\033[34;4m*狗*\033[0m");
                                                break;
                                            case Lion:
                                                System.out.print("\033[34;4m*狮*\033[0m");
                                                break;
                                            case Wolf:
                                                System.out.print("\033[34;4m*狼*\033[0m");
                                                break;
                                            case Tiger:
                                                System.out.print("\033[34;4m~虎~\033[0m");
                                                break;
                                            case Leopard:
                                                System.out.print("\033[34;4m~豹~\033[0m");
                                                break;
                                        }
                                    }
                                }
                                if(lock==0) System.out.print("****");
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
        System.out.println();
        System.out.println("- - - - - - - - - - -- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
    }
    /**
     * Print the content of game rule
     */
    public void printRule(){
        ruleInMap.printRule();
    }

    /**
     * Print the quit message
     */
    public void printToQuit(){
        System.out.println("Player quited the game. Thank you for your playing.");
    }
}
