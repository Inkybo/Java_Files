import java.applet.Applet;
import java.awt.*;

public class P186num17 extends Applet
{
   public void paint (Graphics page)
   {
   	
   		int x_1 = 0;
   		int x_2 = 30;
   		int y_1 = 299;
   		int y_2 = 299;
	   	
	   	for(int x = 0; x < 10; x++)
	   	{
	   		page.setColor (Color.black);
	   		 page.drawLine (x_1-1, y_1, x_2-1, y_2);
	   		 page.drawLine (y_1, x_1, y_2, x_2-2);
	   		 x_1 += 30;
	   		 y_1 -= 30;
	   		 x_2 += 30;
	   		 y_2 -= 30;	
	   	}
   }
}