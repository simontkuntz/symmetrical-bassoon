package edu.buffalostate.cis425.sp16.exercises.kuntz;

public class NumberAdder {

	/*
	  *
	  * @author Simon Kuntz

	  *
	  */ 
	    private double num1;
	    private double num2;

	    /**
	     * setNums() sets the two instance variables from the given parameters
	     * @param n1 -- one of the given numbers
	     * @param n2 -- the second given number
	     */
	    public void setNums(double n1, double n2)
	    {
	        num1 = n1;
	        num2 = n2;
	    }
	    
	    public double getDifference(){
	    	return num1 - num2;
	    }

	    public double getMult(){
	    	return num1 * num2;
	    }
	    
	    public double getDiv(){
	    	if(num2==0.0){
	    		System.out.println("Error, cannot divide by zero.");
	    		return Double.NaN;
	    	}
	    	else{
	    		return num1 / num2;
	    	}
	    }
	    
	    /**
	     * getSum() returns the sum of the two instance variables
	     */
	    public double getSum()
	    {
	        return num1 + num2 ;
	    }

	    /**
	     * main() creates two instances of this class and tests its
	     *  setNums() and getSum() methods
	     */
	    public static void main(String args[])
	    {
	        NumberAdder adder1 = new NumberAdder(); // Create two instances
	        NumberAdder adder2 = new NumberAdder();
	        adder1.setNums(10,15);                  // Set the instances' values
	        adder2.setNums(100,0);
	        System.out.println("Sum of adder1 " + adder1.getSum());  // Print the values
	        System.out.println("Sum of adder2 " + adder2.getSum());
	        System.out.println("Difference of adder2 " + adder2.getDifference());
	        System.out.println("Product of adder2 " + adder2.getMult());
	        System.out.println("Quotient of adder2 " + adder2.getDiv());
	    }
	}
