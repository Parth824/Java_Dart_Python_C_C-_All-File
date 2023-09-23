import java.awt.*;
import java.applet.*;

/*
<applet code="p51" width = "800", height = "800">
</applet>
*/

public class p51 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		//g.drawString("My Name is Parth",100,100);
		//g.fillRect(100,100,150,100);
		//g.fillRect(30,30,132,132);
		//g.setColor(Color.pink);
		//g.fillOval(30,30,132,132);
		g.drawLine(130,30,30,130);
		g.drawRect(30,30,100,100);
		g.drawLine(30,30,130,130);
		
	}
}
