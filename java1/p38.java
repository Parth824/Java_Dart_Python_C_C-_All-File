import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.awt.*;


/*
<applet code = "p38" width ="800" height = "800">
</applet>
*/

public class p38 extends Applet implements ActionListener
{
	JButton b1,b2;
	String s;

	public void init()
	{
		b1 = new JButton("red");
		b2 = new JButton("yellow");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		s = e.getActionCommand();
		if(s == "red")
		{
			setForeground(Color.red);
		}
		if(s == "yellow")
		{
			setForeground(Color.yellow);
		}
	}
	public void paint(Graphics g)
	{
		g.fillOval(50,50,30,50);
	}
}