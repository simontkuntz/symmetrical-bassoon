package edu.buffalostate.cis425.sp16.exercises.kuntz;

/*
 *  Author: Simon Kuntz
 * 
 */


public class NumberCruncher
{
    private double num;    // The instance variable

    /**
     * NumberCruncher() constructor creates an instance that
     *  stores the number given as its parameter
     * @param number -- the number that will be stored
     */
    public NumberCruncher(double number)
    {
        num = number;
    }
    
    public double cubeNumber(){
    	return num*num*num;
    }
    
    public double sixthNumber(){
    	return cubeNumber()*cubeNumber();
    }

    /**
     * getNum() returns the object's number
     */
    public double getNum()
    {
        return num;
    }

    /**
     * doubleNum() returns the object's number times 2
     */
    public double doubleNum()
    {
        return num * 2;
    }

    /**
     * tripleNum() returns the object's number times 3
     */
    public double tripleNum()
    {
        return num * 3;
    }

    /**
     * squareNum() returns the square of the object's number
     */
    public double squareNum()
    {
        return num * num;
    }


    /**
     * main() creates an instance of this class and tests its
        various methods
     */
    public static void main( String args[] )
    {
        NumberCruncher cruncher1 = new NumberCruncher(10);
        System.out.println("Value of num is " + cruncher1.getNum());
        System.out.println("num doubled is " + 	cruncher1.doubleNum());
        System.out.println("num tripled is " + cruncher1.tripleNum());
        System.out.println("num squared is " + cruncher1.squareNum());
        System.out.println("num cubed is " + cruncher1.cubeNumber());
        System.out.println("num to the sixth is " + cruncher1.sixthNumber());

    }
}