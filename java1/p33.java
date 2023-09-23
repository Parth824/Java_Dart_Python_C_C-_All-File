import java.awt.*;
import java.applet.*;
/*
<applet code ="p33" width = "800" height= "800" >
</applet>
*/
public class p33 extends Applet
{
	int n =0;
	String name = "Parth";
	public void init()
	{
		Font f = new Font(name,Font.BOLD,20);
		setFont(f); 
	}
	public void paint(Graphics g)
	{
		if(n>=900)
		{
			n = 0;
		}
		g.drawString(name,800-n,30);
		n = n+30;
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{}
		repaint();	
	}	
}