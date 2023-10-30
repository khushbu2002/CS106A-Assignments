/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	public void run() {
		moveToWall();
		collectNewspaper();
		returnBack();
	}
	private void moveToWall() {
		while(frontIsClear()) {
			move();
		}
		if(frontIsBlocked()) {
			turnRight();
			while(leftIsBlocked()) {
				move();
			}
			turnLeft();
		}
	}
	private void collectNewspaper() {
		while(noBeepersPresent()) {
			move();
		}
		pickBeeper();
		turnAround();
	}
	private void returnBack() {
		while(frontIsClear()) {
			move();
		}
		reposition();
	}
	private void reposition() {
		turnRight();
		move();
		turnRight();
	}

}
