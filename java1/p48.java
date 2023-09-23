class A extends Thread
{
	Thread t1;
	A(String name)
	{
		t1 = new Thread(name);
		start();
	}
	public void run()
	{
		int i =1;
		int j = 11;
		if(t1.getName().equals("Parth"))
		{
			for(i = 1;i<=10;i++)
			{
				System.out.println(t1.getName() + " :"+i);
				try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{}
			}
			
		}
		else
		{
			for(j =11;j<=20;j++)
			{
				System.out.println(t1.getName() + " :"+j);
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
	public static void main(String args[])
	{
		A a1 = new A("Parth");
		A a2 = new A("Om");
	}
}