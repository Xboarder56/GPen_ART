/**
 * Gpen.java
 * @author sn0w
 * 09/23/2014
 * Draws a Image using only the Gpen
 */

//

//Imports for the program.
import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class GPen extends GraphicsProgram 
{
	public void run()
	{
		//Creates the Pen at location 25, 25 and addes to the canvas.
		GPen pen = new GPen();
		add(pen);
		pen.setLocation(25, 25);
		pen.showPen();
		
		//Start the drawing
		pen.drawLine(50, 50);
		
	}

}
