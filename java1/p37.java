import java.awt.*;
import java.applet.*;

/*
<applet code ="p37" width = "800" height = "800">
</applet>
*/

public class p37 extends Applet
{

	Image p;
	public void init()
	{
		p =getImage(getCodeBase(),"jupiter.png");
	}
	public void paint(Graphics g)
	{
		g.drawString(getCodeBase().toString(),20,20);
		g.drawString(getDocumentBase().toString(),20,40);
		g.drawImage(p,50,50,this);
	}
}