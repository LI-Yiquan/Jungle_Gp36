package Jungle.Controller;

import Jungle.Model.*;

import java.util.Scanner;

public class GameKBL extends KeyboardListener{


    public Player player1,player2;

    public Board board;

    public GameKBL(Player player1,Player player2, Board board)
    {
        this.player1 = player1;
        this.player2 = player2;
        this.board=board;
    }

    public void listen(Player player)
    {
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Game====>");
        input = scan.nextLine();
        while(!check(input,player))
        {
            System.out.println("Wrong command, please try again.");
            System.out.print("Game====>");
            input = scan.nextLine();
        }
        move(input,player);
    }
    /**
     * check whether the format of user input is valid or invalid
     * @param command command to be checked
     * @return check result
     *
     */
    public boolean check(String command,Player player)
    {
        String[] tmp;
        Piece piece;
        tmp = command.split(" ");
        if(tmp.length!=2) return false;
        switch (tmp[0]) {
            case "Elephant":
                if (!player.pieces[0].alive) return false;
                piece = player.pieces[0];
                break;
            case "Lion":
                if (!player.pieces[1].alive) return false;
                piece = player.pieces[1];
                break;
            case "Tiger":
                if (!player.pieces[2].alive) return false;
                piece = player.pieces[2];
                break;
            case "Leopard":
                if (!player.pieces[3].alive) return false;
                piece = player.pieces[3];
                break;
            case "Wolf":
                if (!player.pieces[4].alive) return false;
                piece = player.pieces[4];
                break;
            case "Dog":
                if (!player.pieces[5].alive) return false;
                piece = player.pieces[5];
                break;
            case "Cat":
                if (!player.pieces[6].alive) return false;
                piece = player.pieces[6];
                break;
            case "Rat":
                if (!player.pieces[7].alive) return false;
                piece = player.pieces[7];
                break;
            default: return false;
        }
        int row,col;
        switch (tmp[1]) {
            case "a":
                if((piece.getCol() - 1)<1) return false;
                row=piece.getRow();
                col=piece.getCol()-1;
                if(checkConflict(row,col,player)) return false;
                if(checkRiver(row,col,piece)) return false;
                break;
            case "s":
                if((piece.getRow() - 1)<1) return false;
                row=piece.getRow()-1;
                col=piece.getCol();
                if(checkConflict(row,col,player)) return false;
                if(checkRiver(row,col,piece)) return false;
                break;
            case "w":
                if((piece.getRow() + 1)>9) return false;
                row=piece.getRow()+1;
                col=piece.getCol();
                if(checkConflict(row,col,player)) return false;
                if(checkRiver(row,col,piece)) return false;
                break;
            case "d":
                if((piece.getCol() + 1)>7) return false;
                row=piece.getRow();
                col=piece.getCol()+1;
                if(checkConflict(row,col,player)) return false;
                if(checkRiver(row,col,piece)) return false;
                break;
            default: return false;
        }

        //check whether the piece can eat another piece
        if(player.getGroup()==player1.getGroup())
        {
            for(int i=0;i<8;i++)
            {
                if(player2.pieces[i].alive&&
                        player2.pieces[i].getRow()==row&&player2.pieces[i].getCol()==col)
                {
                    if(piece.compareTo(player2.pieces[i])<0) return false;
                }
            }
        }
        else
        {
            for(int i=0;i<8;i++)
            {
                if(player1.pieces[i].alive&&
                        player1.pieces[i].getRow()==row&&player1.pieces[i].getCol()==col)
                {
                    if(piece.compareTo(player1.pieces[i])<0) return false;
                }
            }
        }
        return true;
    }

    public boolean checkConflict(int row, int col, Player player)
    {
        for(int i=0;i<8;i++)
        {
            if(player.pieces[i].alive&&
                    row==player.pieces[i].getRow()&&col==player.pieces[i].getCol()) return true;
        }
        return false;
    }

    public boolean checkRiver(int row,int col,Piece piece)
    {
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
            case "Rat": piece = player.pieces[7]; break;
            default: piece = player.pieces[0];
        }
        switch (tmp[1]) {
            case "a":
                if(piece.getPieceType()==PieceType.Tiger||piece.getPieceType()==PieceType.Lion)
                {
                    if(piece.getRow()==4||piece.getRow()==5||piece.getRow()==6)
                    {
                        piece.setCol(piece.getCol() - 3);
                    }
                    else piece.setCol(piece.getCol() - 1);
                }
                else piece.setCol(piece.getCol() - 1);
                break;
            case "s":
                if(piece.getPieceType()==PieceType.Tiger||piece.getPieceType()==PieceType.Lion)
                {
                    if(piece.getRow()==7&&(piece.getCol()==2||piece.getCol()==3||piece.getCol()==5||
                            piece.getCol()==6))
                    {
                        piece.setRow(piece.getRow() - 4);
                    }
                    else piece.setRow(piece.getRow() - 1);
                }
                else piece.setRow(piece.getRow() - 1);
                break;
            case "w":
                if(piece.getPieceType()==PieceType.Tiger||piece.getPieceType()==PieceType.Lion)
                {
                    if(piece.getRow()==3&&(piece.getCol()==2||piece.getCol()==3||piece.getCol()==5||
                            piece.getCol()==6))
                    {
                        piece.setRow(piece.getRow() + 4);
                    }
                    else piece.setRow(piece.getRow() + 1);
                }
                else piece.setRow(piece.getRow() + 1);
                break;
            case "d":
                if(piece.getPieceType()==PieceType.Tiger||piece.getPieceType()==PieceType.Lion)
                {
                    if(piece.getRow()==4||piece.getRow()==5||piece.getRow()==6)
                    {
                        piece.setCol(piece.getCol() + 3);
                    }
                    else piece.setCol(piece.getCol() + 1);
                }
                else piece.setCol(piece.getCol() + 1);
                break;
        }

        if(player.getGroup()==player1.getGroup())
        {
            for(int i=0;i<8;i++)
            {
                if(player2.pieces[i].alive&&
                        player2.pieces[i].getRow()==piece.getRow()&&player2.pieces[i].getCol()==piece.getCol())
                {
                    player2.pieces[i].remove();
                    player2.PieceNum--;
                }
            }
            if(piece.getRow()==9&&piece.getCol()==4) piece.inDen=true;
            else if((4<=piece.getRow()&&piece.getRow()<=6)&&
                    (piece.getCol()==2||piece.getCol()==3||piece.getCol()==5||piece.getCol()==6)) piece.inRiver=true;
            else if(((piece.getRow()==9)&&(piece.getCol()==3))||((piece.getRow()==9)&&(piece.getCol()==5))||
                    ((piece.getRow()==8)&&(piece.getCol()==4)))
            {
                piece.inTrap=true;
            }
            else{
                piece.inDen=false;
                piece.inTrap=false;
                piece.inRiver=false;
            }
        }
        else
        {
            for(int i=0;i<8;i++)
            {
                if(player1.pieces[i].alive&&
                        player1.pieces[i].getRow()==piece.getRow()&&player1.pieces[i].getCol()==piece.getCol())
                {
                    player1.pieces[i].remove();
                    player1.PieceNum--;
                }
            }
            if(piece.getRow()==1&&piece.getCol()==4) piece.inDen=true;
            else if((4<=piece.getRow()&&piece.getRow()<=6)&&
                    (piece.getCol()==2||piece.getCol()==3||piece.getCol()==5||piece.getCol()==6)) piece.inRiver=true;
            else if(((piece.getRow()==1)&&(piece.getCol()==3))||((piece.getRow()==1)&&(piece.getCol()==5))||
                    ((piece.getRow()==2)&&(piece.getCol()==4))) piece.inTrap=true;
            else{
                piece.inDen=false;
                piece.inTrap=false;
                piece.inRiver=false;
            }
        }
    }

}
