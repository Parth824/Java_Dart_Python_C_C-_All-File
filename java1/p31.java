import java.awt.*;
import java.applet.Applet;

/*
<applet code = "p31" width= "800" height = "800">
</applet>
*/

public class p31 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		//g.drawString("Parth Dhameliya",150,200);
		//g.drawLine(30,30,30,70);
		//g.drawLine(30,30,70,30);
		//g.drawLine(70,30,70,70);
		//g.drawLine(30,70,70,70);
		//g.drawLine(30,30,70,70);
		//g.drawLine(70,30,30,70);
		//g.drawLine(50,30,50,70);
		//g.drawLine(30,50,70,50);
		//g.fillRect(50,60,200,200);
		//g.drawOval(100,100,200,200);
		//g.setColor(Color.pink);
		//g.fillOval(30,30,100,100);
		//g.setColor(Color.red);
		//g.fillRect(37,56,82,49);
		//g.setColor(Color.pink);
		 
		g.fillArc(150,150,100,100,0,180);
		g.setColor(Color.pink);
		g.fillArc(150,150,100,100,180,180);  
	}
}
