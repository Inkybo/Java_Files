import java.awt.*; 
import java.applet.*; 
import java.net.*; 

public class FinalProject extends Applet 
{ 
	Image my_gif; 
	URL temmie;  
	MediaTracker mt; 
	
	public void init()  
	{ 
		mt = new MediaTracker(this); 
		try
		{ 
			temmie = getDocumentBase(); 
		} 
		catch (Exception e) {} 
		my_gif = getImage(temmie,"temmie.gif"); 
		mt.addImage(my_gif,1);
		try
		{ 
			mt.waitForAll(); 
		} 
		catch (InterruptedException  e) {} 
	} 
	public void paint(Graphics g)  
	{ 
		g.drawImage(my_gif,0,0,this); 
	} 
} 
