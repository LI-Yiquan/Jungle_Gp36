package Jungle.View;
public class WelcomePage implements Page{
    /** ASCII Art for MainPage */
    private String[] welcomeIcon;
    /** Start Menu */
    private String[] menu;
    /** Game rule page when user choose "1.user manual" in the menu*/
    private GameRule ruleInWelcome;


    /**
     * Set the ASCII Art for MainPage
     * @param welcomeIcon
     */
    public void setWelcomeIcon(String[] welcomeIcon) {
        
    }
    
    /**
     * Set the start menu
     * @param menu
     */
    public void setMenu(String[] menu) {
        
    }

    /**
     * Set the game rule shown for the welcome page
     */
    public void setRuleInWelcome() {
        
    }
    
    /**
     * Get the the menu of the welcome page
     * @return  the menu of the welcome page which have "1.user manual 2.start game 3.quit" three options 
     */
    public String[] getMenu() {
        return menu;
    }
   
    /**
     * Get the GameRule Page
     * @return the GameRule page for welcome page.
     */
    public GameRule getRuleInWelcome() {
        return ruleInWelcome;
    }
    
    /**
     * Get the welcomeIcon
     * @return the welcomeIcon
     */
    public String[] getWelcomeIcon() {
        return welcomeIcon;
    }

    /**
     * Print the whole welcome page
     */
    public void printWelcomePage(){

    }
    
    /**
     * Print the welcomeIcon on the welcome page
     */
    public void printIcon(){
        
    }
    
    /**
     * Print the menu on the welcome page
     */
    public void printMenu(){
        
    }
    
    /**
     * Print the content of game rule
     */
    public void printRule(){
        
    }
    
    /**
     * print the Quit message
     */
    public void printToQuit(){
      
    }

}