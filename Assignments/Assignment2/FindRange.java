/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	private static final int SENTINEL = 0;
	
	public void run() {
		/* You fill this in */
		
		findRange();
	}
	private void findRange() {
		println("This program finds the largest and smallest numbers");
		int smallest=2147483647;
		int largest=-2147483648;
		int	valueCount=0;
		while (true) {
			int value = readInt("? ");
			if (value == SENTINEL) {
				if(valueCount==0) {
					println("no value entered");
					return;
				}
				println("smallest: " + smallest);
				println("largest: " + largest);
				return;
			}
			if (value > largest) {
				largest = value;
			}
			
			if (value < smallest) {
				smallest = value;
			}
			
			valueCount++;
		}		
	}
}

