package edu.buffalostate.cis425.sp16.exercises.kuntz;

import javax.swing.*;

public class GradeCalcMain extends JFrame
{
    public GradeCalcMain()
    {
        getContentPane().add(new GradeCalcPanel());
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    } // GradeCalcFrame() constructor

    public static void main(String args[]){

		// change GUI so that it looks like Windows GUI, don't worry about this now
        try {
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (Exception e) {}

        GradeCalcMain aframe = new GradeCalcMain();
        aframe.setSize(450,75);
        aframe.setVisible(true);
    } // main()

} // GradeCalcMain class