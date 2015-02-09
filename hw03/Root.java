// Oisin Connolly
// Feb 8th 2015
// CSE 02 HW03
//Find the cube root of a number through guessing

import java.util.Scanner;

//Public class, name of file is Root
public class Root {
    
    //main method for every Java program
    public static void main(String[] args){
        
        //Declaring instance of Scanner object
        Scanner myScanner;
        
        //Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Prompting user for input, number to find square root of, then assigning
        System.out.print("Enter a number and I print its cube root: ");
        double x = myScanner.nextInt();
        
        //Declare new variable
        double guess =x/3;
        
        //Run through equation five times
        //Each time using last guess to improve the equation
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        
        System.out.println("The cube root is "+guess+".");
        System.out.println(guess+"*"+guess+"*"+guess+"=");
        System.out.println(guess*guess*guess);
        
    }
}
        
        