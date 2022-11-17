package Jungle.Model;
import Jungle.Model.*;

public class Player {

	private String name;
	private GroupType groupType;

	public Piece[] pieces = new Piece[8];

	public int PieceNum = 0;

	public Player(String name, GroupType groupType)
	{
		setName(name);
		setGroup(groupType);

		switch(groupType){
			case RED:
				this.initP1();
				break;
			case BLUE:
				this.initP2();
				break;
		}
		PieceNum = 8;

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

	public void initP1()
	{
		Piece elephant1 = new Piece(3,1,PieceType.Elephant,8,GroupType.RED);pieces[0]=elephant1;
		Piece lion1 = new Piece(1,7,PieceType.Lion,7,GroupType.RED);pieces[1]=lion1;
		Piece tiger1 = new Piece(1,1,PieceType.Tiger,6,GroupType.RED);pieces[2]=tiger1;
		Piece leopard1 = new Piece(3,5,PieceType.Leopard,5,GroupType.RED);pieces[3]=leopard1;
		Piece wolf1 = new Piece(3,3,PieceType.Wolf,4,GroupType.RED);pieces[4]=wolf1;
		Piece dog1 = new Piece(2,6,PieceType.Dog,3,GroupType.RED);pieces[5]=dog1;
		Piece cat1 = new Piece(2,2,PieceType.Cat,2,GroupType.RED);pieces[6]=cat1;
		Piece rat1 = new Piece(3,7,PieceType.Rat,1,GroupType.RED);pieces[7]=rat1;
	}
	public void initP2()
	{
		Piece elephant2 = new Piece(7,7,PieceType.Elephant,8,GroupType.BLUE); pieces[0]=elephant2;
		Piece lion2 = new Piece(9,1,PieceType.Lion,7,GroupType.BLUE);pieces[1]=lion2;
		Piece tiger2 = new Piece(9,7,PieceType.Tiger,6,GroupType.BLUE);pieces[2]=tiger2;
		Piece leopard2 = new Piece(7,3,PieceType.Leopard,5,GroupType.BLUE);pieces[3]=leopard2;
		Piece wolf2 = new Piece(7,5,PieceType.Wolf,4,GroupType.BLUE);pieces[4]=wolf2;
		Piece dog2 = new Piece(8,2,PieceType.Dog,3,GroupType.BLUE);pieces[5]=dog2;
		Piece cat2 = new Piece(8,6,PieceType.Cat,2,GroupType.BLUE);pieces[6]=cat2;
		Piece rat2 = new Piece(7,1,PieceType.Rat,1,GroupType.BLUE);pieces[7]=rat2;
	}


}
