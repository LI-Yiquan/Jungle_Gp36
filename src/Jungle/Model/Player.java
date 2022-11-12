package Jungle.Model;

public class Player {

	private String name;
	private GroupType groupType;

	public Piece[] pieces;

	public int PieceNum = 0;

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


}

	
