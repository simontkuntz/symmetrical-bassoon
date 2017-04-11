package edu.buffalostate.cis425.sp16.assignments.kuntz;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadCSV {
	
    public static void main(String[] args) throws IOException {
    	
    	String[] tabIndex = new String[12];
    	tabIndex[0] = "|  ";
    	tabIndex[1] = "|  ";
    	tabIndex[2] = "|  ";
    	tabIndex[3] = "|  ";
    	tabIndex[4] = "|  ";
    	tabIndex[5] = "|  ";
    	tabIndex[6] = "|  ";
    	tabIndex[7] = "|  ";
    	tabIndex[8] = "|  ";
    	tabIndex[9] = "| ";
    	tabIndex[10] = "| ";
    	tabIndex[11] = "| ";
    	
    	String[] tabIndex2 = new String[12];
    	tabIndex2[0] = "    |  ";
    	tabIndex2[1] = "   |  ";
    	tabIndex2[2] = "      |  ";
    	tabIndex2[3] = "      |  ";
    	tabIndex2[4] = "        |  ";
    	tabIndex2[5] = "       |  ";
    	tabIndex2[6] = "       |  ";
    	tabIndex2[7] = "     |  ";
    	tabIndex2[8] = "  |  ";
    	tabIndex2[9] = "    |  ";
    	tabIndex2[10] = "   |  ";
    	tabIndex2[11] = "   |  ";
    	
        System.out.println("--------------------------");
        System.out.println("| No | Month Name | Days |");
        System.out.println("--------------------------");
        
      
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/Admin/workspace/Spring16/src/edu/buffalostate/cis425/sp16/assignments/kuntz/cis425_io.txt"))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
            	
               String[] ar=line.split(",");
               int arraysize = tabIndex.length;
               	
        	   System.out.println(tabIndex[i]+ar[0]+" | "+ar[1]+tabIndex2[i]+ar[2]+"  |");
        	   
        	   i++;
	          
            }
            br.close();
            
        }
        
        catch (Exception ex){
        	System.out.println("Cannot read file. Error.");
        }
        System.out.println("--------------------------");
    }
}




//public class ReadCSV {
//	
//	    public static void main(String[] args) throws FileNotFoundException {
//	    	
//	    	String[] tabIndex = new String[12];
//	    	tabIndex[0] = "|      ";
//	    	tabIndex[1] = "|      ";
//	    	tabIndex[2] = "|      ";
//	    	tabIndex[3] = "|      ";
//	    	tabIndex[4] = "|      ";
//	    	tabIndex[5] = "|      ";
//	    	tabIndex[6] = "|      ";
//	    	tabIndex[7] = "|      ";
//	    	tabIndex[8] = "|      ";
//	    	tabIndex[9] = "|     ";
//	    	tabIndex[10] = "|     ";
//	    	tabIndex[11] = "|     ";
//	    	
//	    	String[] tabIndex2 = new String[12];
//	    	tabIndex2[0] = "    |";
//	    	tabIndex2[1] = "   |";
//	    	tabIndex2[2] = "      |";
//	    	tabIndex2[3] = "      |";
//	    	tabIndex2[4] = "        |";
//	    	tabIndex2[5] = "       |";
//	    	tabIndex2[6] = "       |";
//	    	tabIndex2[7] = "     |";
//	    	tabIndex2[8] = "  |";
//	    	tabIndex2[9] = "    |";
//	    	tabIndex2[10] = "   |";
//	    	tabIndex2[11] = "   |";
//	    	
//	        Scanner scanner = new Scanner(new File("/Users/Admin/workspace/Spring16/src/edu/buffalostate/cis425/sp16/assignments/kuntz/cis425_io.txt"));
//	        scanner.useDelimiter(",");
//	        System.out.println("--------------------------");
//	        System.out.println("| No | Month Name | Days |");
//	        System.out.println("--------------------------");
//	        
//	        int arraysize = tabIndex.length;
//	       
//	        	for(int i=0; i<arraysize; i++){
//	        		System.out.print(scanner.next()+tabIndex[i] + scanner.next());
//	        		System.out.print(tabIndex2[i]);
//	        		System.out.print(scanner.next());
//	        }
//	        
//	        System.out.println("");
//	        System.out.println("--------------------------");
//	        scanner.close();
//	    }
//
//	}
