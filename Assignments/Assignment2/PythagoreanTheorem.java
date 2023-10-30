/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		
		computePythagoreanTheorem();
	}
	
	private void computePythagoreanTheorem() {
		println("Enter values to compute Pythagorean Theorem.");
		int a = readInt("a: ");
		int b = readInt("b: ");
		a = a*a; //a^2
		b= b*b; //b^2
		int c = a+b; //a^2+b^2
		double sqrtOfC = Math.sqrt(c); // sqrt of c
		println("c: " + sqrtOfC); // print srt of c
	}
}
