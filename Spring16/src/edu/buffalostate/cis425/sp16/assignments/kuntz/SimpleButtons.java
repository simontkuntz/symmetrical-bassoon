package edu.buffalostate.cis425.sp16.assignments.kuntz;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SimpleButtons extends JFrame implements ActionListener {
	
		private JFrame myFrame = new JFrame("Simple Buttons");		//making JFrame for buttons
		private JButton btn1 = new JButton("1");
		private JButton btn2 = new JButton("2");				//making new buttons
		private JButton btn3 = new JButton("3");
		private JButton btn4 = new JButton("4");
		private JLabel myLabel = new JLabel("0");			//making label that can be updated with the corresponding button number
		private JPanel mainPanel = new JPanel();			//making JPanel for the whole GUI
		private JPanel buttonPanel = new JPanel();				//making JPanel for the buttons only
		
		public SimpleButtons() {
			
			myFrame.setSize(200,100);									//setting window size of JFrame
			mainPanel.setBackground(Color.cyan);		
			
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//setting default close operation
			myFrame.setLayout(new GridLayout(2,2));						//
			
			buttonPanel.add(btn1);			//adding buttons to the button panel
			buttonPanel.add(btn2);
			buttonPanel.add(btn3);
			buttonPanel.add(btn4);
			mainPanel.add(myLabel);			//adding label to the panel for the whole GUI
			
			myFrame.add(buttonPanel);		//adding both panels to the frame
			myFrame.add(mainPanel);
			
			myFrame.setVisible(true); // making the JFrame visible
			
			btn1.addActionListener(this);
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			btn4.addActionListener(this);			//adding action listeners for updating the label based on button click
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){
			myLabel.setText("1");
		}
		if(e.getSource()==btn2){
			myLabel.setText("2");
		}												//if statements to update label based on chosen button
		if(e.getSource()==btn3){
			myLabel.setText("3");
		}
		if(e.getSource()==btn4){
			myLabel.setText("4");
		}
		
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){			//main function
			public void run() {
				new SimpleButtons();              
				}         
		});
	}
}
