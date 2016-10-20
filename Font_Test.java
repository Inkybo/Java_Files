import java.applet.Applet;
import java.awt.*;
import java.awt.Font;

public class Font_Test extends Applet
{
	public void paint (Graphics page)
	{
		Font myFont = new Font("Dingbat", Font.BOLD, 18);
		page.setFont(myFont);
		page.drawString("ÿ", 50, 50);
	}
}

