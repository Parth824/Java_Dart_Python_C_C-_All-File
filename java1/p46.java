import java.util.*;

class demo
{
	public static void main(String[] args)
	{

		while(true)
		{
			try
			{
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}
			catch(Exception e){}
			System.out.println(new Date().toString().substring(11,19));
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{}
		}		
	}
}