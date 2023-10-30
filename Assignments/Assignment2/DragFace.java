/*
 * File: DragFace.java
 * -------------------
 * This program creates a GFace object and allows the user to drag
 * it around the canvas.
 */
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
public class DragFace extends GraphicsProgram {

private static final double FACE_WIDTH = 200;

private static final double FACE_HEIGHT = 300;

public void run() {
GFace face = new GFace(FACE_WIDTH, FACE_HEIGHT);
double x = (getWidth() - FACE_WIDTH) / 2;
double y = (getHeight() - FACE_HEIGHT) / 2;
add(face, x, y);
addMouseListeners();
}

public void mousePressed(MouseEvent e) {
lastX = e.getX();
lastY = e.getY();
gobj = getElementAt(lastX, lastY);
}

public void mouseDragged(MouseEvent e) {
if (gobj != null) {
gobj.move(e.getX() - lastX, e.getY() - lastY);
lastX = e.getX();
lastY = e.getY();
}
}

public void mouseClicked(MouseEvent e) {
if (gobj != null) gobj.sendToFront();
}

private GObject gobj; 
private double lastX; 
private double lastY; 
}
