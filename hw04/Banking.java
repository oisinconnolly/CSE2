// Oisin Connolly
// Feb 13th 2015
// CSE HW04
// This program displays banking information for the users
//The user can interact with their bank account


//So Scanner can be used later
import java.util.Scanner;
import java.util.Random;

//Public class, name of file is Banking
public class Banking{
    
    //main method for every Java program
    public static void main(String[] args){
        
        //Declaring instance of Scanner object
        Scanner myScanner;
        
        //Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Declaring instance of Random object
        Random randomGenerator = new Random();
        
        //Needed Variables
        int bankBalance;
        int deposit;
        int withdrawl;
        int input;
        
        //Randomly generates bank balance between $1000 and $5000
        bankBalance=1000+(randomGenerator.nextInt(4000));
        
        System.out.print("Press 1 to view your balance. Press 2 to make a deposit. Press 3 to make a withdrawal.   ");
        input = myScanner.nextInt();
        
        switch (input) {
            case 1:
                System.out.println("Your bank balance is $"+bankBalance+".");
                break;
            case 2:
                System.out.println("Your bank balance is $"+bankBalance+".");
                System.out.print("How much do you wish to deposit?  ");
                deposit = myScanner.nextInt();
                if (deposit<=0){
                    System.out.print("You must enter a positive number to deposit.");
                    break;
                }
                bankBalance=bankBalance+deposit;
                System.out.println("Your new bank balance is $"+bankBalance+".");
                break;
            case 3:
                System.out.println("Your bank balance is $"+bankBalance+".");
                System.out.print("How much do you wish to withdraw?  ");
                withdrawl = myScanner.nextInt();
                if (withdrawl>bankBalance){
                    System.out.print("You cannot withdraw more than is in bank balance.");
                    break;
                }
                if (withdrawl<0){
                    System.out.print("You must enter a positive number to withdraw.");
                    break;
                }
                bankBalance=bankBalance-withdrawl;
                System.out.println("Your new bank balance is $"+bankBalance+".");
                break;
            default:
                System.out.println("You must enter 1,2, or 3.");
                
        }
        
        
    } //end of main method
}//end of class