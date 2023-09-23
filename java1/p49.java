class A implements Runnable
{
	
	public void run()
	{
		if(Thread.currentThread().getName().equals("Thread-0"))
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName() + " :"+i);
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
			for(int i=11;i<=20;i++)
			{
				System.out.println(Thread.currentThread().getName() + " :"+i);
				try
				{
					Thread.sleep(1100);
				}
				catch(Exception e)
				{}
			}
		}
	}

}


class demo
{
	public static void main(String[] args)
	{
		A a1 = new A();
		Thread t1 = new Thread(a1);
		t1.start();
		A a2 = new A();
		Thread t2 = new Thread(a2);
		t2.start();
	}
}