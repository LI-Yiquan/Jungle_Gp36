package Jungle.Test;

import static org.junit.jupiter.api.Assertions.*;

import Jungle.Model.*;
import org.junit.Test;

import Jungle.Controller.*;

import static org.junit.Assert.assertEquals;


import java.lang.Exception;

public class PieceTest {
     /**
     * Test the functions in Piece class.
     */

    Piece elephant1 = new Piece(7,7,PieceType.Elephant,8, GroupType.BLUE);
    Piece elephant2 = new Piece(7,6,PieceType.Elephant,8, GroupType.RED);
    Piece rat1 = new Piece(1,7,PieceType.Rat,1, GroupType.BLUE);
    Piece rat2 = new Piece(3,5,PieceType.Rat,1, GroupType.RED);
   

    // Test getRow() in Piece class. Check whther this function can return correct value of row attribute for each Piece object.
    @Test
    public void getRowTest1(){
        assertEquals(7,elephant1.getRow());
    }
    @Test
    public void getRowTest2(){
        assertEquals(1,rat1.getRow());
    }


    // Test setRow() in Piece class. Check whther this function can set value to row attribute correctly for each Piece object.
    @Test
    public void setRowTest1(){
        elephant2.setRow(2);
        assertEquals(2,elephant2.getRow());
    }
    @Test
    public void setRowTest2(){
        rat2.setRow(8);
        assertEquals(8,rat2.getRow());
    }

    // Test whether tha range of row is right. It should be in the range between 1 and 9.
    @Test
    public void rowRangeTest1(){
        assertTrue(elephant2.getRow()>=1 &&  elephant2.getCol()<=9);
        assertTrue(rat1.getRow()>=1 &&  rat1.getCol()<=9);
    }
    @Test
    public void rowRangeTest2(){
        rat1.setRow(0);
        assertFalse(rat1.getRow()>=1 && rat1.getRow()<=9);
        rat1.setRow(1);
        elephant1.setRow(10);
        assertFalse(elephant1.getRow()>=1 && elephant1.getRow()<=9);
        rat1.setRow(7);
    }
    
   
    // Test getCol() in Piece class. Check whther this function can return correct value of column attribute for each Piece object.
    @Test
    public void getColTest1(){
        assertEquals(7,elephant1.getCol());
    }
    @Test
    public void getColTest2(){
        assertEquals(5,rat2.getCol());
    }


    // Test setCol() in Piece class. Check whther this function can set value to column attribute correctly for each Piece object.
    @Test
    public void setColTest1(){
        elephant2.setCol(4);
        assertEquals(4,elephant2.getCol());
    }
    @Test
    public void setColTest2(){
        rat2.setCol(6);
        assertEquals(6,rat2.getCol());
    }

    // Test whether tha range of colomn is right. It should be in the range between 1 and 7.
    @Test
    public void colRangeTest1(){
        assertTrue(elephant1.getCol()>=1 &&  elephant1.getCol()<=7);
        assertTrue(rat2.getCol()>=1 &&  rat2.getCol()<=7);
    }
    @Test
    public void colRangeTest2(){
        rat1.setCol(8);
        assertFalse(rat1.getCol()>=1 && rat1.getCol()<=7);
        rat1.setCol(7);
        elephant1.setCol(-1);
        assertFalse(elephant1.getCol()>=1 &&  elephant1.getCol()<=7);
        elephant1.setCol(7);
    }

    
    // Test whether the range of group attribute is correct. It should be either "BLUE" oe "RED".
    @Test 
    public void grouprangeTest1(){
       assertTrue(elephant1.getGroup()==GroupType.BLUE ||elephant1.getGroup()== GroupType.RED);
       assertTrue(rat2.getGroup()== GroupType.BLUE||rat2.getGroup()== GroupType.RED);  
    }
    @Test
    public void grouprangeTest2(){
        assertNotSame(elephant1.getGroup(), GroupType.RED);
        assertNotSame(rat2.getGroup(), GroupType.BLUE);
     }

   
    // Test getName() in Piece class. Check whther this function can return correct value of name attribute for each Piece object.
    @Test
    public void getPieceTypeTest1(){
        assertEquals(PieceType.Elephant,elephant1.getPieceType());
    }
    @Test
    public void getPieceTypeTest2(){
        assertEquals(PieceType.Rat,rat2.getPieceType());
    }

   // Test getRank() in Piece class. Check whther this function can return correct value of rank attribute for each Piece object.
   @Test
   public void getRankTest1(){
       assertEquals(8,elephant1.getRank());
   }
   @Test
   public void getRankTest2(){
       assertEquals(1,rat2.getRank());
   }

   // Test whether tha range of rank is right. It should be in the range between 1 and 8.
   @Test
   public void rankRangeTest1(){
       assertTrue(elephant1.getRank()>=1 &&  elephant1.getRank()<=8);
       assertTrue(rat1.getRank()>=1 &&  rat1.getRank()<=8);
   }
   @Test
   public void rankRangeTest2(){
       rat1.setRank(0);
       assertFalse(rat1.getRank()>=1 && rat1.getRank()<=8);
       rat1.setRank(1);
       elephant1.setRank(9);
       assertFalse(elephant1.getRank()>=1 && elephant1.getRank()<=8);
       elephant1.setRank(8);
   }

    /**
     * Test the function of eating out of order in the trap 
     * we let the tiger and the cat in the same trap and check the outcome of the project
     * The outcome will be "Have no permission to eat the animal in trap!" if the project works well
     */
    @Test
    public void PieceTest_inTrap()
    {
        Player P1 = new Player("Alice", GroupType.RED);
        Player P2 = new Player("Bob",GroupType.BLUE);
        Piece Cat= new Piece(1,1, PieceType.Cat,3, GroupType.RED);
        Piece Tiger= new Piece(2,2,PieceType.Tiger, 5, GroupType.RED);
        GameKBL KBL= new GameKBL(P1, P2,null);

        try{
            //Move Tiger and cat into the same trap and check the outcome

        }
        catch (Exception e){
            assertEquals("Have no permission to eat the animal in trap!", e.getMessage());
        }
     

    }

    /**
     * Test the function of eating out of order in the Den
     */
    @Test
    public void PieceTest_inDen() {
        Player P1 = new Player("Alice", GroupType.RED);
        Player P2 = new Player("Bob", GroupType.BLUE);
        Piece Cat = new Piece(1, 1, PieceType.Cat, 3, GroupType.RED);
        Piece Tiger = new Piece(2, 2, PieceType.Tiger, 5, GroupType.RED);
        GameKBL KBL = new GameKBL(P1,P2, null);

        try {


        } catch (Exception e) {
            assertEquals("Have no permission to eat the animal in trap!", e.getMessage());
        }
    }


    /**
     * Test the function of InRiver
     * Test whether the animal is in the river and whether it can live in the river
     */
    @Test
    public void PieceTest_inRiver() {
        Player P1 = new Player("Alice", GroupType.RED);
        Player P2 = new Player("Bob", GroupType.BLUE);
        Location RiverLocation = new Location(LocationType.RIVER, GroupType.RED, 4, 2);
        Piece Rat = new Piece(3, 2, PieceType.Rat, 0, GroupType.RED);
        Piece Elephant = new Piece(4, 1, PieceType.Elephant, 7, GroupType.BLUE);
        GameKBL KBL = new GameKBL(P1, P2,null);
        Piece Wolf = new Piece(4, 2, PieceType.Wolf, 3, GroupType.RED);

        try {
            //Test the location of River
            assertSame(RiverLocation.getLocationType(), LocationType.RIVER);
            assertNotSame(RiverLocation.getLocationType(), LocationType.TRAP);

        } catch (Exception e) {
            assertEquals("The animal is not in River/cannot Have no permission to eat the animal in River!", e.getMessage());
        }
    }
    
    @Test
    public void PieceTest_Compare()
    {
        Piece Rat = new Piece(3, 2, PieceType.Rat, 1, GroupType.RED);
        Piece Wolf = new Piece(4, 2, PieceType.Wolf, 3, GroupType.BLUE);
        Piece Elephant = new Piece(7, 2, PieceType.Wolf, 8, GroupType.RED);
        assertTrue(Elephant.compareTo(Wolf)>0);
        assertTrue(Elephant.compareTo(Rat)<=0);
    }


}