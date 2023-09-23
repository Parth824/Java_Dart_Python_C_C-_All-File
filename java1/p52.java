

import java.applet.*;
import java.awt.*;

/*
<applet code= "p52" width= "800" height = "800">
</applet>
*/

public class p52 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		//g.drawLine(50,50,100,100);
		//g.fillOval(50,50,100,100);
		//g.fillRect(50,50,100,100);
		g.fillArc(30,30,100,100,90,-180);
		g.setColor(Color.pink);
		g.fillArc(30,30,100,100,90,180);
	}
}