// Oisin Connolly
// Feb 13th 2015
// CSE HW06
// This program sums 5 intergers using a while loop

//So Scanner can be used later
import java.util.Scanner;

//Public class, name of file is GetIntegers
public class GetIntegers{
    
    //main method for every Java program
    public static void main(String[] args){
        
        //Declaring instance of Scanner object
        Scanner myScanner;
        
        //Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Neccesary integers
        int total = 0;
        int count = 0;
        int input;
        
        //Prompting user for 5 non negative integers
        System.out.println("Enter 5 non negative integers"); 
        //Will keep prompting until 5 valid inputs
        //Checks if int and non negative
        //Adds each valid input into total
        while (count<5){
            if(myScanner.hasNextInt()){
            input = (int)myScanner.nextInt();
                if(input>=0){
                    total = total + input;
                    count++;
                }
                else{
                    System.out.println("Invalid input, enter again");
                
                }
            }//End of if statement
            else{
                    System.out.println("Invalid input, enter again");
                
                }
            
        }   //End of while loop
        
        System.out.println("Sum is "+total);
        
    }  //end of main method
    
} //End of public class
        