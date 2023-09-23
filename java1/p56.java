import java.awt.*;
import java.applet.*;

/*
<applet code = "p56" width = "800" height = "800">
</applet>
*/

public class p56 extends Applet
{
	public void paint(Graphics g)
	{
		int a[] ={315,162,468};
		int b[] ={122,430,430};
		g.drawPolygon(a,b,3);
		g.drawOval(228,240,179,186);
	}
}