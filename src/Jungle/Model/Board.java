package Model;
/*
In this model part, some components which are significant are listed as follows,
like the class of Piece(animals),the class of location, 
the class of priority, the class of is_River, 
the class of in_Trap, the class of in_Den, 
the class of name, the class of player, and the class of board.
*/
public class Board {
	/*
	
    The class stores the basic part of the game, 
	it contains a double array which stores the information 
	of the player, the information of the pieces. 
	The board can also be saved as local files. The main board is required to attain when initialized the jungle game.
	*/

	public Location[][] board; // the elements in board can be TRAP,DEN,RIVER,LAND. LAND means this position is blank.

	public Piece[][] animals;


	public Board()
	{
		initBoard();
	}

	//initBoard helps initialize the board, by creating TRAP,RIVER,DEN and LAND
	public void initBoard()
	{
		board = new Location[10][];
		for(int i=0;i<10;i++)
		{
			board[i] = new Location[8];
		}


		animals = new Piece[10][];
		for(int i=0;i<10;i++)
		{
			animals[i] = new Piece[8];
		}


		animals[1][1] = new Piece(1,1,PieceType.Dog,3,GroupType.RED);
		animals[1][7] = new Piece(1,7,PieceType.Tiger,6,GroupType.RED);
		animals[2][2] = new Piece(2,2,PieceType.Dog,3,GroupType.RED);
		animals[2][6] = new Piece(2,6,PieceType.Cat,2,GroupType.RED);
		animals[3][1] = new Piece(3,1,PieceType.Rat,1,GroupType.RED);
		animals[3][3] = new Piece(3,3,PieceType.Leopard,5,GroupType.RED);
		animals[3][5] = new Piece(3,5,PieceType.Wolf,4,GroupType.RED);
		animals[3][7] = new Piece(3,7,PieceType.Elephant,7,GroupType.RED);


		animals[1][7] = new Piece(1,7,PieceType.Dog,3,GroupType.BLUE);
		animals[1][1] = new Piece(1,1,PieceType.Tiger,6,GroupType.BLUE);

		animals[8][6] = new Piece(8,6,PieceType.Dog,3,GroupType.BLUE);
		animals[8][2] = new Piece(8,2,PieceType.Cat,2,GroupType.BLUE);

		animals[7][7] = new Piece(7,7,PieceType.Rat,1,GroupType.BLUE);
		animals[7][5] = new Piece(7,5,PieceType.Leopard,5,GroupType.BLUE);
		animals[7][3] = new Piece(7,3,PieceType.Wolf,4,GroupType.BLUE);
		animals[7][1] = new Piece(7,1,PieceType.Elephant,7,GroupType.BLUE);

		for(int i=1;i<10;i++)
		{
			for(int j=1;j<8;j++)
			{
				if(animals[i][j]==null) animals[i][j] = new Piece(i,j,PieceType.Other,-1,GroupType.OTHER);
			}
		}



		board[1][3] = new Location(LocationType.TRAP,GroupType.RED,1,3);
		board[2][4] = new Location(LocationType.TRAP,GroupType.RED,2,4);
		board[1][5] = new Location(LocationType.TRAP,GroupType.RED,1,5);
		board[9][3] = new Location(LocationType.TRAP,GroupType.BLUE,9,3);
		board[8][4] = new Location(LocationType.TRAP,GroupType.BLUE,8,4);
		board[9][5] = new Location(LocationType.TRAP,GroupType.BLUE,9,5);

		board[1][4] = new Location(LocationType.DEN,GroupType.RED,1,4);
		board[9][4] = new Location(LocationType.DEN,GroupType.BLUE,9,4);
		for(int i=1;i<7;i++)
		{
			for(int j=2;j<4;j++)
			{
				if(board[i][j]==null)
				{
					board[i][j] = new Location(LocationType.RIVER,GroupType.OTHER,i,j);
					board[i][j+3] = new Location(LocationType.RIVER,GroupType.OTHER,i,j+3);
				}
			}
		}

		for(int i=1;i<10;i++)
		{
			for(int j=1;j<8;j++)
			{
				if(board[i][j]==null) board[i][j] = new Location(LocationType.LAND,GroupType.OTHER,i,j);
			}
		}












	}


	public void setLocation(Location location){
		board[location.getRow()][location.getCol()] = location;
	}




}

	
