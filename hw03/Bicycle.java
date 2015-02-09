// Oisin Connolly
// Feb 8th 2015
// CSE 02 HW03
// This program prompts user for time and number of rotations
// The distance traveled and speed are calculated and displayed

import java.util.Scanner;

//Public class, name of file is Bicycle
public class Bicycle {
    
    //main method for every Java program
    public static void main(String[] args){
        
        //Declaring instance of Scanner object
        Scanner myScanner;
        
        //Scanner constructor
        myScanner = new Scanner( System.in );
        
        //Inputs
        //Prompting user for input, number of seconds, then assigning
        System.out.print("Enter the number of seconds: ");
        int timeSeconds = myScanner.nextInt();
        
        //Prompting user for input, number of counts, then assigning
        System.out.print("Enter the number of counts: ");
        int nCounts = myScanner.nextInt();
        
        //Needed constants 
        double wheelDiameter=27.0, //Diameter of wheel in inches
        PI=3.14159,             // Pi
        feetPerMile=5280,   //Feet in a mile
        inchesPerFoot=12,   //Inches in a foot
        secondsPerMinute=60, //Seconds in a minute
        minutesPerHour=60; //Minutes in an hour
        
        //Output variables
        double distanceTrip,speedMPH,timeMinutes; //Will be calculated
        
        //Compute values for the output variavles
        distanceTrip=(nCounts*wheelDiameter*PI); //Distance in inches
        distanceTrip/=inchesPerFoot*feetPerMile;     //Distance in miles
        timeMinutes=timeSeconds/secondsPerMinute;
        speedMPH=distanceTrip/((timeSeconds/secondsPerMinute)/minutesPerHour);
        
        
        //Print out times (in minutes) and distance in miles
        System.out.println("The distance was " + distanceTrip +
        " miles and took " + (timeMinutes) + " minutes.");
        //Print out speed
        System.out.println("The average mph was "+speedMPH+".");
        
    } //end of main method
} //end of class