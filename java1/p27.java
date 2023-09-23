class myThread extends Thread
{
	Thread t;
	myThread(String k)
	{
		t = new Thread(k);
		start();
	}
	public void run()
	{
		
		
		if(t.getName().equals("Parth"))
		{	int i = 1;
			while(i<10)
			{
				System.out.println(t.getName()+" :"+i);
				i++;
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{}
			}
		}
		if(t.getName().equals("Om"))
		{
			int j = 10;
			while(j<20)
			{
				System.out.println(t.getName()+" :"+j);
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
	public static void main(String args[])
	{
		myThread k = new myThread("Parth");
		myThread k1 = new myThread("Om");
	}
}