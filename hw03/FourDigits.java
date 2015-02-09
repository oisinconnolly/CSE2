// Oisin Connolly
// Feb 8th 2015
// CSE 02 HW03
// This program gives the four digits to the right of a decimal
//User inputs a double

import java.util.Scanner;

//Public class, name of file is FourDigits
public class FourDigits {
    
    //main method for every Java program
    public static void main(String[] args){
        
        //Declaring instance of Scanner object
        Scanner myScanner;
        
        //Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Prompt user for a double
        System.out.print("Enter a double and I print the four digits to the right of the decimal point-");
        double originalNumber = myScanner.nextDouble();
        
        //Store the numbers to left of decimal in user input as leftNumbers
        int leftNumbers = (int)originalNumber;
        
        //Multiply user input by 10000
        //Four digits are now brought to left of decimal
        double origTimes10000=originalNumber*10000;
        
        //Cut off anything still to the right of decimal by making interger called fourDigits
        int fourDigits=(int)origTimes10000;
        
        //Remove anything that would have originally been to the left of decimal 
        //Multiply leftNumbers by 10000 then subtract that from fourDigits
        fourDigits=fourDigits-(10000*leftNumbers);
        
        //Create four variables to store each digit seperately
        int one, two, three, four;
        
        //Isolate digits by dividing out early digits
        one=fourDigits/1000;
        two=(fourDigits-(one*1000))/100;
        three=(fourDigits-((one*1000)+(two*100)))/10;
        //Using the remainder function for fourth digit
        four=fourDigits%10;
        
        //Print out output
        System.out.println("The four digits are "+one+two+three+four);
        
    }
}