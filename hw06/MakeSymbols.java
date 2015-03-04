// Oisin Connolly
// Feb 13th 2015
// CSE HW06
// This prints out a number of * or & depending on if input is even or odd

//So Scanner and random can be used later
import java.util.Random;

//Public class, name of file is MakeSymbols
public class MakeSymbols{
    
    //main method for every Java program
    public static void main(String[] args){
        
        //Declaring instance of Random object
        Random randomGenerator = new Random();
        
        int randomNumber;
        int count;
        
        randomNumber=randomGenerator.nextInt(100);
        
        System.out.println("Random number generated:"+randomNumber); 
        
        count=randomNumber;
        
        while(count>0){
           if(randomNumber%2==0){
              System.out.print("*"); 
           }
           else{
               System.out.print("&");
           }
           count--;
        }
    
       
        
    }  //end of main method
    
} //End of public class