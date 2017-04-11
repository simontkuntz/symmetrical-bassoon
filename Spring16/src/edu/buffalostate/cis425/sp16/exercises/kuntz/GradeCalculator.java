package edu.buffalostate.cis425.sp16.exercises.kuntz;

/*
 *  4) Check user input for errors. The program should handle the entry of characters,
 *     and other non-numeric symbols without causing a crash
 */

public class GradeCalculator
{
    int gradeCount = 0;      // GradeCalculator's internal state
    private double gradeTotal = 0.0;


    public boolean addGrade(double grade)
    {
    	if((grade>100)||(grade<0))
    	{
    		System.out.println("Error encountered, grade is out of range and rejected");
    		return false;
    	}
    	
    	else{
    		gradeTotal += grade;
            ++gradeCount;
            return true;
    	}
    }

    public double calcAvg()
    {
        return gradeTotal/gradeCount;
    }

//	HINT:
//	Add a new public method that returns the gradeCount
//	-- fill in rest of code
    
    public int getCount(){
    	return gradeCount;
    }

    public String calcLetterGrade ()
    {
        double avg = gradeTotal / gradeCount;
        if (avg >= 97.0)
            return "A+";
        else if (avg >= 94.0)
            return "A";
        else if (avg >= 90.0)
            return "A-";
        else if (avg >= 87.0)
            return "B+";
        else if (avg >= 84.0)
            return "B";
        else if (avg >= 80.0)
            return "B-";
        else if (avg >= 77.0)
            return "C+";
        else if (avg >= 74.0)
            return "C";
        else if (avg >= 70.0)
            return "C-";
        else if (avg >= 67.0)
            return "D+";
        else if (avg >= 64.0)
            return "D";
        else if (avg >= 60.0)
            return "D-";
        else if (avg < 60.0)
        	return "F";
        else{
        return "Error";
        }
    }
}