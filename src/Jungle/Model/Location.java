package Jungle.Model;


import Jungle.Model.GroupType;

/*
In this model part, some components which are significant are listed as follows,
like the class of Piece(animals),the class of location, 
the class of priority, the class of is_River, 
the class of in_Trap, the class of in_Den, 
the class of name, the class of player, and the class of board.
*/
public class Location {
	/*
	This class contains some checking like whether it is alive, 
	whether it is in the right position. 
	At the same time, it also checks whether it meets the edge of the board. 
	The position is required to attain when initialized the jungle game.
	*/
	private int row;
	
	private int col;

	private GroupType g_type; //choose whether it is BLUE or RED

	public LocationType l_type;


	public Location(LocationType l_type, GroupType g_type,int row, int col)
	{
		setCol(col);
		setRow(row);
		setGroup(g_type);
		setLocationType(l_type);
	}






	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row=row;
	}






	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col=col;
	}







	public GroupType getGroup() {
		return this.g_type;
	}

	public void setGroup(GroupType groupType) {
		this.g_type = groupType;
	}



	public void setLocationType(LocationType l_type)
	{
		this.l_type = l_type;
	}
	public LocationType getLocationType()
	{
		return this.l_type;
	}


}