import java.awt.*;
import java.applet.*;

/*
<applet code = "p35" width = "800" height = "800">
</applet>
	
*/

public class p35 extends Applet
{
	String name = "Parth";
	public void init()
	{
		Font a = new Font(name,Font.BOLD,20);
		setFont(a);
	}
	public void paint(Graphics g)
	{
		int[] a ={133,73,73,133,191,192};
		int[] b={40,73,134,167,134,73};
		g.setColor(Color.blue);
		g.fillPolygon(a,b,6);
	}
}