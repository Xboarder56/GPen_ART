/**
 * GPenART.java
 * @author sn0w
 * 09/23/2014
 * Draws a Image using only the GPen
 */

//

//Imports for the program.
import acm.graphics.GPen;
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
		int flagsep = 70;
		
		 setSize(windowX, windowY);
				
		//Creates the Pen at location 25, 25 and addes to the canvas.
		GPen pen = new GPen();
		add(pen);
		pen.setLocation(startX, startY);
		pen.showPen();
		
		//Start drawing the edges/layout of the flag
		pen.drawLine(0, 768);
		pen.drawLine(1336, 0);
		pen.drawLine(0, -768);
		pen.drawLine(-1336, 0);
		
		//Strip #1
		pen.setLocation(startX, (windowY-flagsep));
		pen.drawLine(windowX, 0);
		
		//Strip #2
		pen.setLocation(startX, (windowY-(flagsep*2)));
		pen.drawLine(windowX, 0);
		
		//Strip #3
		pen.setLocation(startX, (windowY-(flagsep*3)));
		pen.drawLine(windowX, 0);
		
		//Strip #4
		pen.setLocation(startX, (windowY-(flagsep*4)));
		pen.drawLine(windowX, 0);
		
		//Strip #5
		pen.setLocation(startX, (windowY-(flagsep*5)));
		pen.drawLine(windowX, 0);
		
		//Strip #6
		pen.setLocation(startX, (windowY-(flagsep*6)));
		pen.drawLine(windowX, 0);
		
		//Strip #7
		pen.setLocation(startX+450, (windowY-(flagsep*7)));
		pen.drawLine(windowX, 0);
		
		//Strip #8
		pen.setLocation(startX+450, (windowY-(flagsep*8)));
		pen.drawLine(windowX, 0);
		
		//Strip #9
		pen.setLocation(startX+450, (windowY-(flagsep*9)));
		pen.drawLine(windowX, 0);
		
		//Strip #10
		pen.setLocation(startX+450, (windowY-(flagsep*10)));
		pen.drawLine(windowX, 0);
		
		//Strip #11
		pen.setLocation(startX+450, (windowY-(flagsep*11)));
		pen.drawLine(windowX, 0);
		
		//StarBox
		pen.setLocation(startX+450, startY);
		pen.drawLine(startX, 348);
		
		
		
		
		
		
		System.out.println(windowY-(flagsep*6));		
		
		//pen.hidePen();
		
	}

}
