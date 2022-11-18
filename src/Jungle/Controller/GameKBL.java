package Jungle.Controller;

import Jungle.Model.*;
import Jungle.View.GameRule;
import java.util.Scanner;

public class GameKBL extends KeyboardListener{

    public Player player1,player2;

    public Board gameBoard;

    public GameKBL(Player player1,Player player2, Board board)
    {
        this.player1 = player1;
        this.player2 = player2;
        this.gameBoard=board;
    }

    public void listen(Player player)
    {
        String input;
        Scanner scan = new Scanner(System.in);
        if(player.getGroup()==GroupType.RED)
            System.out.print("(\033[31;4mAlice\033[0m)"+"Game====>");
        else
            System.out.print("(\033[34;4mBob\033[0m)"+"Game====>");
        input = scan.nextLine();
        while(!check(input,player))
        {
            System.out.println("Wrong command, please try again. Input 'Manual' to check rules.");
            if(player.getGroup()==GroupType.RED)
                System.out.print("(\033[31;4mAlice\033[0m)"+"Game====>");
            else
                System.out.print("(\033[34;4mBob\033[0m)"+"Game====>");
            input = scan.nextLine();
        }
        move(input,player);
    }
    /**
     * check whether the format of user input is valid or invalid
     * @param command command to be checked
     * @param player the player taking movement
     * @return check result
     *
     */
    public boolean check(String command,Player player)
    {
        if(command.equals("Manual")||command.equals("Quit")) return true;
        String[] tmp;
        Piece piece;
        tmp = command.split(" ");
        if(tmp.length!=2) return false;
        switch (tmp[0]) {
            case "Elephant":
                if (!player.pieces[0].alive) {
                    System.out.println("Elephant is not alive.");return false;
                }
                piece = player.pieces[0];
                break;
            case "Lion":
                if (!player.pieces[1].alive){
                    System.out.println("Lion is not alive.");return false;
                }
                piece = player.pieces[1];
                break;
            case "Tiger":
                if (!player.pieces[2].alive) {
                    System.out.println("Tiger is not alive.");return false;
                }
                piece = player.pieces[2];
                break;
            case "Leopard":
                if (!player.pieces[3].alive) {
                    System.out.println("Leopard is not alive.");return false;
                }
                piece = player.pieces[3];
                break;
            case "Wolf":
                if (!player.pieces[4].alive) {
                    System.out.println("Wolf is not alive.");return false;
                }
                piece = player.pieces[4];
                break;
            case "Dog":
                if (!player.pieces[5].alive) {
                    System.out.println("Dog is not alive.");return false;
                }
                piece = player.pieces[5];
                break;
            case "Cat":
                if (!player.pieces[6].alive) {
                    System.out.println("Cat is not alive.");return false;
                }
                piece = player.pieces[6];
                break;
            case "Rat":
                if (!player.pieces[7].alive) {
                    System.out.println("Rat is not alive.");return false;
                }
                piece = player.pieces[7];
                break;
            default: return false;
        }
        int row,col;
        Piece piecek;
        switch (tmp[1]) {
            case "a":
                if((piece.getCol() - 1)<1) {
                    System.out.println("Out of bound.");return false;
                }
                if(piece.getPieceType()==PieceType.Tiger||piece.getPieceType()==PieceType.Lion) {
                    //check whether lion or tiger can move across river
                    if(piece.getRow()==4||piece.getRow()==5||piece.getRow()==6) {
                        for(int i=0;i<2;i++) {
                            if(i==0) piecek=player1.pieces[7];
                            else piecek=player2.pieces[7];
                            if(piecek.alive&&piecek.getRow()==piece.getRow()) {
                                if((piece.getCol()==4&&(piecek.getCol()==2||piecek.getCol()==3))||
                                        (piece.getCol()==7&&(piecek.getCol()==5||piecek.getCol()==6))) {
                                    System.out.println("Rat in the river, cannot jump.");return false;
                                }
                            }
                        }
                        col = piece.getCol() - 3;
                    }
                    else col = piece.getCol() - 1;
                }
                else col = piece.getCol() - 1;
                row=piece.getRow();
                if(checkConflict(row,col,player)) return false;
                if(checkRiver(row,col,piece)) {
                    System.out.println("This piece can not move across/in the river.");return false;
                }
                break;
            case "s":
                if((piece.getRow() - 1)<1) {
                    System.out.println("Out of bound.");return false;
                }
                if(piece.getPieceType()==PieceType.Tiger||piece.getPieceType()==PieceType.Lion) {
                    //check whether lion or tiger can move across river
                    if(piece.getRow()==7&&(piece.getCol()==2||piece.getCol()==3||piece.getCol()==5||
                            piece.getCol()==6)) {
                        for(int i=0;i<2;i++) {
                            if(i==0) piecek=player1.pieces[7];
                            else piecek=player2.pieces[7];
                            if(piecek.alive&&piecek.getCol()==piece.getCol()) {
                                if(piecek.getRow()==4||piecek.getRow()==5||piecek.getRow()==6) {
                                    System.out.println("Rat in the river, cannot jump.");return false;
                                }
                            }
                        }
                        row = piece.getRow() - 4;
                    }
                    else row = piece.getRow() - 1;
                }
                else row=piece.getRow() - 1;
                col=piece.getCol();
                if(checkConflict(row,col,player)) return false;
                if(checkRiver(row,col,piece)) {
                    System.out.println("This piece can not across/in the river.");return false;
                }
                break;
            case "w":
                if((piece.getRow() + 1)>9) {
                    System.out.println("Out of bound.");return false;
                }
                if(piece.getPieceType()==PieceType.Tiger||piece.getPieceType()==PieceType.Lion) {
                    //check whether lion or tiger can move across river
                    if(piece.getRow()==3&&(piece.getCol()==2||piece.getCol()==3||piece.getCol()==5||
                            piece.getCol()==6)) {
                        for(int i=0;i<2;i++) {
                            if(i==0) piecek=player1.pieces[7];
                            else piecek=player2.pieces[7];
                            if(piecek.alive&&piecek.getCol()==piece.getCol()) {
                                if(piecek.getRow()==4||piecek.getRow()==5||piecek.getRow()==6) {
                                    System.out.println("Rat in the river, cannot jump.");return false;
                                }
                            }
                        }
                        row = piece.getRow() + 4;
                    }
                    else row = piece.getRow() + 1;
                }
                else row = piece.getRow() + 1;
                col=piece.getCol();
                if(checkConflict(row,col,player)) return false;
                if(checkRiver(row,col,piece))
                {
                    System.out.println("This piece can not across/in the river.");return false;
                }
                break;
            case "d":
                if((piece.getCol() + 1)>7) {
                    System.out.println("Out of bound.");return false;
                }
                if(piece.getPieceType()==PieceType.Tiger||piece.getPieceType()==PieceType.Lion) {
                    //check whether lion or tiger can move across river
                    if(piece.getRow()==4||piece.getRow()==5||piece.getRow()==6) {
                        for(int i=0;i<2;i++) {
                            if(i==0) piecek=player1.pieces[7];
                            else piecek=player2.pieces[7];
                            if(piecek.alive&&piecek.getRow()==piece.getRow()) {
                                if((piece.getCol()==1&&(piecek.getCol()==2||piecek.getCol()==3))||
                                        (piece.getCol()==4&&(piecek.getCol()==5||piecek.getCol()==6))) {
                                    System.out.println("Rat in the river, cannot jump.");return false;
                                }
                            }
                        }
                        col = piece.getCol() + 3;
                    }
                    else col = piece.getCol() + 1;
                }
                else col = piece.getCol() + 1;
                row=piece.getRow();
                if(checkConflict(row,col,player)) return false;
                if(checkRiver(row,col,piece))
                {
                    System.out.println("This piece can not across/in the river.");return false;
                }
                break;
            default: return false;
        }

        if(player.getGroup()==GroupType.RED&&row==1&&col==4) {
            System.out.println("Can not move to your own Den.");return false;
        }
        if(player.getGroup()==GroupType.BLUE&&row==9&&col==4) {
            System.out.println("Can not move to your own Den.");return false;
        }
        //check whether the piece can eat another piece
        Player playerM;
        if(player.getGroup()==player1.getGroup()) playerM=player2;
        else playerM=player1;
        for(int i=0;i<8;i++)
        {
            if(playerM.pieces[i].alive&&
                    playerM.pieces[i].getRow()==row&&playerM.pieces[i].getCol()==col)
            {
                if(piece.compareTo(playerM.pieces[i])<0)
                {
                    System.out.println("Can not eat this piece.");return false;
                }
            }
        }
        return true;
    }

    public boolean checkConflict(int row, int col, Player player)
    {
        //check whether a piece will conflict with another piece
        for(int i=0;i<8;i++)
        {
            if(player.pieces[i].alive&&
                    row==player.pieces[i].getRow()&&col==player.pieces[i].getCol()) return true;
        }
        return false;
    }

    public boolean checkRiver(int row,int col,Piece piece)
    {
        //check whether a piece can move across/in the river
        if((4<=row&&row<=6)&&
                (col==2||col==3||col==5||col==6))
        {
            return piece.getPieceType() != PieceType.Rat && piece.getPieceType() != PieceType.Lion &&
                    piece.getPieceType() != PieceType.Tiger;
        }
        return false;
    }
    /**
     * modify the pieces information stored in Player class.
     *
     */
    public void move(String command, Player player) {
        if(command.equals("Quit"))
        {
            if(player.getGroup()==player1.getGroup()) player1.PieceNum=0;
            else player2.PieceNum=0;
            return;
        }
        if(command.equals("Manual"))
        {
            GameRule a=new GameRule();
            a.printRule();
            ManualKBL manualKBL = new ManualKBL();
            if(player.getGroup()==player1.getGroup()) manualKBL.listen(player1,player2,gameBoard,0);
            else manualKBL.listen(player1,player2,gameBoard,1);
            return;
        }
        String[] tmp;
        Piece piece;
        tmp = command.split(" ");
        switch (tmp[0]) {
            case "Elephant": piece = player.pieces[0]; break;
            case "Lion": piece = player.pieces[1]; break;
            case "Tiger": piece = player.pieces[2]; break;
            case "Leopard": piece = player.pieces[3]; break;
            case "Wolf": piece = player.pieces[4]; break;
            case "Dog": piece = player.pieces[5]; break;
            case "Cat": piece = player.pieces[6]; break;
            default: piece = player.pieces[7];
        }
        try{
        switch (tmp[1]) {
            case "a":
                if(piece.getPieceType()==PieceType.Tiger||piece.getPieceType()==PieceType.Lion)
                {
                    if(piece.getRow()==4||piece.getRow()==5||piece.getRow()==6)
                        piece.setCol(piece.getCol() - 3);

                    else piece.setCol(piece.getCol() - 1);
                }
                else piece.setCol(piece.getCol() - 1);
                break;
            case "s":
                if(piece.getPieceType()==PieceType.Tiger||piece.getPieceType()==PieceType.Lion)
                {
                    if(piece.getRow()==7&&(piece.getCol()==2||piece.getCol()==3||piece.getCol()==5||
                            piece.getCol()==6))
                        piece.setRow(piece.getRow() - 4);
                    else piece.setRow(piece.getRow() - 1);
                }
                else piece.setRow(piece.getRow() - 1);
                break;
            case "w":
                if(piece.getPieceType()==PieceType.Tiger||piece.getPieceType()==PieceType.Lion)
                {
                    if(piece.getRow()==3&&(piece.getCol()==2||piece.getCol()==3||piece.getCol()==5||
                            piece.getCol()==6))
                        piece.setRow(piece.getRow() + 4);
                    else piece.setRow(piece.getRow() + 1);
                }
                else piece.setRow(piece.getRow() + 1);
                break;
            case "d":
                if(piece.getPieceType()==PieceType.Tiger||piece.getPieceType()==PieceType.Lion)
                {
                    if(piece.getRow()==4||piece.getRow()==5||piece.getRow()==6)
                        piece.setCol(piece.getCol() + 3);
                    else piece.setCol(piece.getCol() + 1);
                }
                else piece.setCol(piece.getCol() + 1);
                break;
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of  :" + e);
        }
        Player playerM;
        GroupType GP;
        if(player.getGroup()==player1.getGroup())
        {
            playerM=player2;
            GP = GroupType.BLUE;
        }
        else
        {
            playerM=player1;
            GP = GroupType.RED;
        }
        for(int i=0;i<8;i++)
        {
            if(playerM.pieces[i].alive&&
                    playerM.pieces[i].getRow()==piece.getRow()&&playerM.pieces[i].getCol()==piece.getCol())
            {
                playerM.pieces[i].remove();
                playerM.PieceNum--;
            }
        }
        if(gameBoard.board[piece.getRow()][piece.getCol()].getLocationType()==LocationType.DEN
        &&gameBoard.board[piece.getRow()][piece.getCol()].getGroup()==GP) piece.inDen=true;
        else if(gameBoard.board[piece.getRow()][piece.getCol()].getLocationType()==LocationType.RIVER) piece.inRiver=true;
        else if(gameBoard.board[piece.getRow()][piece.getCol()].getLocationType()==LocationType.TRAP
                &&gameBoard.board[piece.getRow()][piece.getCol()].getGroup()==GP) piece.inTrap=true;
        else{
            piece.inDen=false;
            piece.inTrap=false;
            piece.inRiver=false;
        }
    }

}
