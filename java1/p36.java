import java.awt.*;
import java.applet.*;
import java.util.*;

/*
<applet code="p36" width = "800" height = "800">

</applet>
*/

public class p36 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString(new Date().toString().substring(11,19),50,50);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		repaint();
	}
}