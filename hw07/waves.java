// Oisin Connolly
// Mar 16th 2015
// CSE HW07
// This program outputs a pattern of numbers
//Size of output based on input between 1-30 inclusive

//So Scanner can be used later
import java.util.Scanner;

//Public class, name of file is waves
public class waves{
    
    //main method for every Java program
    public static void main(String[] args){
        
        //Declaring instance of Scanner object
        Scanner myScanner;
        
        //Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Neccesary inputs
        int input, count, decrease, nOnLine;
        String oneLine;
        
        
        //Prompting user for input
        System.out.println("Enter a number between 1 and 30: "); 
        input = myScanner.nextInt();
        
         System.out.println("FOR LOOP: ");
        
        for(count=1;count<=input;count++){
            oneLine =" ";
            if(count%2==1){
                for(decrease=count;decrease>0;decrease--){
                    oneLine =" ";
                for(nOnLine=decrease;nOnLine>0;nOnLine--){
                    
                oneLine = oneLine + count;
                   
                }
                System.out.println(oneLine); 
                
                }
                }   
            else{
               for(nOnLine=0;nOnLine<count;nOnLine++) {
                
                oneLine = oneLine + count;
                System.out.println(oneLine);   
                }

            }
            
        }
        
      
        
       
        
        
        
        
        

        
    }  //end of main method
    
} //End of public class
        