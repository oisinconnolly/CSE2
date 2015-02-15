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
        int nPeople = myScanner.nextInt();