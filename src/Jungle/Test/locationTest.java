package Jungle.Test;

import static org.junit.jupiter.api.Assertions.*;

import Jungle.Model.*;
import org.junit.jupiter.api.Test;


public class locationTest {

    //Test for the location of the Pieces
    @Test
    void locationPieceTest()
    {
      //Test whether all the pieces is out of the bound

      //Test the elephant pieces in right situation
      //The outcome will be true if the project is follow our expectation
      //which shows that the piece is not out of bound
      Piece Elephant= new Piece(1,3, PieceType.Elephant, 8, GroupType.RED);
      assertTrue(8>Elephant.getCol());      
      assertTrue(10>Elephant.getRow());   
      assertTrue(0< Elephant.getCol());      
      assertTrue(0<Elephant.getRow()); 

      //Test the Leopard pieces in right situation
      //The outcome will be true if the project is follow our expectation
      //which shows that the piece is not out of bound
      Piece  Leopard= new Piece(9,1, PieceType.Leopard, 7, GroupType.RED);
      assertTrue(8>Leopard.getCol());      
      assertTrue(10>Leopard.getRow()); 
      assertTrue(0<Leopard.getCol());      
      assertTrue(0<Leopard.getRow());  
 
      //Test the Lion pieces in right situation
      //The outcome will be true if the project is follow our expectation
      //which shows that the piece is not out of bound
      Piece Lion= new Piece(10,10, PieceType.Lion, 6, GroupType.RED);
      assertFalse(8>Lion.getCol());      
      assertFalse(10> Lion.getRow()); 
      assertTrue(0< Lion.getCol());      
      assertTrue(0<Lion.getRow());   

      //Test the Tiger pieces in right situation
      //The outcome will be true if the project is follow our expectation
      //which shows that the piece is not out of bound
      Piece Tiger= new Piece(0,0, PieceType.Tiger, 5, GroupType.RED);
      assertTrue(8>Tiger.getCol());      
      assertTrue(10>Tiger.getRow());   
      assertFalse(0<Tiger.getCol());      
      assertFalse(0<Tiger.getRow());  

      //Test the Dog pieces in right situation
      //The outcome will be true if the project is follow our expectation
      //which shows that the piece is not out of bound
      Piece Dog= new Piece(8,2, PieceType.Dog, 3, GroupType.RED);
      assertTrue(8>Dog.getCol());
      assertTrue(10>Dog.getRow());
      assertTrue(0<Dog.getCol());
      assertTrue(0<Dog.getRow());

      //Test the Cat pieces in right situation
      //The outcome will be true if the project is follow our expectation
      //which shows that the piece is not out of bound
      Piece Cat= new Piece(1,1, PieceType.Cat, 2, GroupType.RED);
      assertTrue(8>Cat.getCol());
      assertTrue(10>Cat.getRow());
      assertTrue(0<Cat.getCol());
      assertTrue(0<Cat.getRow());

      //Test the Rat pieces in right situation
      //The outcome will be true if the project is follow our expectation
      //which shows that the piece is not out of bound
      Piece Rat= new Piece(6,5, PieceType.Rat, 1, GroupType.RED);
      assertTrue(8>Rat.getCol());      
      assertTrue(10>Rat.getRow());  
      assertTrue(0< Rat.getCol());      
      assertTrue(0< Rat.getRow());  

    }


    //Test for the location of Den
    @Test
    void locationDenTest()
    {
      //test whether the den is in the right place
      //The outcome will be equal which the location is (8,4) 0r (2,4) if the project is follow our expectation
      Location  Den1= new Location(LocationType.DEN,GroupType.RED,8,4);
      assertEquals(4, Den1.getCol());
      assertEquals(8, Den1.getRow());
      Location  Den2= new Location(LocationType.DEN,GroupType.BLUE,1,1);
      assertNotEquals(4, Den2.getCol());
      assertNotEquals(2, Den2.getRow());
    }

    //Test for the location of Trap
    @Test
    void locationTrapTest()
    {
      //Test whether all the traps is in the right position
      //The outcome will be true if the project is follow our expectation
      Location Trap1= new Location(LocationType.TRAP,GroupType.RED,1,3);
      assertEquals(1, Trap1.getRow());
      assertEquals(3, Trap1.getCol());
      
      Location Trap2= new Location(LocationType.TRAP,GroupType.RED,2,4);
      assertEquals(2, Trap2.getRow());
      assertEquals(4, Trap2.getCol());

      Location Trap3= new Location(LocationType.TRAP,GroupType.RED,2,1);
      assertNotEquals(1, Trap3.getRow());
      assertNotEquals(5, Trap3.getCol());

      Location Trap4= new Location(LocationType.TRAP,GroupType.RED,9,3);
      assertEquals(9, Trap4.getRow());
      assertEquals(3, Trap4.getCol());

      Location Trap5= new Location(LocationType.TRAP,GroupType.RED,8,4);
      assertEquals(8, Trap5.getRow());
      assertEquals(4, Trap5.getCol());

      Location Trap6= new Location(LocationType.TRAP,GroupType.RED,8,2);
      assertNotEquals(9, Trap6.getRow());
      assertNotEquals(5, Trap6.getCol());
    }

    //Test for the location of the River
    @Test
    void locaitonRiverTest()
    {
      //Test whether the river is in the right position
      //The outcome will be true if the project is follow our expectation
      Location River1= new Location(LocationType.RIVER,GroupType.RED,5,3);
      assertTrue(4 <= River1.getRow());
      assertTrue(6 >= River1.getRow());
      assertTrue(2 <= River1.getCol());
      assertTrue(3 >= River1.getCol());

      Location River2= new Location(LocationType.RIVER,GroupType.RED,1,1);
      assertFalse(4 <= River2.getRow());
      assertTrue(6 >= River2.getRow());
      assertFalse(5 <= River2.getCol());
      assertTrue(6 >= River2.getCol());

    }



}