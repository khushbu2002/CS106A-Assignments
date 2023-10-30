import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	private static final double TEXT_BOX_WIDTH = 150;
	private static final double TEXT_BOX_HEIGHT = 50;
	private static final double TEXT_BOX_GAP = 20;
	
	public void run() {
		/* You fill this in. */
		
		//Mid Line
		double midLineLength=TEXT_BOX_WIDTH/2;
		GPoint midLineStart=new GPoint();
		midLineStart.setLocation(getWidth()/2, getHeight()/2-midLineLength/2);
		
		GPoint midLineEnd=new GPoint();
		midLineEnd.setLocation(getWidth()/2, getHeight()/2+midLineLength/2);
		
		//progToConsole
		GLine midLine = new GLine(midLineStart.getX(),midLineStart.getY(),midLineEnd.getX(),midLineEnd.getY());
		
		// program Box
		GRect progBox = new GRect(midLineStart.getX() - TEXT_BOX_WIDTH/2, midLineStart.getY() - TEXT_BOX_HEIGHT ,TEXT_BOX_WIDTH ,TEXT_BOX_HEIGHT  );
		//program box label
		GLabel progLabel = new GLabel("Program");
		progLabel.setLocation((progBox.getX()+TEXT_BOX_WIDTH/2) - progLabel.getWidth()/2 ,progBox.getY()+progBox.getHeight()/2+progLabel.getAscent()/2);
		
		//console box
		GRect consoleBox = new GRect(midLineEnd.getX() - TEXT_BOX_WIDTH/2, midLineEnd.getY() ,TEXT_BOX_WIDTH,TEXT_BOX_HEIGHT );
		
		//console box label
		GLabel consoleLabel = new GLabel("ConsoleProgram");
		consoleLabel.setLocation((consoleBox.getX() + TEXT_BOX_WIDTH/2) - (consoleLabel.getWidth()/2), consoleBox.getY() + (consoleBox.getHeight()/2) + (consoleLabel.getAscent()/2) );
		
		// Graphics Box
		GRect graphicsBox = new GRect(midLineEnd.getX() - (TEXT_BOX_WIDTH/2 + TEXT_BOX_WIDTH + TEXT_BOX_GAP ),midLineEnd.getY() , TEXT_BOX_WIDTH,TEXT_BOX_HEIGHT );
		
		//graphics box label
		GLabel graphicsLabel = new GLabel("GraphicsProgram");
		graphicsLabel.setLocation((graphicsBox.getX() + (TEXT_BOX_WIDTH/2)) - (graphicsLabel.getWidth() / 2), (graphicsBox.getY() + (TEXT_BOX_HEIGHT/2)) + (graphicsLabel.getAscent()/2));
		
		// programBox to graphicsBox
		GLine progToGraphics = new GLine(midLineStart.getX(),midLineStart.getY(), graphicsBox.getX() +(TEXT_BOX_WIDTH/2), midLineEnd.getY());
		
		//Dialog
		GRect dialogBox = new GRect(midLineEnd.getX() + TEXT_BOX_GAP + (TEXT_BOX_WIDTH/2), midLineEnd.getY(),TEXT_BOX_WIDTH,TEXT_BOX_HEIGHT );
		
		// dialogLabel
		GLabel dialogLabel = new GLabel("DialogProgram");
		dialogLabel.setLocation((dialogBox.getX() + (TEXT_BOX_WIDTH/2)) - (dialogLabel.getWidth()/2), (dialogBox.getY() + (TEXT_BOX_HEIGHT/2)) + (dialogLabel.getAscent()/2) );
		
		// programBox to dialogBox
		GLine progToDialog = new GLine(midLineStart.getX(),midLineStart.getY(), dialogBox.getX() +(TEXT_BOX_WIDTH/2), midLineEnd.getY());
		
		//adding everything to the canvas
		add(midLine);
		add(progLabel);
		add(progBox);
		add(consoleBox);
		add(consoleLabel);
		add(graphicsBox);
		add(graphicsLabel);
		add(progToGraphics);
		add(dialogBox);
		add(dialogLabel);
		add(progToDialog);
		
	}
}

