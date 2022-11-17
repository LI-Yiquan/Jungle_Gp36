package Jungle.View;
import java.util.HashMap;

public class Warning {
    /** Store all the type of warnings */
    private HashMap<Integer,String> warnMessage = new HashMap<Integer,String>();
    
    public Warning(){
        warnMessage.put(1,"Invaild move ! This piece can only move one square (except jump) horizontally or vertically.");
        warnMessage.put(2,"Invaild move ! This piece can not move to its own den.");
        warnMessage.put(3,"Invaild move ! This piece can not go onto a water square.");
        warnMessage.put(4,"Invaild move ! This piece can not jump over a river by moving horizontally or vertically.");
        warnMessage.put(5,"Invaild move ! This piece can not jump over the river when there is a rat (whether friendly or enemy) on any of the intervening water squares.");
        warnMessage.put(6,"Invaild move ! The rat in the water can not capture the rat or elephant on the land.");
        warnMessage.put(7,"Invaild move ! The rat on the land can not capture the rat in the water.");
        warnMessage.put(8,"Invaild move ! The elephant can not capture the rat.");
        warnMessage.put(9,"Invaild move ! The piece can not capture the piece which has higher rank (except elephant and rat).");
        
    }
    /**
     * Print the specific type warning
     * @param type
     */
    public void printWarnMessage(int type){
       String warning=warnMessage.get(type);
       System.out.println(warning);
    }
    
    /**
     * Print all the warnings
     */
    public void printAllWarnMessage( ){
        for (Integer i : warnMessage.keySet()) {
            System.out.println("key: " + i + " value: " + warnMessage.get(i));
        }
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
        this.warnMessage.put(type, message);
    }

}
