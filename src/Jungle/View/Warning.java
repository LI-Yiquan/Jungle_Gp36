package Jungle.View;
import java.util.HashMap;

public class Warning {
    /** Store all the type of warnings */
    private HashMap<Integer,String> warnMessage = new HashMap<Integer,String>();
    
  
    /**
     * Print the specific type warning
     * @param type
     */
    public void printWarnMessage(int type){

    }
    
    /**
     * Print all the warnings
     */
    public void printAllWarnMessage( ){

    }
    
    /**
     * Remove one type warning
     * @param type
     */
    public void removeWarnMessage(int type){
        warnMessage.remove(type);
    }
    
    /**
     * Add a new type warning
     * @param type
     * @param message
     */
    public void addWarnMessage(int type, String message){

    }

}
