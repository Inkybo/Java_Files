import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class IndependentProj_Class extends JPanel
{
	int last_x = 0;
	int last_y = 0;
	boolean mouse_click = false;
	
	System.out.println("hello");
	
	
	
	public void paintComponent(Graphics g) 
		{
			super.paintComponent(g);

			this.setBackground(Color.WHITE);
			
				int red = 0;
				int green = 0;
				int blue = 0;
			
//GENERATES FIRST ROW OF BOARD/////////////////////////////////////////
			for(int x = 0; x < 520; x+=40)
			{
				red = (int)(Math.random()*255+0);
				green = (int)(Math.random()*255+0);
				blue = (int)(Math.random()*255+0);
				
				g.setColor(new Color(red,green,blue));
				g.fill3DRect( 65+x, 25, 40, 70, true);
			}
//GENERATES SECOND ROW OF BOARD/////////////////////////////////////////
			for(int y = 0;y < 340;y+=40)
			{
				red = (int)(Math.random()*255+0);
				green = (int)(Math.random()*255+0);
				blue = (int)(Math.random()*255+0);
				
				g.setColor(new Color(red,green,blue));
				g.fill3DRect(145+y, 95, 40, 70, true);	
			}
//GENERATES THIRD ROW OF BOARD/////////////////////////////////////////
			for(int y = 0;y < 440;y+=40)
			{
				red = (int)(Math.random()*255+0);
				green = (int)(Math.random()*255+0);
				blue = (int)(Math.random()*255+0);
				
				g.setColor(new Color(red,green,blue));
				g.fill3DRect(105+y, 165, 40, 70, true);	
			}
//GENERATES FORTH ROW OF BOARD/////////////////////////////////////////
			for(int y = 0;y < 520;y+=40)
			{
				red = (int)(Math.random()*255+0);
				green = (int)(Math.random()*255+0);
				blue = (int)(Math.random()*255+0);
				
				g.setColor(new Color(red,green,blue));
				g.fill3DRect(65+y, 235, 40, 70, true);	
			}
//GENERATES FIFTH ROW OF BOARD/////////////////////////////////////////
			for(int y = 0;y < 520;y+=40)
			{
				red = (int)(Math.random()*255+0);
				green = (int)(Math.random()*255+0);
				blue = (int)(Math.random()*255+0);
				
				g.setColor(new Color(red,green,blue));
				g.fill3DRect(65+y, 305, 40, 70, true);	
			}
//GENERATES SIXTH ROW OF BOARD/////////////////////////////////////////
			for(int y = 0;y < 440;y+=40)
			{
				red = (int)(Math.random()*255+0);
				green = (int)(Math.random()*255+0);
				blue = (int)(Math.random()*255+0);
				
				g.setColor(new Color(red,green,blue));
				g.fill3DRect(105+y, 375, 40, 70, true);	
			}
//GENERATES SEVENTH ROW OF BOARD/////////////////////////////////////////
			for(int y = 0;y < 340;y+=40)
			{
				red = (int)(Math.random()*255+0);
				green = (int)(Math.random()*255+0);
				blue = (int)(Math.random()*255+0);
				
				g.setColor(new Color(red,green,blue));
				g.fill3DRect(145+y, 445, 40, 70, true);	
			}
//GENERATES EIGHTH ROW OF BOARD/////////////////////////////////////////
			for(int y = 0;y < 520;y+=40)
			{
				red = (int)(Math.random()*255+0);
				green = (int)(Math.random()*255+0);
				blue = (int)(Math.random()*255+0);
				
				g.setColor(new Color(red,green,blue));
				g.fill3DRect(65+y, 515, 40, 70, true);	
			}
//GENERATES MIDDLEMOST RIGHT 2 BLOCKS OF BOARD/////////////////////////////////////////
			for(int y = 0;y < 65;y+=40)
			{
				red = (int)(Math.random()*255+0);
				green = (int)(Math.random()*255+0);
				blue = (int)(Math.random()*255+0);
				
				g.setColor(new Color(red,green,blue));
				g.fill3DRect(585+y, 270, 40, 70, true);	
			}
//GENERATES MIDDLEMOST LEFT BLOCK OF BOARD/////////////////////////////////////////
			for(int y = 0;y < 40;y+=40)
			{
				red = (int)(Math.random()*255+0);
				green = (int)(Math.random()*255+0);
				blue = (int)(Math.random()*255+0);
				
				g.setColor(new Color(red,green,blue));
				g.fill3DRect(25+y, 270, 40, 70, true);	
			}
//LENGTH TEMPLATE////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////
			
			//g.setColor(Color.BLACK);
			//g.fillRect(265, 25, 40, 70);
			
			//g.setColor(Color.BLUE);
			//g.fillRect(265, 95, 40, 70);
			
			//g.setColor(Color.BLACK);
			//g.fillRect(265, 165, 40, 70);
			
			//g.setColor(Color.BLUE);
			//g.fillRect(265, 235, 40, 70);
			
			//g.setColor(Color.BLACK);
			//g.fillRect(265, 305, 40, 70);
			
			//g.setColor(Color.BLUE);
			//g.fillRect(265, 375, 40, 70);
			
			//g.setColor(Color.BLACK);
			//g.fillRect(265, 445, 40, 70);
			
			//g.setColor(Color.BLUE);
			//g.fillRect(265, 515, 40, 70);
				
			
		}
		
	//private class MouseListener extends MouseAdapter 
	//{
	//    public void mouseClicked(MouseEvent e) 
	//    {
	//        // Finds the location of the mouse
	//        PointerInfo a = MouseInfo.getPointerInfo();
	//        Point b = a.getLocation();
	//
	//        // Gets the x -> and y co-ordinates
	//        int x = (int) b.getX();
	//        int y = (int) b.getY();
	//        System.out.println("Mouse x: " + x);
	//        System.out.println("Mouse y: " + y);
    //	  }
	//}
		
	public static void main(String[] args)
		{
			JFrame f = new JFrame("Mahjong");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			IndependentProj_Class i = new IndependentProj_Class();
			f.add(i);
			f.setSize(690, 635);
			f.setVisible(true);
		}
	//public void mousePressed(MouseEvent e)
	//{
	//	last_x = g.x - e.getX();
	//	last_y = g.y - e.getY();
	//	
	//	if(g.contains(e.getX(), e.getY()))
	//	{
	//		mouse_click = true;
	//		updateLocation(e);	
	//	}
	//	else
	//	{
	//		mouse_click = false;	
	//	}
	//	
	//	if(mouse_click == true)
	//	{
	//		System.out.println ("hello");
	//	}
	//}	
}