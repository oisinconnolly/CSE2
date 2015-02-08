// Oisin Connolly
// Feb 1st 2015
// CSE 02 LAB03
// This program calculates the cost for Big Macs
//The number, cost, and tax rate are all user inputs


//So Scanner can be used later
import java.util.Scanner;

//Public class, name of file is BigMac
public class BigMac{
    
    //main method for every Java program
    public static void main(String[] args){
        
        //Declaring instance of Scanner object
        Scanner myScanner;
        
        //Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Prompting user for input, number of Big Macs, then assigning
        System.out.print("Enter the number of Big Macs (an integer >0): ");
        int nBigMacs = myScanner.nextInt();
        
         //Prompting user for input, cost of Big Macs, then assigning
        System.out.print("Enter the cost per BigMac as " +
        " a double (in the form xx.xx) : ");
        double bigMac$ = myScanner.nextDouble();
        
        //Prompting user for input, tax rate, then assigning
        System.out.print("Enter the percent tax as a whole number (xx) : ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100; //Changes proportion to percent
        
        double cost$;
        int dollars, //whole dollar cost 
        dimes, pennies; //storing digits to the right of the decimal
        
        //Calculate total cost
        cost$ = bigMac$*nBigMacs*(1+taxRate);
        
        //Get dollars, dimes, and pennies cost
        // % is used to get the remainder
        dollars = (int)cost$;
        dimes = (int)(cost$*10)%10;
        pennies = (int)(cost$*100)%10;
        
        //Print out final result
        System.out.println("The total cost of " + nBigMacs +
        " BigMacs, at $" + bigMac$ +" per BigMac, with a sales tax of " + 
        (int)(100*taxRate) + "%, is $" +dollars+"."+dimes+pennies);
        
        
        
    }  //end of main method
    
} //End of public class