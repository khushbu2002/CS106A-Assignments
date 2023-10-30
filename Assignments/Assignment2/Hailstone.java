/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		hailStone();
	}
	private void hailStone() {
		int n = readInt("Enter a number: ");
		int counter=0;
		
		while (n != 1) {
			
			if ((n % 2) == 0) {
				
				println(n + " is even, so I take half: " + (n = n/2));
				counter++;
				
			} else if ((n % 2) != 0) {
				println(n + " is odd, so I make 3n+1:  " + (n = (3*n)+1));
				counter++;
			}
			
		}
		
		println(" It took " + counter + " steps to reach 1");
	}
}

