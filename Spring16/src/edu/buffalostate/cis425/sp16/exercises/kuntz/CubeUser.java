package edu.buffalostate.cis425.sp16.exercises.kuntz;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class CubeUser
{
	
	private double length = 0;
	
	public CubeUser(double Length){
		length = Length;
	}
	
	public double getLength(){
		return length;
	}
	
	public double calculateSurfaceArea(){
		return 6*(length*length);
	}
	
	public double calculateVolume(){
		return length*length*length;
	}
	
    public static void main(String args[]) throws IOException
    {
    	double Length = 0;
    	boolean isValid = false;
    	while(isValid == false) {
    		Scanner in = new Scanner(System.in);
	        try{
		        for(int count = 1; count < 4; count++)
		        	{
		        		System.out.println("Enter desired length of side of cube: " + count);
				        Length = in.nextDouble();
				        CubeUser cube = new CubeUser(Length);
				        System.out.println("Side length of cube " + count + " is " + cube.getLength());
				        System.out.println("Surface Area of cube "+ count + " is " + cube.calculateSurfaceArea());
				        System.out.println("Volume of cube " + count + " is " + cube.calculateVolume());
				        System.out.println("");
		        	}
		        isValid = true;
	        	}
	        catch (InputMismatchException a){
	            System.out.print("Invalid input, please enter a numeric value. ");
	        }
	        
    	}
    }
}
