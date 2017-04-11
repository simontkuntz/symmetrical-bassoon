package edu.buffalostate.cis425.sp16.exercises.kuntz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PairManager {
	
	public int num1;
	public int num2;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public PairManager(){
		//initializes the pairs to zero
		
		num1 = 0;
		num2 = 0;
		
	}
	
    private int getInput(String prompt){
    	//- this method returns an integer from the keyboard. You must check for exceptions with try/catch blocks and recover gracefully from an exception. The prompt string is printed as a user prompt.
    	num1 = Integer.parseInt(prompt);
    	return num1;
    }
    

//    
  public boolean getPair(){
//    	//- this method assigns values to the pair of integers by reading two numbers. You should call getInput( ) for each number.
	  getInput();
  }
//    
//    public int getFirst(){
//    	//- this method returns the first integer
//    }
//    
//    public int compAverage(){
//    	//- returns the average of the pairs.
//    }
    
    public static void main(String args[]){
    	
    Scanner in = new Scanner(System.in);
    String firstnum;
    String secondnum;
    
    PairManager PM = new PairManager();
    System.out.println("Enter first number: ");
    firstnum = in.nextLine();
    System.out.println("Enter second number: ");
    secondnum = in.nextLine();
    
    PM.getInput1(firstnum);
    PM.getInput2(secondnum);
  
//    PM.getPair();
//    System.out.println("Average of the pairs is: " + PM.compAverage());
    }
}
