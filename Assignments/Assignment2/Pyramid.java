/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 16;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	private double x = 0;
	private double y = 0;
	private double bricksLeft= BRICKS_IN_BASE;
	
	public void run() { 
		
		x = (getWidth()/2) - ((BRICK_WIDTH * bricksLeft)/2);
		y = getHeight() - BRICK_HEIGHT;

		for (int i =0; i<BRICKS_IN_BASE; i++) {
			for(int j=0; j<bricksLeft; j++) {
				GRect rect = new GRect(x+ j*BRICK_WIDTH, y - i*BRICK_HEIGHT , BRICK_WIDTH, BRICK_HEIGHT);
				add(rect);
			}
			bricksLeft--;
			x = (getWidth() / 2 ) - ((bricksLeft * BRICK_WIDTH) /2);
		}
	} 
}
