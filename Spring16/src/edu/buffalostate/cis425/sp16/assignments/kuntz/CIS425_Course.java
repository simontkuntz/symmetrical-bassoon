package edu.buffalostate.cis425.sp16.assignments.kuntz;
/* 
 * don't forget comments 
*/
public class CIS425_Course {
	public int classCapacity;
	public int[] roster;
	public int enrolledVar;					//should these be up here or within the default constructor?
	
     public CIS425_Course(int capacity)
     {
    	 classCapacity = capacity;
    	 roster = new int[capacity];
    	 enrolledVar = 0;						//is this what we want? what are we setting it to?
    	 
     }
     public boolean addStudent(String name, int num_exams){
    	if(enrolledVar<classCapacity){
    		roster[enrolledVar] = new CIS425_Student(name,num_exams);		//need to yet add to the roster array
    		return true;
    	}
    	
    	else{
    		return false;
    	}
     }
     
     public CIS425_Student findStudent(String name){
    	 // find student name and return object
     }
     public double computeAverage( int exam ) { }
     public static void main( String[] args ) {
 
     }
 }