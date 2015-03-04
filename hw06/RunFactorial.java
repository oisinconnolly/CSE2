// Oisin Connolly
// Feb 13th 2015
// CSE HW06
// This program finds the factorial of any int between 9 and 16

//So Scanner can be used later
import java.util.Scanner;

//Public class, name of file is RunFactorial
public class RunFactorial{
    
    //main method for every Java program
    public static void main(String[] args){
        
        //Declaring instance of Scanner object
        Scanner myScanner;
        
        //Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Neccesary integers
        int original,factorial;
        int total=1;
        
        //Prompting user for integer between 9 and 16
        System.out.println("Please enter an integer that is between 9 and 16:"); 
        
        original = myScanner.nextInt();
        factorial = original;
        
        while(factorial>0){
           total=total*factorial;
           factorial--;
        }
        
        System.out.println(original+"!= "+total);
    
       
        
    }  //end of main method
    
} //End of public class