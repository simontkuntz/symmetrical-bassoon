package edu.buffalostate.cis425.sp16.assignments.kuntz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Box {					//W1 is width and W2 is weight
	private int L1, W1, H1, W2;
	public Box(){
		L1 = 0;
		W1 = 0;
		H1 = 0;
		W2 = 0;
	}

	public Box(int L, int W, int H, int Weight){
		W2 = Weight;
		H1 = H;
		W1 = W;
		L1 = L;
	}
	
	public double calculateVolume(){
		double volume;
		volume = L1*W1*H1;
		return volume;
	}
	
	public double calculateDensity(){
		double density;
		density = W2 / calculateVolume(); //maybe pass volume into parameter if this doesn't work (should work though)
		if(calculateVolume()==0){
			System.out.println("Cannot compute, volume cannot be equivalent to zero. Terminating program now.");
			System.exit(0);
		}
		
		else{
		
		}
		return density;
	}
	
	public static void main( String args[] ) {
		Box B1 = new Box(10, 5, 5, 2600);
		System.out.println("Volume and Density of box are: " + B1.calculateVolume() + " and " + B1.calculateDensity() + " respectively.");
	}

}

