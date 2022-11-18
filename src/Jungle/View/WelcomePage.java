package Jungle.View;
public class WelcomePage implements Page{

    public static void main(String[] args)
    {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.printWelcomePage();
    }
    /** ASCII Art for MainPage */
    private final String[] welcomeIcon ={
        "     _                   _              ____                        _ ",             
        "    | |_   _ _ ___   ___| | ___        / ___| ____ _ ______   ___  | |",
        "    | | | | |  _  \\/ _  | |/ _ \\      | |  _ / _  |  _   _  \\/ _ \\ | |",
        " _  | | | | | | | | /_| | |  __/      | |_| | /_| | | | | | |  __/ |_|", 
        "| |_| | |_| | | | |\\ _ /| |\\___|       \\____|\\__,_|_| |_| |_|\\___| (_)",
        " \\ _ / \\__ /|_| |_| __| |_|                                           ",
        "                   |____/                                             ",
    };
    /** Start Menu */
    private final String[] menu={
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
    private final GameRule ruleInWelcome = new GameRule();

    /**
     * Print the whole welcome page
     */
    public void printWelcomePage(){
        WelcomePage a=new WelcomePage();
        System.out.println("- - - - - - - - - - -- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        a.printIcon();
        System.out.println();
        System.out.println();
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
        for (String s : welcomeIcon) {
            System.out.println(s);
        }
    }
    
    /**
     * Print the menu on the welcome page
     */
    public void printMenu(){
        for (String s : menu) {
            System.out.println(s);
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
}