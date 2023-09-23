import java.applet.*;
import java.awt.*;

/*
<applet code = "p53" width = "800" height = "800">
</applet>
*/

public class p53 extends Applet
{
	public void paint(Graphics g)
	{
		int x[]={228,143,143,228,312,312};
		int y[]={165,205,287,327,287,205};
		g.setColor(Color.red);
		g.fillPolygon(x,y,6);
	}	
}