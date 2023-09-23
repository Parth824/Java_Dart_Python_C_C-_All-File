import java.awt.*;
import java.applet.*;

/*
<applet code = "p54" width = "800" height = "800">
</applet>
*/

public class p54 extends Applet
{
	String name = "Parth";
	char c;
	public void init()
	{
		Font f = new Font(name,Font.BOLD,25);
		setFont(f);
	}
	public void paint(Graphics g)
	{
		g.drawString(name,20,20);
		c = name.charAt(0);
		name = name.substring(1);
		name = name + c;
		try{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
		repaint();
	}
}