import javax.swing.*;

public class IndependentProj
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame("Mahjong");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		IndependentProj_Class i = new IndependentProj_Class();
		f.add(i);
		f.setSize(690, 635);
		f.setVisible(true);
		
		System.out.println ("hello");
	}

}
