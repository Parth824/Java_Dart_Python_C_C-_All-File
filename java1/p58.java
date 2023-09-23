import java.awt.*;
import java.applet.*;

/*
<applet code ="p58" width = "800" height= "800">
</applet>
*/

public class p58 extends Applet
{
	Image i;
	public void init()
	{
		i = getImage(getCodeBase(),"jupiter.png");
	}
	public void paint(Graphics g)
	{
		g.drawImage(i,50,50,this);
	}
}