package Jungle.Model;




public class Piece implements Comparable<Piece> {

	private int row;
	
	private int col;
	
	private PieceType type;
    
	// add an attribute
	private int rank;
	
	
	private GroupType groupType; //choose whether it is BLUE or RED

	public boolean alive;

	public boolean inDen;

	public boolean inTrap;

	public boolean inRiver;

	//Add a constructor
	public Piece(int row, int col, PieceType type, int rank, GroupType groupType){
		setRow(row);
		setCol(col);
		setRank(rank);
		setGroup(groupType);
		setPieceType(type);
		this.alive=true;

	}





	//remove argument string
	public int getRow() {
		return row;
	}






	public void setRow(int row) {
        this.row = row;
	}





	//remove argument string
	public int getCol() {
		return col;
	}






	public void setCol(int col) {
		this.col = col;
	}






	//remove argument char name
	public GroupType getGroup() {
		return groupType;
	}
    






	public void setGroup(GroupType group) {
         this.groupType=group;
	}




	// Add this method
	public void setRank(int rank){
		this.rank=rank;
		
	}


	// Add this method
	public int getRank(){

		return rank;
	}
    
	// Add this method
	public PieceType getPieceType(){

		return this.type;
	}


    // Add this method
	public void setPieceType(PieceType type){
        this.type = type;
	}

	public boolean inTrap(Board board) {
		if(board.board[row][col].getLocationType()==LocationType.TRAP){
			return true;
		}
		return false;
	}



	public boolean inRiver(Board board)
	{

		if(board.board[row][col].getLocationType()==LocationType.RIVER){
			return true;
		}

		return false;
	}



	public boolean inDen(Board board)
	{
		if(board.board[row][col].getLocationType()==LocationType.DEN){
			return true;
		}

		return false;
	}

	public void remove()
	{
		this.alive=false;
	}
	// Add a new method
	@Override
	public int compareTo(Piece piece){
		//To compare the priority of each piece
		//TODO: Please complete this compareTo function,
		// for example: A.compareTo(B) when A can eat B, return a positive value
    
    if(this.getRank()==8 &&piece.getRank()==1) {
			return -7;
		}else if(this.getRank()==1 &&piece.getRank()==8){
			return 7;
		}
		return this.getRank()-piece.getRank();
	}
	
}
