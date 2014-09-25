/**
 * GPenART.java
 * @author sn0w
 * 09/23/2014
 * Draws a Image using only the GPen
 */

//

//Imports for the program.
import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class GPenART extends GraphicsProgram 
{
	public void run()
	{
		//Variabiles for the program
		int startX = 0;
		int startY = 0;
		int windowX = 1336;
		int windowY = 768;
		int flagSep = 70;
		int starBox = 450;
		
		//Sets the size of the window for the program
		 setSize(windowX, windowY);
				
		//Creates the Pen at location 0, 0 and addes to the canvas.
		GPen pen = new GPen();
		add(pen);
		pen.setLocation(startX, startY);
		pen.showPen();
		
		//Start drawing the edges/layout of the flag
		pen.drawLine(startX, windowY);
		pen.drawLine(windowX, startY);
		pen.drawLine(startX, -windowY);
		pen.drawLine(-windowX, startY);
		
		//Strip #1
		pen.setFillColor(Color.RED);
		pen.startFilledRegion();
		pen.setLocation(startX, windowY);
		pen.drawLine(startX, -(flagSep));
		pen.drawLine(windowX, startY);
		pen.drawLine(startX, flagSep);
		pen.endFilledRegion();
		
		//Strip #2
		pen.setFillColor(Color.RED);
		pen.startFilledRegion();
		pen.setLocation(startX, (windowY-flagSep*2));
		pen.drawLine(startX, -(flagSep));
		pen.drawLine(windowX, startY);
		pen.drawLine(startX, flagSep);
		pen.endFilledRegion();
		
		//Strip #3
		pen.setFillColor(Color.RED);
		pen.startFilledRegion();
		pen.setLocation(startX, (windowY-flagSep*4));
		pen.drawLine(startX, -(flagSep));
		pen.drawLine(windowX, startY);
		pen.drawLine(startX, flagSep);
		pen.endFilledRegion();
		
		//Strip #4
		pen.setFillColor(Color.RED);
		pen.startFilledRegion();
		pen.setLocation(startX+starBox, (windowY-flagSep*6));
		pen.drawLine(startX, -(flagSep));
		pen.drawLine(windowX-starBox, startY);
		pen.drawLine(startX, flagSep);
		pen.endFilledRegion();
		
		//Strip #5
		pen.setFillColor(Color.RED);
		pen.startFilledRegion();
		pen.setLocation(startX+starBox, (windowY-flagSep*8));
		pen.drawLine(startX, -(flagSep));
		pen.drawLine(windowX-starBox, startY);
		pen.drawLine(startX, flagSep);
		pen.endFilledRegion();
		
		//Strip #6
		pen.setFillColor(Color.RED);
		pen.startFilledRegion();
		pen.setLocation(startX+starBox, (windowY-flagSep*10));
		pen.drawLine(startX, -(flagSep));
		pen.drawLine(windowX-starBox, startY);
		pen.drawLine(startX, flagSep);
		pen.endFilledRegion();
		
		//StarBox
		pen.setFillColor(Color.BLUE);
		pen.startFilledRegion();
		pen.setLocation(startX, startY);
		pen.drawLine(startX, 348);
		pen.drawLine(starBox, startY);
		pen.drawLine(startX, -348);
		pen.endFilledRegion();
		
		//Tri #1 (BASE RIGHT)
		pen.setFillColor(Color.WHITE);
		pen.startFilledRegion();
		pen.setLocation(350, 275);
		pen.drawLine(-50, -80);
		pen.drawLine(-45, 42);
		pen.endFilledRegion();
		
		//Tri #2 (BASE LEFT)
		pen.setFillColor(Color.WHITE);
		pen.startFilledRegion();
		pen.setLocation(195, 230);
		pen.drawLine(-50, -40);
		pen.drawLine(-80, 90);
		pen.endFilledRegion();

		//Tri #3 (BASE MIDDLE)
		pen.setFillColor(Color.WHITE);
		pen.startFilledRegion();
		pen.setLocation(100, 150);
		pen.drawLine(250, 0);
		pen.drawLine(-125, 115);
		pen.endFilledRegion();
		
		//Tri #4 (BASE TOP)
		pen.setFillColor(Color.WHITE);
		pen.startFilledRegion();
		pen.setLocation(185, 150);
		pen.drawLine(35, -100);
		pen.drawLine(35, 100);
		pen.endFilledRegion();
		
		//Hides the Pen after drawing
		pen.hidePen();
		
	}

}
