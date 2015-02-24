// Oisin Connolly
// Feb 13th 2015
// CSE HW05
// This program converts three color RGB inputs into a hexadecimal String

//So Scanner can be used later
import java.util.Scanner;

//Public class, name of file is ToHex
public class ToHex{
    
    //main method for every Java program
    public static void main(String[] args){
        
        //Declaring instance of Scanner object
        Scanner myScanner;
        
        //Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Needed Variables
        int red, green, blue, placeHolder;
        String hexadecimal;
        String firstRed, secondRed, firstGreen, secondGreen, firstBlue, secondBlue;
        
        //Intializing with dummy values for now, because main one is inside if statement
        hexadecimal=firstRed=secondRed=firstGreen=secondGreen=firstBlue=secondBlue="a";
        red = green = blue = 0;
    
        //Requesting three inputs from user
        System.out.print("Please enter three numbers representing RGB values.  ");
        
        //Checking all three inputs are intergers between 0 -255
        if(myScanner.hasNextInt()){
            red = myScanner.nextInt();
            if (red<0 || red>255){
            System.out.print("Sorry, you must enter an interger between 0-255.");
            return;
        }
                
        }
        
        else{
          System.out.print("Your input must consist of intergers"); 
          return;
        }
           
        
        if(myScanner.hasNextInt()){
            green = myScanner.nextInt();
            if (green<0 || green>255){
            System.out.print("Sorry, you must enter an interger between 0-255.");
            return;
        }
                
        }
        
        else{
          System.out.print("Your input must consist of intergers"); 
          return;
        }
           
        
        if(myScanner.hasNextInt()){
            blue = myScanner.nextInt();
            if (blue<0 || blue>255){
            System.out.print("Sorry, you must enter an interger between 0-255.");
            return;
        }
                
        }
        
        else{
         System.out.print("Your input must consist of intergers"); 
         return;
        }
        
        
        //Placeholder used as a temporary variable
        //Red, blue, and green divided by 16
        //Switch statement used to assign value to first digit of each
        // two digit combination based on how times 16 divides into it
        placeHolder= red/16;
        
        switch(placeHolder){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                firstRed = ""+placeHolder;
                break;
            case 10:
                firstRed = "A";
                break;
            case 11:
                firstRed = "B";
                break;    
            case 12:
                firstRed = "C";
                break;
            case 13:
                firstRed = "D";
                break;
            case 14:
                firstRed = "E";
                break;    
            case 15:
                firstRed = "F";
                break;        
        }
        
        placeHolder= blue/16;
        
        switch(placeHolder){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                firstBlue = ""+placeHolder;
                break;
            case 10:
                firstBlue = "A";
                break;
            case 11:
                firstBlue = "B";
                break;    
            case 12:
                firstBlue = "C";
                break;
            case 13:
                firstBlue = "D";
                break;
            case 14:
                firstBlue = "E";
                break;    
            case 15:
                firstBlue = "F";
                break;        
        }
        
        placeHolder= green/16;
        
        switch(placeHolder){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                firstGreen = ""+placeHolder;
                break;
            case 10:
                firstGreen = "A";
                break;
            case 11:
                firstGreen = "B";
                break;    
            case 12:
                firstGreen = "C";
                break;
            case 13:
                firstGreen = "D";
                break;
            case 14:
                firstGreen = "E";
                break;    
            case 15:
                firstGreen = "F";
                break;        
        }
        
        //Placeholder used as a temporary variable
        //Red, blue, and green modulus by using 16
        //Switch statement used to assign value to second digit of each
        // two digit combination based on the remainder after divided by 16
        placeHolder= red%16;
        
        switch(placeHolder){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                secondRed = ""+placeHolder;
                break;
            case 10:
                secondRed = "A";
                break;
            case 11:
                secondRed = "B";
                break;    
            case 12:
                secondRed = "C";
                break;
            case 13:
                secondRed = "D";
                break;
            case 14:
                secondRed = "E";
                break;    
            case 15:
                secondRed = "F";
                break;        
        }
        
        placeHolder= blue%16;
        
        switch(placeHolder){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                secondBlue = ""+placeHolder;
                break;
            case 10:
                secondBlue = "A";
                break;
            case 11:
                secondBlue = "B";
                break;    
            case 12:
                secondBlue = "C";
                break;
            case 13:
                secondBlue = "D";
                break;
            case 14:
                secondBlue = "E";
                break;    
            case 15:
                secondBlue = "F";
                break;        
        }
        
        placeHolder= green%16;
        
        switch(placeHolder){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                secondGreen = ""+placeHolder;
                break;
            case 10:
                secondGreen = "A";
                break;
            case 11:
                secondGreen = "B";
                break;    
            case 12:
                secondGreen = "C";
                break;
            case 13:
                secondGreen = "D";
                break;
            case 14:
                secondGreen = "E";
                break;    
            case 15:
                secondGreen = "F";
                break;        
        }
       
       hexadecimal=firstRed+secondRed+firstGreen+secondGreen+firstBlue+secondBlue;
       System. out.println("The decimal number R: " + red + ", G: " + green + ", B: " + blue);
       System.out.println(" is represented in a hexadecimal as: "+ hexadecimal + ".");
            
  }  //end of main method
    
} //End of public class
        
        
       