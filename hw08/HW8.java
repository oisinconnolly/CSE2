//So Scanner can be used later
import java.util.Scanner;

//Public class, name of file is HW8
public class HW8{

public static void main(String[] args) {
        
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
        }
        
        public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
        }
        
        
        public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
        }
        
        
         public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
        }
    
        public static String getInput(Scanner scan, String keystroke) {
                keystroke = scan.next();
                if (!keystroke.equals("C") && !keystroke.equals("c")){
                        System.out.println("Exited game");
                        System.exit(1);
                }
                return keystroke;
        }
        
        public static String getInput(Scanner scan, String keystroke, int example) {
                keystroke = scan.next();
                if (keystroke.equals("A") || keystroke.equals("a")){
                        int hitRandom = (int) (Math.random()*2);
                        if (hitRandom == 0){
                                System.out.println("Gosh! How could you miss?!");
                                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                                getInput(scan,keystroke,example);
                        } 
                        else {
                                System.out.println("Critical Hit!");
                                example--;
                                if (example==0){
                                        return keystroke;
                                } 
                                
                                else {
                                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                                        getInput(scan,keystroke,example);
                                }
                        }
                        return keystroke;
                }
                
                if (keystroke.equals("E") || keystroke.equals("e")){
                        int escapeRandom = (int) (Math.random()*11);
                        if (escapeRandom ==10){
                                System.out.println("You have succesfully ESCAPED!");
                                return keystroke;
                        } 
                        
                        else {
                                System.out.println("You failed to escape!");
                                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                                getInput(scan,keystroke,example);
                        }
                        return keystroke;
                } 
                
                else {
                        System.out.println("You were executed by the Giant! GAME OVER!");
                        System.exit(1);
                        return keystroke;
                }
        }
        
        public static String getInput(Scanner scan) {
                int boxChoice = scan.nextInt();
                String reward = "";
                 switch (boxChoice) {
                        case 1: 
                                System.out.println("Small Prize");
                                break;
                        case 2:
                                System.out.println("Medium Fries");
                                break;
                        case 3:
                                System.out.println("Large Pies");
                                break;
                        default:
                               System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                }
                return reward;
       }
        
        

    
   
    
}
