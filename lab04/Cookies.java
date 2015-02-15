// Oisin Connolly
// Feb 13th 2015
// CSE 02 LAB04
// This program calculates whether there are enough cookies &
//Whether the cookies divide evenly, given input of number of people and cookies


//So Scanner can be used later
import java.util.Scanner;

//Public class, name of file is Cookies
public class Cookies{
    
    //main method for every Java program
    public static void main(String[] args){
        
        //Declaring instance of Scanner object
        Scanner myScanner;
        
        //Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Prompting user for input, number of people
        System.out.print("Enter the number of people: ");
       
       int nPeople,nCookies,nPerPerson,nNeeded;
        
        //Making sure a positive interger was used for nPeople
        if(myScanner.hasNextInt()){
            nPeople = myScanner.nextInt();
            if(nPeople > 0){
            
        }
            //Error message if input is not positive
            else{
               System.out.println("You did not enter an int > 0"); 
               return;
        }
        }
        //Error message if input is not an int
        else{
            System.out.println("You did not enter an int");
            return;
        }
        
        
        //Prompting user for input, number of cookies
        System.out.print("Enter the number of cookies you are planning to buy: ");
        
        
        //Making sure a positive interger was used for nCookies
        if(myScanner.hasNextInt()){
            nCookies = myScanner.nextInt();
            if(nCookies >= 0){
                
        }
            //Error message if input is not positive
            else{
               System.out.println("You did not enter an int > 0"); 
               return;
        }
        }
            //Error message if input is not an int
            else{
                System.out.println("You did not enter an int");
                return;
        }
        
        //Prompting user for input, how many cookies each person will get
        System.out.print("How many do you want each person to get? ");
        
        
        
        //Making sure a positive interger was used for nPerPerson
        if(myScanner.hasNextInt()){
            nPerPerson = myScanner.nextInt();
            if(nPerPerson >= 0){
                
        }
            //Error message if input is not positive
            else{
               System.out.println("You did not enter an int > 0"); 
               return;
        }
        }
            //Error message if input is not an int
            else{
                System.out.println("You did not enter an int");
                return;
        }
        
        if(nCookies >= nPerPerson*nPeople){
            if((nCookies%nPeople) == 0){
            System.out.println("You have enough cookies for each person and the amount will divide evenly.");    
            }
            else{
                System.out.println("You have enough, but they will not divide evenly.");
            
            }
        }
        else{
            nNeeded = (nPerPerson*nPeople)-nCookies;
            System.out.println("You will not have enough. You need to buy at least " + nNeeded +
            " more.");
            
        }
    }
}
        
        