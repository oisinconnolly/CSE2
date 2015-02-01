// Oisin Connolly
// Feb 1st 2015
// CSE 02 HW02
// This program calculates the cost for three items (pre and post tax)
//Calculates the total cost as well

public class Arithmetic {
    //main method for every Java program
    public static void main(String[ ] args) {
        //Inputs
        int nSocks=3,   //Number of pairs of socks
        nGlasses=6,  //Number of drinking glasses
        nEnvelopes=1;//Number of Envelopes
        double sockCosts$=2.58, //Cost per pair of socks
        glassCosts$=2.29,  //Cost per glass
        envelopeCosts$=3.25,  //Cost per envelope
        taxPercent=0.06;  //Sales tax rate
        
        
        //Output variables
        //Will be calculated
        //Total Cost pre Tax by Item
        double totalSockCost$, totalGlassCost$, totalEnvelopeCost$; 
        //Total Cost of Sales Tax by Item
        double totalSockTax$, totalGlassTax$, totalEnvelopeTax$;
        //Total cost of all items pre and post tax
        double preTaxTotalCost$, postTaxTotalCost$;
        
        //Total Cost for each item
        totalSockCost$=nSocks*sockCosts$;
        totalEnvelopeCost$=nEnvelopes*envelopeCosts$;
        totalGlassCost$=nGlasses*glassCosts$;
      
        //Total Tax for each item
        totalSockTax$=totalSockCost$*taxPercent;
        totalEnvelopeTax$=totalEnvelopeCost$*taxPercent;
        totalGlassTax$=totalGlassCost$*taxPercent;
        
        //Pre and post Tax Totals of all items
        preTaxTotalCost$=totalSockCost$+totalEnvelopeCost$+totalGlassCost$;
        postTaxTotalCost$=preTaxTotalCost$+totalGlassTax$+totalEnvelopeTax$+totalSockTax$;
        
        //To reduce number of decimals for tax and total
        //Done after calcualtions to eliminate rounding error
        totalSockTax$*=100;
        totalSockTax$=(int) totalSockTax$;
        totalSockTax$/=100;
        
        totalEnvelopeTax$*=100;
        totalEnvelopeTax$=(int) totalEnvelopeTax$;
        totalEnvelopeTax$/=100;
        
        totalGlassTax$*=100;
        totalGlassTax$=(int) totalGlassTax$;
        totalGlassTax$/=100;
        
        postTaxTotalCost$*=100;
        postTaxTotalCost$=(int) postTaxTotalCost$;
        postTaxTotalCost$/=100;
        
        //Print out results
        System.out.println("The total cost for the envelopes was $"+totalEnvelopeCost$+".");
        System.out.println("The total cost for the glasses was $"+totalGlassCost$+".");
        System.out.println("The total cost for the socks was $"+totalSockCost$+".");
        System.out.println("The tax for the socks was $"+totalSockTax$+".");
        System.out.println("The tax for the envelopes was $"+totalEnvelopeTax$+".");
        System.out.println("The tax for the glasses was $"+totalGlassTax$+".");
        System.out.println("The grand total for all items was $"+preTaxTotalCost$+".");
        System.out.println("After adding in tax the total was $"+postTaxTotalCost$+".");
        
    }
}