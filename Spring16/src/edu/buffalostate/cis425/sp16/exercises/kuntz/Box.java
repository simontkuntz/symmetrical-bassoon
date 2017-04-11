package edu.buffalostate.cis425.sp16.exercises.kuntz;
/*
 * File: Box.java
 * Author: Java, Java, Java
 * Description: This program draws a rectangular box of
 *  asterisks given the number of rows and columns from
 *  the user.
 */

/*
 * Assignment: 1) Add to the KeyboardReader class a new method:
 *                public int getKeyboardIntegerRange(int min, int max) {}
 *                that inputs a number from the keyboard, but limited to 
 *                a range: min, max. The function should not return
 *                until the user cooperates and enters a number in the 
 *                correct range. Check for exceptions and handle errors 
 *                properly.
 *             2) Fix Box.java so that it compiles properly, there are 
 *                at least two possible fixes
 *             3) Test your new getKeyboardIntegerRange() method in 
 *                the Box (main) class to see if it works
 */

import java.io.*;

public class Box {

    /**
     * drawBox() draws a row x col box of asterisks
     * @param row -- an int giving the number of rows
     * @param col -- an int giving the number of columns
     */
    public static void drawBox (int row, int col) {
        for (int k = 0; k < row; k++) {
            for (int j = 0;j < col; j++)
                System.out.print('*');
            System.out.println();
        }
    } // drawBox()

    /**
     * main() inputs the number of rows and columns from the
     *  user and invokes the Box.drawBox() method to draw a box.
     */
    public static void main(String args[]) throws IOException{
        int nRows = 0;
        int nColumns = 0;

        KeyBoardReader input = new KeyBoardReader();

        System.out.print("Enter the number of rows you want in your box: ");
        nRows = input.getKeyboardInteger();
        System.out.print("Enter the number of columns you want in your box: ");
        nColumns =  input.getKeyboardInteger();
        System.out.println("This is what your box looks like\n");
        Box.drawBox(nRows, nColumns);
        input.getKeyboardIntegerRange(4,10);
    } // main()
} // Box