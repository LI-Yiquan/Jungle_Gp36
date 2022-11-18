package Jungle.Model;

/*
In this model part, some components which are significant are listed as follows,
like the class of Piece(animals),the class of location, 
the class of priority, the class of is_River, 
the class of in_Trap, the class of in_Den, 
the class of name, the class of player, and the class of board.
*/
public class WrongCheck {

	public void WrongPieceLocation() throws Exception {
		//This is to check whether the piece is out of bound
		//If out of bound, throw new ArithmeticException
		throw new Exception("Wrong Piece Location");
	}
	public void WrongOrder_of_eating() throws Exception {
		//This is to check whether the piece is in the wrong order of eating 
		//If this happens, throw new ArithmeticException
		throw new Exception("Wrong order of eating");
	}

	public void WrongEating_Intrap() throws Exception {
		//This is to check whether the piece has the permission to eat in trap
		//If mis-eaten in trap, throw new ArithmeticException
		throw new Exception("Wrong eating in Trap.");
	}
	public void WrongMoving_InDen() throws Exception {
		//This is to check whether the piece has something wrong when stay in den
		throw new Exception("Something wrong in Den.");
	}

	public void WrongJump_AcrossRiver() throws Exception {
		//This is to check whether the piece has the right permiaasion to jump across the river
		//If has mistake, throw new ArithmeticException
		throw new Exception("Wrong go across the river.");
	}
	public void Wrong_InRiver() throws Exception {
		//This is to check whether the piece has the ability to stay in the river
		//If has no ability to stay in river,throw new ArithmeticException
		throw new Exception("Wrong staying in the river.");
	}

	public void Wrong_Winner() throws Exception {
		//This is to check whether the project output the right winner
		//If print out the wrong winner,throw new ArithmeticException
		throw new Exception("Wrong winner.");
	}


		
}




	
