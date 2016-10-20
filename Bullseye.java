//********************************************************************
//  Bullseye.java       Author: Lewis/Loftus/Cocking
//  
//  Demonstrates the use of conditionals and loops to guide drawing.
//********************************************************************

import java.applet.Applet;
import java.awt.*;

public class Bullseye extends Applet
{
   //-----------------------------------------------------------------
   //  Paints a bullseye target.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {
      
      int x = 0, y = 0, diameter;

      setBackground (Color.cyan);

      diameter = 300;
      page.setColor (Color.white);

      for (int count = 0; count < 5; count++)
      {
         if (page.getColor() == Color.black)  // alternate colors
            page.setColor (Color.white);
         else
            page.setColor (Color.black);

         page.fillOval (x, y, diameter, diameter);

         diameter -= (2 * 25);
         x += 25;
         y += 25;
      }

      // Draw the red bullseye in the center
      page.setColor (Color.red);
      page.fillOval (x, y, diameter, diameter);
   }
}
