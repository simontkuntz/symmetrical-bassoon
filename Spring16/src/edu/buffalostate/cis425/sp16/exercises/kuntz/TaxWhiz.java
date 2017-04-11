package edu.buffalostate.cis425.sp16.exercises.kuntz;
import java.text.DecimalFormat;
public class TaxWhiz {

    private double taxRate;
    public static double purchaseTotal = 0;
    public static double taxTotal = 0;

    /**
     * TaxWhiz() constructor creates an object with
     *  a given tax rate
     * @param t -- the given tax rate
     */
    public TaxWhiz(double t)
    {
        taxRate = t;
    }

    /**
     * calcTax() returns the tax for a given purchase
     * @param purchase -- the given purchase price
     */
    public double calcTax(double purchase)
    {
    	purchaseTotal = purchaseTotal + purchase;
    	taxTotal = taxTotal + taxRate * purchase;
        return taxRate * purchase;
    }

    /**
     * changeTax() changes the current tax
     * @param t -- the change added to the current tax rate
     */
     public void changeTax(double t)
     {
    	 taxRate = taxRate + t;
     }
     
     public static void main( String args[] ){
    	 DecimalFormat myFormat = new DecimalFormat("#,###.00");

    	 TaxWhiz tax1 = new TaxWhiz(.0875);
    	 TaxWhiz tax2 = new TaxWhiz(.0475);
    	 tax1.calcTax(20); 
    	 tax2.calcTax(100); 
    	 System.out.println("Total purchases: $" + myFormat.format(purchaseTotal)); 
    	 System.out.println("Total tax: $" + taxTotal);
    	 System.out.println("Total price: $" + (taxTotal+purchaseTotal));
    	 System.out.println("\nTax for first purchase at original rate: $" + myFormat.format(tax1.calcTax(20)));
    	 tax1.changeTax(.01);
    	 System.out.println("Tax for first purchase at adjusted rate: $" + myFormat.format(tax1.calcTax(20)));
    	 System.out.println("\nTax for second purchase at original rate: $" + myFormat.format(tax2.calcTax(20)));
    	 tax2.changeTax(.01);
    	 System.out.println("Tax for second purchase at adjusted rate: $" + myFormat.format(tax2.calcTax(20)));
    	 
    	 
     }
}
