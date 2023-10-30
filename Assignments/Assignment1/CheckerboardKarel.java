/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part 
	public void run() { 
		
		makeCheckerBoard();
		
	}
	//putBeeper();
//	if (frontIsClear) {
//		move();
//	} else {
//		if (facingEast()) {
//		turnLeft();
//		move();
//		turnLeft();
//		} else if(facingWest()) {
//			if (facingEast()) {
//				turnRight();
//				move();
//				turnRight();
//			}
//		}
//	}
	
	private void makeCheckerBoard() {
		while (facingWest() & rightIsClear() || facingEast() & leftIsClear()) {
			makeRow();
			moveToNextRow();
		}
		makeRow();
		
		
}
	private void makeRow() {
		while (frontIsClear()) {
				putBeeper();
				move();
				if (frontIsClear()) {
					move();
				}
			}
		}
	private void moveToNextRow() {
		if(facingWest()) {
			rePositionToEast();
		} else if (facingEast()) {
			rePositionToWest();
		}
	}
	private void rePositionToWest() {
		turnLeft();
		if (leftIsClear()) {
			
			move();
			turnLeft();
		}
	}
	private void rePositionToEast() {
		turnRight();
		if (rightIsClear()) {
			move();
			turnRight();
		}
	}
	

}
