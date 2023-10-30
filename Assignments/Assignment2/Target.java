/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		/* You fill this in. */
		  xLocation = getWidth()/2;
		 yLocation = getHeight()/2;
		
		makeTarget();
		
	}
	
	private void makeTarget() {
		
		//humne xlocation se outer circle isiloye minus kia kyuki hu ni chahte ki hum center se shuru kre lekin hum
		//chahte h ki circle ka center coincide kre graphics window k center k sath.
		
		GOval outerCircle = new GOval(xLocation - outerR , yLocation - outerR, 2*outerR , 2*outerR);
		outerCircle.setFilled(true);
		outerCircle.setColor(Color.RED);
		
		GOval middleCircle = new GOval(xLocation - middleR , yLocation - middleR, 2*middleR , 2*middleR);
		middleCircle.setFilled(true);
		middleCircle.setColor(Color.WHITE);
		
		GOval innerCircle = new GOval(xLocation - innerR , yLocation - innerR, 2*innerR , 2*innerR);
		innerCircle.setFilled(true);
		innerCircle.setColor(Color.RED);
		
		add(outerCircle);
		add(middleCircle);
		add(innerCircle);
	}
	private double outerR = 72;
	private double middleR = outerR * 0.65;
	private double innerR = outerR * 0.3;
	double xLocation;
	 double yLocation;
	
	
	
}
