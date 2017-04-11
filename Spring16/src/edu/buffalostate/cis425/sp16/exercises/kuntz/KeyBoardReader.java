package edu.buffalostate.cis425.sp16.exercises.kuntz; 

 import java.io.*;

public class KeyBoardReader implements UserInterface
{    private BufferedReader reader;

     public KeyBoardReader() {
		 reader = new BufferedReader(new InputStreamReader(System.in));
     }

     public String getKeyboardInput() {
        return readKeyboard();
     }

     public int getKeyboardInteger() {
        return Integer.parseInt(readKeyboard());
     }

// HINT: add new method that limits input in range from Min to Max
//	 
//	    fill in rest, method should not return until the user entered number is within range
//		Prompt user with message if number is not within range before looping for another try.
//      Catch exceptions

    public int getKeyboardIntegerRange(int min, int max){
    	int storeInput;
    	
    	while(true){
    	try{
    		storeInput = Integer.parseInt(readKeyboard());
    		if((storeInput>min)&&(storeInput<max)){
    			return storeInput;
    		}
    		
    		else{
    			System.out.println("Please enter a number within min and max range");
    		}
    	}
    	
    	catch(Exception ex){
    		System.out.println("Please enter a numerical value between min and max");
    	}
    	}
    	
    }

    public double getKeyboardDouble() {
        return Double.parseDouble(readKeyboard());
    }

    public String getUserInput() {
        return getKeyboardInput();
    }

    public void prompt(String s) {
       System.out.print(s);
    }

    public void report(String s) {
       System.out.print(s);
    }

    public void display(String s) {
       System.out.print(s);
    }

    private String readKeyboard() {
       String line = "";
       try {
            line = reader.readLine();
       }
       catch (IOException e) {
            e.printStackTrace();
       }
       return line;
     }
}

