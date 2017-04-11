package edu.buffalostate.cis425.sp16.exercises.kuntz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

// HINT: use ChangeListener rather than ActionListener

public class ColorPicker extends JFrame implements ChangeListener {
    
	private JSlider redIn = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 0);
	private JSlider greenIn = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 0);
	private JSlider blueIn = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 0);
	
    private JLabel R = new JLabel("R:"),
                   G = new JLabel("G:"),
                   B = new JLabel("B:");
    private JPanel controls = new JPanel();
    private Canvas canvas = new Canvas();

    /**
     *  init() sets up the app's interface. A (default) border layout
     *   is used, with the controls at the north and the drawing canvas
     *   in the center.
     */
    public ColorPicker() {
        initControls();
        getContentPane().setLayout(null);
        controls.setBounds(0, 0, 329, 145);
        getContentPane().add(controls);
        canvas.setBounds(0, 146, 329, 213);
        getContentPane().add(canvas);
        canvas.setBorder(BorderFactory.createTitledBorder("The Color Display"));
        canvas.setLayout(null);
        getContentPane().setBackground(Color.white);
        setSize(341,396);
               //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }

    /**
     *  initControls() arranges the app's control components in a separate
     *   JPanel, which is placed at the north border. The controls consist of
     *   three JTextFields into which the user can type RGB values.
     */
    private void initControls() {
    	controls.setLayout(null);
    	R.setBounds(41, 25, 11, 14);
    	controls.add(R);
        
    	redIn.setBounds(57, 21, 200, 23);
    	controls.add(redIn);
    	G.setBounds(41, 64, 11, 14);
    	controls.add(G);
    	
    	greenIn.setBounds(57, 55, 200, 23);
    	controls.add(greenIn);
    	B.setBounds(41, 97, 11, 14);
    	controls.add(B);
    	
    	blueIn.setBounds(57, 88, 200, 23);
    	controls.add(blueIn);
    	
    	redIn.addChangeListener(this);
        greenIn.addChangeListener(this);
        blueIn.addChangeListener(this);
        controls.setBorder(BorderFactory.createTitledBorder("Type in values for RGB"));
        controls.add(greenIn);
        controls.add(blueIn);
    } // initControls()


	// HINT: if you are not using IntField, then you do not need actionPerformed()

    /**
     *  actionPerformed() handles the app's actions. No matter which action
     *   led to the method call, integer values are read from the RGB text fields
     *   and passed along as a new color to the canvas object. The app is then
     *   repainted. If the user types an invalid value into the IntField, a message
     *   dialog is used to print an error message.
     */
//    public void actionPerformed(ActionEvent e) {
//        try {
//            int r = redIn.getInt();    // Get user's inputs
//            int g = greenIn.getInt();
//            int b = blueIn.getInt();
//            canvas.setColor(new Color(r, g, b)); // If no error, reset the canvas's color
//            repaint();                           //  and repaint the app
//        } catch (IntOutOfRangeException ex) {
//            JOptionPane.showMessageDialog(this, "The input value must be between 0 and 255");
//        }
//    } // actionPerformed()

	// HINT: add the following

	public void stateChanged( ChangeEvent e) {
			int r, g, b;
			r=redIn.getValue();
			g=greenIn.getValue();
			b=blueIn.getValue();
			canvas.setColor(new Color(r, g, b));
			repaint();
			
	}

    public static void main(String args[]) {
        ColorPicker c = new ColorPicker();
        c.setVisible(true);
    } // main()


} // ColorPicker
