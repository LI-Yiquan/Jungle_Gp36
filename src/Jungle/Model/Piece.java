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
		this.row=row;
		this.col=col;
		this.rank=rank;
		this.groupType=groupType;
		this.type = type;
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

	public void remove()
	{
		this.alive=false;
	}
	// Add a new method
	@Override
	public int compareTo(Piece piece) {
		//To compare the priority of each piece
		if(this.rank==1&&this.inRiver&&!piece.inRiver) return -1;

		if(this.rank==1&&!this.inRiver&&piece.inRiver) return -1;

		if(piece.inTrap) return 1;

		if(this.getRank()==8 &&piece.getRank()==1) {
			return -7;
		}else if(this.getRank()==1 &&piece.getRank()==8){
			return 7;
		}
		if(this.getRank()>=piece.getRank()){
			return 1;
		}else{
			return -1;
		}
	}
}
