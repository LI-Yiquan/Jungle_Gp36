package Jungle.View;
public class WelcomePage implements Page{

    public static void main(String[] args)
    {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.printWelcomePage();
    }
    /** ASCII Art for MainPage */
    private String[] welcomeIcon ={
        "     _                   _              ____                        _ ",             
        "    | |_   _ _ ___   ___| | ___        / ___| ____ _ ______   ___  | |",
        "    | | | | |  _  \\/ _  | |/ _ \\      | |  _ / _  |  _   _  \\/ _ \\ | |",
        " _  | | | | | | | | /_| | |  __/      | |_| | /_| | | | | | |  __/ |_|", 
        "| |_| | |_| | | | |\\ _ /| |\\___|       \\____|\\__,_|_| |_| |_|\\___| (_)",
        " \\ _ / \\__ /|_| |_| __| |_|                                           ",
        "                   |____/                                             ",
    };
    /** Start Menu */
    private String[] menu={
        "                       ╔═════════════════════╗                            ",
        "                       ║     Start Menu      ║                            ",
        "                       ╟─────┬───────────────╢                            ",
        "                       ║ NUM │    ACTION     ║                            ",
        "                       ╟─────┼───────────────╢                            ",
        "                       ║  1  │    Manual     ║                            ",
        "                       ║  2  │     Game      ║                            ",
        "                       ║  3  │     Quit      ║                            ",
        "                       ╚═════╧═══════════════╝                            "
    };
    /** Game rule page when user choose "1.user manual" in the menu*/
    private GameRule ruleInWelcome = new GameRule();


    /**
     * Set the ASCII Art for MainPage
     * @param welcomeIcon
     */
    public void setWelcomeIcon(String[] welcomeIcon) {
        this.welcomeIcon= welcomeIcon;
    } 
    
    /**
     * Set the start menu
     * @param menu
     */
    public void setMenu(String[] menu) {
        this.menu=menu;
    }

    /**
     * Set the game rule shown for the welcome page
     */
    public void setRuleInWelcome( String[] content ) {
        ruleInWelcome.setRule(content);
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
        WelcomePage a=new WelcomePage();
        System.out.println("- - - - - - - - - - -- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        a.printIcon();
        System.out.println();
        System.out.println();
        a.printMenu();
        System.out.println();
        System.out.println("- - - - - - - - - - -- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
    }

    
    /**
     * Print the welcomeIcon on the welcome page
     */
    public void printIcon(){
        for(int line=0; line <welcomeIcon.length; line++){
            System.out.println(welcomeIcon[line]);
        }
    }
    
    /**
     * Print the menu on the welcome page
     */
    public void printMenu(){
        for(int line=0; line <menu.length; line++){
            System.out.println(menu[line]);
        }
    }
    
    /**
     * Print the content of game rule
     */
    public void printRule(){
        for(int line=0; line < ruleInWelcome.getRule().length; line++){
            System.out.println(ruleInWelcome.getRule()[line]);
        }  
    }
    
    /**
     * print the Quit message
     */
    public void printToQuit(){
        System.out.println("One of the player has quited the game. Thank you for your playing.");
    }

}