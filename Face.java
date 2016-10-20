import java.applet.Applet;
import java.awt.*;

public class Face extends Applet
{
   public void paint (Graphics page)
   {
   	
   	// page.filloval(50, 30,  180, 180); ------------ CIRCLE
   	//               |    |    |    |
   	// page.drawArc (90, 150, 100, 40, 180, 180); --- ARC  
   	//               |    |    |    |   |    |
   	//               x    y  width  |   |    |
   	//                              |   |    |
   	//                           height |    |
   	//                                  |    |
   	//                          startAngle   |
   	//                                       |
   	//                                arcAngle   
   	
   	setBackground (Color.cyan); // background
   	
   	page.setColor (Color.gray);
   	page.fillOval (50, 30, 180, 180);  // face
   	
   	page.setColor (Color.white);
   	page.fillOval (90, 90, 30, 30);  // left eye
   	page.fillOval (160, 90, 30, 30); // right eye
   	
   	page.setColor (Color.blue);
   	page.fillOval (95, 100, 10, 10);  // left pupil
   	page.fillOval (165, 100, 10, 10); // right pupil
   	
   	page.setColor (Color.black);
   	page.drawArc (90, 150, 100, 40, 180, 180); // mouth
   	
   	page.setColor (Color.black);
   	page.drawArc (125, 130, 10, 10, 90, 180); // nose
   	page.drawArc (123, 80, 15, 50, 270, 90); // nose
   	
   	page.setColor (Color.gray);
   	page.fillOval (30, 60, 50, 50);  // ear left
   	page.fillOval (200, 60, 50, 50);  // ear right
   }
}   