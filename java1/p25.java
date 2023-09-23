class a extends Thread
{
	Thread s1;
	a(String s)
	{
		s1 = new Thread(s);
		start();
	}
	public void run()
	{
		int i = 0;
		int j =10;
		if(s1.getName().equals("Parth"))
		{
			while(i<10)
			{
				System.out.println(s1.getName()+" "+i);
				i++;
				try
				{
					Thread.sleep(1000);
				}	
				catch(Exception e)
				{
				}
				}
		}
		if(s1.getName().equals("Om"))
		{
			while(j<20)
			{
				System.out.println(s1.getName()+" " +j);
				j++;
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{}
			}
		}
	}
}

class demo
{
	public static void main(String agrs[])
	{
		a t = new a("Parth");
		a t1 = new a("Om");	
	}
	
}