import java.awt.*;
import java.applet.Applet;
/*
<applet code = "p32" width = "800" height= "800">
</applet>
*/
public class p32 extends Applet
{
	String name = "Parth";
	char n ;
	public void paint(Graphics g)
	{
		g.drawString(name,10,10);
		n = name.charAt(0);
		name = name.substring(1);
		name+=n;
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
		repaint();
	}	
}