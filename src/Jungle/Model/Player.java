package Model;

public class Player {

	private String name;
	private GroupType groupType;
	

	public Player(String name, GroupType groupType)
	{
		setName(name);
		setGroup(groupType);
	}


	//get the name of the Player
	public String getName() {
		return name;
	}




	private void setName(String name) {
		this.name = name;

	}


	//get the name of the group
	public GroupType getGroup() {
		return groupType;
	}



	private void setGroup(GroupType groupType) {
		this.groupType = groupType;
	}

	public void aminal_Piece()

	{  //Initialze the location of the pieces
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


	}

}

	
