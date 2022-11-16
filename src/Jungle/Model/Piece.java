package Model;




public class Piece   {

	private int row;
	
	private int col;
	
	private PieceType type;
    
	// add an attribute
	private int rank;
	
	
	private GroupType groupType; //choose whether it is BLUE or RED

	//Add a constructor
	public Piece(int row, int col, PieceType type, int rank, GroupType groupType){
		setRow(row);
		setCol(col);
		setRank(rank);
		setGroup(groupType);
		setPieceType(type);

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
	public int getRank()
	{

		if(this.type.toString().equals("Elephant"))
		{
			rank=8;
			return rank;
		}
		if(this.type.toString().equals("Lion"))
		{
			rank=7;
			return rank;
		}

		if(this.type.toString().equals("Tiger"))
		{
			rank=6;
			return rank;
		}
		if(this.type.toString().equals("Leopard"))
		{
			rank=5;
			return rank;
		}
		if(this.type.toString().equals("Wolf"))
		{
			rank=4;
			return rank;
		}
		if(this.type.toString().equals("Dog"))
		{
			rank=3;
			return rank;
		}
		if(this.type.toString().equals("Cat"))
		{
			rank=2;
			return rank;
		}
		if (this.type.toString().equals("Rat"))
		{
			rank=1;
		}
		else
		{
			rank=0;
		}
		return rank;


	}

	public void setRank(int rank)
	{
        this.rank = rank;
	}
    
	// Add this method
	public PieceType getPieceType()
	{
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
    
	// Add a new method
	public int compareTo(Piece piece,Board board){
		//To compare the priority of each piece

		if(piece.inRiver(board) || this.inRiver(board)|| this.inDen(board) || piece.inDen(board)){
			return 0;
		}

		if(this.inTrap(board)){
			return -1;
		}

		if(piece.inTrap(board)){
			return 1;
		}


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
