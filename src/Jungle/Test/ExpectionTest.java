package Jungle.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import Jungle.Model.WrongCheck;

public class ExpectionTest {
    

    @Test
    //Test whether the function WrongPieceLocation() can throw and print the corresponding exception correctly.
    public void WrongPieceLocationTest() {
        WrongCheck e=new WrongCheck();
        Exception exception = assertThrows(Exception.class, () -> {
              e.WrongPieceLocation();
        });
    
        String expectedMessage = "Wrong Piece Location";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    //Test whether the function WrongOrder_of_eating() can throw and print the corresponding exception correctly.
    public void WrongOrder_of_eatingTest() {
        WrongCheck e=new WrongCheck();
        Exception exception = assertThrows(Exception.class, () -> {
              e.WrongOrder_of_eating();
        });
    
        String expectedMessage = "Wrong order of eating";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    //Test whether the function WrongEating_Intra() can throw and print the corresponding exception correctly.
    public void WrongEating_IntraTest() {
        WrongCheck e=new WrongCheck();
        Exception exception = assertThrows(Exception.class, () -> {
              e.WrongEating_Intrap();
        });
    
        String expectedMessage = "Wrong eating in Trap.";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    //Test whether the function WrongMoving_InDen() can throw and print the corresponding exception correctly.
    public void WrongMoving_InDenTest() {
        WrongCheck e=new WrongCheck();
        Exception exception = assertThrows(Exception.class, () -> {
              e.WrongMoving_InDen();
        });
    
        String expectedMessage = "Something wrong in Den.";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    //Test whether the function WrongJump_AcrossRiver() can throw and print the corresponding exception correctly.
    public void WrongJump_AcrossRiverTest() {
        WrongCheck e=new WrongCheck();
        Exception exception = assertThrows(Exception.class, () -> {
              e.WrongJump_AcrossRiver();
        });
    
        String expectedMessage = "Wrong go across the river.";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    //Test whether the function Wrong_InRiver() can throw and print the corresponding exception correctly.
    public void Wrong_InRiverTest() {
        WrongCheck e=new WrongCheck();
        Exception exception = assertThrows(Exception.class, () -> {
              e.Wrong_InRiver();
        });
    
        String expectedMessage = "Wrong staying in the river.";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    //Test whether the function Wrong_Winner() can throw and print the corresponding exception correctly.
    public void Wrong_Winner() {
        WrongCheck e=new WrongCheck();
        Exception exception = assertThrows(Exception.class, () -> {
              e.Wrong_Winner();
        });
    
        String expectedMessage = "Wrong winner.";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
