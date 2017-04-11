package edu.buffalostate.cis425.sp16.exercises.kuntz;
/*
 *  File: IntOutOfRangeException.java
 *  Author: Java, Java, Java
 *  Description: This Exception subclass is invoked when an
 *   integer value exceeds its bound. 
 */

public class IntOutOfRangeException extends Exception {
   
    public IntOutOfRangeException(int Bound) {
        super("The input value exceeds the bound " + Bound);
    }
}
