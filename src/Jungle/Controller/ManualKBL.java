package Jungle.Controller;


public class ManualKBL extends KeyboardListener{

    /**
     * This method will override the method in KeyBoardListener class,
     * and it will be modified to help check whether the user correctly
     * input “r” to return or “q” to quit the system.
     * @param sentence command to be checked
     * @return check result
     *
     */
    @Override
    public boolean check(String sentence)
    {
        return true;
    }

    /**
     * This method will be used to keep track of the logic operating flow,
     * which means the method will help to decide where it will return to
     * when the user inputs “r” command.
     * @return back status
     *
     */
    public int backTo()
    {
        return 0;
    }
}