package edu.buffalostate.cis425.sp16.assignments.kuntz;

/*
 * don't forget comments
*/
public class CIS425_Student extends Student{
	
	int number_exams = 0;					//for now initializing num_exams to a number
	int[] exams;
	String Name;
	//= new int[num_exams];
	
    public CIS425_Student(String name, int num_exams){
    	exams = new int[num_exams];
    	Name = name;
    	number_exams = num_exams;
    }
    
    public boolean addGrade(int exam, int grade){ 
    	if(exam<=number_exams){
    		exams[exam] = grade;						//if parameter exam is within range of array, pass grade to current
    		return true;								//position in array exams. Then return true
    	}	
    	
    	else{
    		return false;			//if not within range return false
    	}
    }
    
    public int getGrade(int exam){ 
    	if(exam<=number_exams){
    	return exams[exam];				//returning stored grade variable at the position "exam" in array of exams
    	}
    	
    	else{
    		return -1;
    	}
    }
    
    
    public String getName(){
    	return name;			//returning student name
    }
    
}
