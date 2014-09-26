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
		//Variables for the program
		int startX = 0;
		int startY = 0;
		int windowX = 1336;
		int windowY = 768;
		int flagSep = 70;
		int starBox = 450;
		
		//Sets the size of the window for the program
		 setSize(windowX, windowY);
		 
		 
		//THIS IS Terrible coding but wanted it to flash haha
		while(true)
		{
			
			//Color Randomizer to make it flash using the math.random class as the Random generator fails to work
			int RED = (int) (Math.random( )*256);
			int GREEN = (int)(Math.random( )*256);
			int BLUE= (int)(Math.random( )*256);
			
			//Makes new color
			Color rand = new Color(RED,GREEN,BLUE);
				
				
			//Creates the Pen at location 0, 0 and adds to the canvas.
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
			pen.setFillColor(rand);
			pen.startFilledRegion();
			pen.setLocation(startX, windowY);
			pen.drawLine(startX, -(flagSep));
			pen.drawLine(windowX, startY);
			pen.drawLine(startX, flagSep);
			pen.endFilledRegion();
			
			//Strip #2
			pen.setFillColor(rand);
			pen.startFilledRegion();
			pen.setLocation(startX, (windowY-flagSep*2));
			pen.drawLine(startX, -(flagSep));
			pen.drawLine(windowX, startY);
			pen.drawLine(startX, flagSep);
			pen.endFilledRegion();
			
			//Strip #3
			pen.setFillColor(rand);
			pen.startFilledRegion();
			pen.setLocation(startX, (windowY-flagSep*4));
			pen.drawLine(startX, -(flagSep));
			pen.drawLine(windowX, startY);
			pen.drawLine(startX, flagSep);
			pen.endFilledRegion();
			
			//Strip #4
			pen.setFillColor(rand);
			pen.startFilledRegion();
			pen.setLocation(startX+starBox, (windowY-flagSep*6));
			pen.drawLine(startX, -(flagSep));
			pen.drawLine(windowX-starBox, startY);
			pen.drawLine(startX, flagSep);
			pen.endFilledRegion();
			
			//Strip #5
			pen.setFillColor(rand);
			pen.startFilledRegion();
			pen.setLocation(startX+starBox, (windowY-flagSep*8));
			pen.drawLine(startX, -(flagSep));
			pen.drawLine(windowX-starBox, startY);
			pen.drawLine(startX, flagSep);
			pen.endFilledRegion();
			
			//Strip #6
			pen.setFillColor(rand);
			pen.startFilledRegion();
			pen.setLocation(startX+starBox, (windowY-flagSep*10));
			pen.drawLine(startX, -(flagSep));
			pen.drawLine(windowX-starBox, startY);
			pen.drawLine(startX, flagSep);
			pen.endFilledRegion();
			
			//StarBox
			pen.setFillColor(rand);
			pen.startFilledRegion();
			pen.setLocation(startX, startY);
			pen.drawLine(startX, 348);
			pen.drawLine(starBox, startY);
			pen.drawLine(startX, -348);
			pen.endFilledRegion();
			
			//Cross Design #1 (Middle section going vertical)
			pen.setFillColor(rand);
			pen.setColor(Color.WHITE);
			pen.startFilledRegion();
			pen.setLocation(175, 50);
			pen.drawLine(80, 0);
			pen.drawLine(0, 250);
			pen.drawLine(-80, 0);
			pen.endFilledRegion();
			
			//Cross Design #2 (Middle section going horizontal)
			pen.setFillColor(rand);
			pen.setColor(Color.WHITE);
			pen.startFilledRegion();
			pen.setLocation(75, 137.5);
			pen.drawLine(0, 75);
			pen.drawLine(275, 0);
			pen.drawLine(0, -75);
			pen.endFilledRegion();
			
			//Hides the Pen after drawing
			pen.hidePen();
		}
		
	}

}
