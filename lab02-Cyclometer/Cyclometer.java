// Oisin Connolly
// Jan 30th 2015
// CSE 02
// This program uses time and number of rotations for two trips as inputs
// The distance traveled will be calculated

public class Cyclometer {
    //main method for every Java program
    public static void main(String[ ] args) {
        //Inputs
        int secsTrip1=480;   //How long was Trip 1
        int secsTrip2=3220;  //How long was Trip 2
        int countsTrip1=1561;//How many times did the wheel rotate on Trip 1
        int countsTrip2=9037;//How many times did the wheel rotate on Trip 2
        
        //Needed constants 
        double wheelDiameter=27.0, //Diameter of wheel in inches
        PI=3.14159,             // Pi
        feetPerMile=5280,   //Feet in a mile
        inchesPerFoot=12,   //Inches in a foot
        secondsPerMinute=60; //Seconds in a minute
        
        //Output variables
        double distanceTrip, distanceTrip2, totalDistance; //Will be calculated
        
        //Print out times (in minutes) and number of counts for both trips
        System.out.println("Trip 1 took " +(secsTrip1/secondsPerMinute)+
        " minutes and had " + (countsTrip1)+" counts. ");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+
        " minutes and had "+(countsTrip2)+" counts.");
        
        //Compute values for the output variavles
        distanceTrip1=(countsTrip1*wheelDiameter*PI); //Distance in inches
        distanceTrip1/=inchesPerFoot*feetPerMile;     //Distance in miles
        distanceTrip2=(countsTrip2*wheelDiameter*PI); //Distance in inches
        distanceTrip2/=inchesPerFoot*feetPerMile;     //Distance in miles
        totalDistance=distanceTrip1+distanceTrip2;    //Total distance
        
        //Print out the distance for both trips and the total
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+totalDistance+" miles.");
        
    } //end of main method
} //end of class