import java.applet.Applet;
import java.awt.*;

public class P186num18 extends Applet
{
   public void paint (Graphics page)
   {
   		int size = 0;
   		int pos_x = 0;
   		int pos_y = 0;
   		int red = 0;
   		int blue = 0;
   		int green = 0;
   		
   		setBackground (Color.BLACK);
   		
   		for(int x = 0; x < 100; x++)
   		{
   			size = (int)(Math.random()*300+0);
   			pos_x = (int)(Math.random()*300+0);
   			pos_y = (int)(Math.random()*300+0);
   			
   			//while(size < 300 && (pos_x < 300 && pos_y < 300))
   			//{
	   		//	size = (int)(Math.random()*300+0);
	   		//	pos_x = (int)(Math.random()*300+0);
	   		//	pos_y = (int)(Math.random()*300+0);	
   			//}
   			
   			//if(size > 300 && (pos_x > 0 && pos_x < 300 && pos_y > 0 && pos_y < 300))
   			red = (int)(Math.random()*255+0);
			green = (int)(Math.random()*255+0);
			blue = (int)(Math.random()*255+0);
			
			page.setColor(new Color(red,green,blue));
			page.fillOval(pos_x, pos_y,  size, size);
   		} 
   }
}