
import acm.program.*;
import acm.util.*;

public class Craps extends ConsoleProgram {
	
	public void run() {
		int total= rollDice();
		 if(total==7 || total==11) {
			 println("Its a natural, you win");
		 } else if (total == 2 || total == 3 || total == 12) {
			 println("Its a crap, you lose");
		 } else  {
			 int point = total;
			 println("your point is " + point + "." );
			  while (true) {
				  total = rollDice();
				 if (total == point) {
					 println(" you win");
					 break;
				 } else if (total == 7) {
					 println("you lose");
					 break;
				 } 
				 
			  }
		 }
		
		
		
	}
	
	private int rollDice() {
		int d1 = rgen.nextInt(1, 6);
		int d2 = rgen.nextInt(1, 6);
		int total = d1 + d2 ;
		println("Dice rolled : " + d1 + " + " + d2 + " = " + total);
		return total;
	}
	
	private RandomGenerator rgen = new RandomGenerator();

}
