package edu.buffalostate.cis425.sp16.exercises.kuntz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class GradeCalcPanel extends JPanel implements ActionListener
{
    private JLabel prompt;           // GUI components
    private JTextField inputField;
    private JLabel resultLabel;
    private JTextField resultField;
    private JButton button;
    private GradeCalculator calculator;  // The Calculator object

    public GradeCalcPanel()
    {
    calculator = new GradeCalculator(); // Create a calculator instance
 // setLayout( new GridLayout(1,5,10,10));
    prompt = new JLabel("Grade:");
    resultLabel = new JLabel("Average:");
    inputField = new JTextField(10);
    resultField = new JTextField(20);
    resultField.setEditable(false);
    button = new JButton("Enter");
    button.addActionListener(this);

    add(prompt);
    add(inputField);
    add(button);
    add(resultLabel);
    add(resultField);

    inputField.setText("");		// sets the input label to nothing

    } // GradeCalcPanel()


    /**
     * actionPerformed() handles clicks on the button.
     *  It takes the data from the input JTextFields, and sends them to
     *  the GradeCalculater class to calculate a running average and
     *   computes the letter grade, which are displayed in TextFields.
     * @param e -- the ActionEvent the generated this system call
     */
    public void actionPerformed(ActionEvent e)
    {

      double grade = 0.0, ave;									//will it keep setting to 0?
        DecimalFormat df = new DecimalFormat("0.00");

        String inputString = inputField.getText();

        // HINT: use try/catch blocks to catch bad input to parseDouble()
        
        try{
        grade = Double.parseDouble(inputString);
        calculator.addGrade(grade);
        inputField.setText("");
        }
        
        catch(Exception ex){
        	System.out.println("Input mismatch occurred.");
        }

        //calculator.addGrade(grade);

  // HINT: output grade count along with average and letter grade
        
        ave = calculator.calcAvg();
        String average = "" + df.format(ave);
        String letterGrade = calculator.calcLetterGrade();
        int count = calculator.getCount();
        resultField.setText(average + " " + letterGrade);
        System.out.println("Current grade count: " + count + " Average: " + average + " Letter Grade: " + letterGrade);
    } // actionPeformed()

} // GradeCalcPanel class

