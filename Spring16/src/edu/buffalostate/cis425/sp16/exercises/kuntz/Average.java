package edu.buffalostate.cis425.sp16.exercises.kuntz;
import java.util.Scanner;

public class Average{		

  public static void main( String args[] ) {
    int sum=0, cnt, num=0, ave=0;
    Scanner sc = new Scanner(System.in);	//making a new Scanner object that accepts input

    System.out.println( "Integer Averaging Program" );
    System.out.println( "Enter 10 Integers" );
    cnt=0;
    for (int i=1; i<11; i++) {						//loop for 10 numbers to be entered
      System.out.print("Enter Integer "+i+": ");
      num=sc.nextInt();								//take users input
      if (num==9999){								//if users input is 9999, then
    	  System.out.print("9999 is an invalid entry. Computing average of prior entered numbers. ");
    	  break;		//exit loop
      }
      cnt++;
      sum=sum+num;
    }
    if (cnt==0){
    	System.out.print("9999 is an invalid entry. Cannot compute average because count is zero (no valid entries)");
    	System.exit(0);
    }
    else{
    	ave= sum / cnt;
    }

    System.out.println("The average of your " + cnt + " numbers is " + ave );
  }
}
