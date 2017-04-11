package edu.buffalostate.cis425.sp16.exercises.kuntz;

/*
 * File: BounceBall.java
 *
 * Description: This class defines a ball that bounces up and
 *  down within an applet. The "bouncing" is effected by repeatedly
 *  drawing, and erasing and moving the ball in the run() method.
 *  Note the use class constants in the program
 *
 * In this version of Ball, instead of starting every Ball in the center
 *  of the bounce area, each ball is given a random x-coordinate. So each
 *  bounces in its own vertical space. Also, the balls bounce at random
 *  angles off of the four walls. The randomness is introduced by changing
 *  the y-coordinate by a random amount between -4 and +4 each time the
 *  ball bounces off either the right or left wall. This changes the angle
 *  of the ball's motion.
 *
 * Assignment: See BounceApp for more information
 *
 *
 */

import javax.swing.*;
import java.awt.*;

public class BounceBall extends Thread implements Runnable {

	// HINT create ovals rather than a circle
	// need SizeX, SizeY of two different lengths

    private static final int SIZE = 5;       // Diameter of the ball
    private static int SIZEX = 5;
    private static int SIZEY = 5;

    private static final int DX = 5;        // Number of pixels to move the ball
    private static final int DY = 5;        // Number of pixels to move the ball
//    private static final int BORDER = 50;   // A 50 pixel border around drawing area
    private static final int MINDY = -4;    // Used by randomizer: Vertical changes goes from
    private static final int MAXDY = 9;     //   -4 to +4, giving 9 discrete values

    private BounceApp app;                 	// Reference to the app
    private int topWall, bottomWall;        // Boundaries
    private int leftWall, rightWall;        // Boundaries

    private Point location;                 // Current location of the ball
    private int directionX = 1, directionY = 1;  // Ball's x- and y-direction (1 or -1)
    private int deltaY;                      // Change in the Y coordinate
    private Color ballcolor;

    /**
     * BounceBall() constructor sets a pointer to the app and initializes the ball's location
     *  at the center of the bouncing region
     */
    public BounceBall(BounceApp f) {
        app = f;
        Graphics g;
        Dimension gameArea = app.getSize();       // Define bouncing region
        rightWall = gameArea.width - app.BORDER - SIZE;  // And location of walls
 	    leftWall = app.BORDER + 1;
        topWall = app.BORDER + 1;
        bottomWall = gameArea.height - app.BORDER - SIZE;

        int xLoc = app.BORDER + (int)(Math.random() * (gameArea.width - 2*app.BORDER)); // Pick a random xLoc

        location = new Point(xLoc, gameArea.height/2);  // Set initial location
        
        int a = (int)(Math.random()*255+1);
        int b = (int)(Math.random()*255+1);
        int c = (int)(Math.random()*255+1);

        // HINT: Create a new random color
        ballcolor = new Color(a,b,c);
        synchronized( app ) {  // make sure one ball at a time is allowed to access canvas
			g=app.getGraphics();
            g.setColor(ballcolor);
            g.dispose();
	    }
        
        
        // HINT: Create a new oval shape ( two values )
        SIZEX = (int)(Math.random()*100+1);
        SIZEY = (int)(Math.random()*100+1);
        


    } // BounceBall()


    /**
     * erase() erases the ball
     *
     */
    public void erase() {
		synchronized(app) { // only one ball at a time is allowed to do drawing
        	Graphics g = app.getGraphics();
        	g.setColor(Color.white);
        	g.fillOval(location.x, location.y, SIZE, SIZE); //  erase
        	g.dispose();
		}
    } // erase()



    /**
     * draw() draws ball
     */
    public void draw() {
		synchronized(app) {				// only one ball at a time is allowed to do drawing
        	Graphics g = app.getGraphics();
        	g.setColor(ballcolor);
        	// HINT: set Oval to random SizeX, SizeY values
        	g.fillOval(location.x, location.y, SIZEX, SIZEY); //  draw
        	g.dispose();
		}
    } // draw()



    /**
     * move() changes the ball's vertical location (y-coordinate) by DY pixels.
     *  It then checks if the ball has reached a boundary and if so reverses direction
     */
     public void move() {
         location.x = location.x + DX * directionX; // Calculate a new location
         location.y = location.y + deltaY * directionY;

         if (location.y > bottomWall) {    // If ricochet
             directionY = -directionY;      //  reverse direction
             location.y =  bottomWall;

         }
         if (location.y < topWall) {
             directionY = -directionY;       // Reverse direction
             location.y = topWall;

         }
         if (location.x > rightWall )  {
             directionX = -directionX;
             deltaY = MINDY + (int) (Math.random() * MAXDY); // CHANGE VERTICAL DIRECTION
             location.x =  rightWall;

         }

         if ( location.x < leftWall ) {
             directionX = -directionX;
             deltaY = MINDY + (int) (Math.random() * MAXDY); // CHANGE VERTICAL DIRECTION
             location.x = leftWall;

         }
    } // move()

    /**
     * run() repeatedly draws, erases and moves the ball
     */
    public void run() {
        while (true) {
            draw();                          // Draw
            try {
                sleep(50);
            }
            catch (InterruptedException e) {}
            erase();                        // Erase
            move();                         // Move
       } // while
    } // run()
} // BounceBall