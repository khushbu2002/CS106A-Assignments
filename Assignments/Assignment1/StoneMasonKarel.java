/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part 
	
	public void run() {
		makeMason();
	}
	
	private void buildRow()  {
		 
		buildingRowUpwards();
		comingBackDownwards();
		
	}
	private void buildingRowUpwards() {    
		
		turnLeft();
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
				
			}
			move();
		}
		if(frontIsBlocked()) {
			if(noBeepersPresent()) {
				putBeeper();
			}
		}
		
		
	}
	private void comingBackDownwards() {
		if (frontIsBlocked()) {
			turnAround();
			while (frontIsClear()) {
				move();
			}
			turnLeft();
		}
	}
	private void moveToNextRow() {
			for (int i=0;i<4;i++) {
				move();
			}
	}
	private void makeMason() {
		while (frontIsClear()){
			buildRow();
			moveToNextRow();
		}
		buildRow();
	}
}
