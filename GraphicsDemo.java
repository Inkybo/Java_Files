import java.applet.Applet;
import java.awt.*;

public class GraphicsDemo extends Applet
{
	public void paint(Graphics page)
	{
		setBackground(Color.gray);
		
		
		page.setColor(Color.blue);
		page.drawRect(10,50,400,100); // starts at (10,50), length=40, height=100 
		
		
		page.setColor(Color.red);
		page.drawLine(20,20,60,250);  // starts at (20,20), ends at (60,250)	
		
		
		page.setColor(Color.green);
		page.drawOval(50,50,100,200); // upperleft corner: 50,50; width=100, height=200
		
		
		page.setColor(Color.magenta);
		page.drawArc(30,30,100,100,225,90);
			// the bounding rectangle for this arc starts at (30,30),
			// and its length = 100 and its height = 100.
			// the arc begins at angle degree = 225, and it goes for 90 degrees.
		
		
		page.drawString("Quinn", 3, 50);
		
	
		page.setColor(Color.magenta);
		page.fillOval(100,200,175,275);  // notice how fillOval != drawOval
		
		
	}
}