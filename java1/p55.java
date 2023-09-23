import java.awt.*;
import java.applet.*;

/*
<applet code ="p55" width = 800 height = 800>
</applet>
*/

public class p55 extends Applet
{
	String name = "Parth";
	int i = 20;
	public void init()
	{
		Font f = new Font(name,Font.BOLD,20);
		setFont(f);	
	}
	public void paint(Graphics g)
	{
		if(i>=800)
		{
			i = 0;
		}
		g.drawString(name,20+i,50);
		i = i+20;
		try{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
		repaint();
	}
}