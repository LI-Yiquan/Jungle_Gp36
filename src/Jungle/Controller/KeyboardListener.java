package Jungle.Controller;

import java.util.Scanner;

abstract public class KeyboardListener {

    /**
     * When “read” function is called, it will read the next
     * line in the console. This function will also be inherited
     * by ManualKBL and GameKBL.
     *
     */
    public void read()
    {
    }

    /**
     * check whether the format of user input is valid or invalid
     * @param sentence command to be checked
     * @return check result
     *
     */
    public boolean check(String sentence)
    {
        return true;
    }
}
