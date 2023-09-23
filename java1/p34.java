import java.awt.*;
import java.applet.*;


/*
<applet code = "p34" width = "800" height = "800">
<param name = "EMP_Name" value = Parth>
<param name = "EMP_Id" value = 1>
<param name = "EMP_Salary" value = 20000>
<param name = "EMP_City" value = Suart>
</applet>
*/

public class p34 extends Applet
{
	String name,ctiy;
	int id,salary;

	public void start()
	{
		name = getParameter("EMP_Name");
		id = Integer.parseInt(getParameter("EMP_id"));
		salary = Integer.parseInt(getParameter("EMP_Salary"));
		ctiy = getParameter("EMP_City");
	}
	

	public void paint(Graphics g)
	{
		g.drawString("name: "+name+"Id: "+id+"Salary: "+salary+"city: "+ctiy,50,50);
	}
}