// Oisin Connolly
// Feb 13th 2015
// CSE HW04
// This program has user pick a number and then guesses that number through
// a series of questions that help it deduce the number


//So Scanner can be used later
import java.util.Scanner;

//Public class, name of file is WhichNumber
public class WhichNumber{
    
    //main method for every Java program
    public static void main(String[] args){
        
        //Declaring instance of Scanner object
        Scanner myScanner;
        
        //Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Declare neccesary variable
        String y,Y,N,n;
        y="y";
        Y="Y";
        N="N";
        n="n";
        
        //First question
        System.out.println("Think of a number 1 to 10 inclusive.");
        System.out.println("Answer needs to be y,Y,n, or N.");
        System.out.print("Is the number even? ");
        
        String answer = myScanner.next();
        if(answer.equals(y)||answer.equals(Y)){
        System.out.print("Is it divisible by 3? ");
        answer = myScanner.next();
            if(answer.equals(y)||answer.equals(Y)){ 
            System.out.print("Is your number 6? ");
            answer = myScanner.next();
                if(answer.equals(y)||answer.equals(Y)){
                System.out.print("Yay!");
                }
                else if(answer.equals(n)||answer.equals(N)){
                System.out.print("That is not consistent");    
                }
                else{
                System.out.print("Sorry, that is not a valid input.");
                }
            }
            else if(answer.equals(n)||answer.equals(N)){
            System.out.print("Is it divisible by 4? ");
            answer = myScanner.next();
                if(answer.equals(y)||answer.equals(Y)){ 
                System.out.print("Is your number divided by 4 greater than 1?");
                answer = myScanner.next();
                    if(answer.equals(y)||answer.equals(Y)){ 
                    System.out.print("Is your number 8? ");
                    answer = myScanner.next();
                        if(answer.equals(y)||answer.equals(Y)){
                        System.out.print("Yay!");
                        }
                        else if(answer.equals(n)||answer.equals(N)){
                        System.out.print("That is not consistent");    
                        }
                        else{
                        System.out.print("Sorry, that is not a valid input.");
                        }
                    }
                    else if(answer.equals(n)||answer.equals(N)){ 
                    System.out.print("Is your number 4? ");
                    answer = myScanner.next();
                        if(answer.equals(y)||answer.equals(Y)){
                        System.out.print("Yay!");
                        }
                        else if(answer.equals(n)||answer.equals(N)){
                        System.out.print("That is not consistent");    
                        }
                        else{
                        System.out.print("Sorry, that is not a valid input.");
                        }
                    }
                    else{
                    System.out.print("Sorry, that is not a valid input.");
                    }
                    
                }
            }    
            else if(answer.equals(n)||answer.equals(N)){
            System.out.print("Is it divisible by 5?");
            answer = myScanner.next();
                if(answer.equals(y)||answer.equals(Y)){ 
                System.out.print("Is your number 10? ");
                answer = myScanner.next();
                    if(answer.equals(y)||answer.equals(Y)){
                    System.out.print("Yay!");
                    }
                    else if(answer.equals(n)||answer.equals(N)){
                    System.out.print("That is not consistent");    
                    }
                    else{
                    System.out.print("Sorry, that is not a valid input.");
                    }
                }
                else if(answer.equals(n)||answer.equals(N)){ 
                System.out.print("Is your number 2? ");
                answer = myScanner.next();
                    if(answer.equals(y)||answer.equals(Y)){
                    System.out.print("Yay!");
                    }
                    else if(answer.equals(n)||answer.equals(N)){
                    System.out.print("That is not consistent");    
                    }
                    else{
                    System.out.print("Sorry, that is not a valid input.");
                    }
                }
                else{
                System.out.print("Sorry, that is not a valid input.");
                }
            }
            else{
            System.out.print("Sorry, that is not a valid input.");
            }
        }    
        else if(answer.equals(n)||answer.equals(N)){
        System.out.print("Is it divisible by 3? ");
        answer = myScanner.next();
            if(answer.equals(y)||answer.equals(Y)){
            System.out.print("When divided by 3 is the result greater than 1?");
            answer = myScanner.next();    
                if(answer.equals(y)||answer.equals(Y)){ 
                System.out.print("Is your number 9? ");
                    if(answer.equals(y)||answer.equals(Y)){
                    System.out.print("Yay!");
                    }
                    else if(answer.equals(n)||answer.equals(N)){
                    System.out.print("That is not consistent");    
                    }
                    else{
                    System.out.print("Sorry, that is not a valid input.");
                    }
                }
                else if(answer.equals(n)||answer.equals(N)){
                System.out.print("Is your number 3?");
                answer = myScanner.next();
                    if(answer.equals(y)||answer.equals(Y)){
                    System.out.print("Yay!");
                    }
                    else if(answer.equals(n)||answer.equals(N)){
                    System.out.print("That is not consistent");    
                    }
                    else{
                    System.out.print("Sorry, that is not a valid input.");
                    }
                }
                else{
                System.out.print("Sorry, that is not a valid input.");
                }
              
            }
            else if(answer.equals(n)||answer.equals(N)){
            System.out.print("Is it greater than 6? ");
            answer = myScanner.next();
                if(answer.equals(y)||answer.equals(Y)){ 
                System.out.print("Is your number 7? ");
                    if(answer.equals(y)||answer.equals(Y)){
                    System.out.print("Yay!");
                    }
                    else if(answer.equals(n)||answer.equals(N)){
                    System.out.print("That is not consistent");    
                    }
                    else{
                    System.out.print("Sorry, that is not a valid input.");
                    }
                }
                else if(answer.equals(n)||answer.equals(N)){
                System.out.print("Is it less than 3?");
                answer = myScanner.next();
                    if(answer.equals(y)||answer.equals(Y)){ 
                    System.out.print("Is your number 1? ");
                        if(answer.equals(y)||answer.equals(Y)){
                        System.out.print("Yay!");
                        }
                        else if(answer.equals(n)||answer.equals(N)){
                        System.out.print("That is not consistent");    
                        }
                        else{
                        System.out.print("Sorry, that is not a valid input.");
                        }
                    }
                    else if(answer.equals(n)||answer.equals(N)){
                    System.out.print("Is your number 5? ");
                        if(answer.equals(y)||answer.equals(Y)){
                        System.out.print("Yay!");
                        }
                        else if(answer.equals(n)||answer.equals(N)){
                        System.out.print("That is not consistent");    
                        }
                        else{
                        System.out.print("Sorry, that is not a valid input.");
                        }
                    }
                    else{
                    System.out.print("Sorry, that is not a valid input.");
                    }
                }
                else{
                System.out.print("Sorry, that is not a valid input.");
                }
            }
            else{
            System.out.print("Sorry, that is not a valid input.");
            }
        }
        else{
        System.out.print("Sorry, that is not a valid input.");
        }
       
       
       
       
        
    } //end of main method
}//end of class
