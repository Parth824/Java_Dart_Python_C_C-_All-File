
class myThread implements Runnable
{
	public void run()
	{
		int i=0;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}	
	}
}
class myThread2 implements Runnable
{
	public void run()
	{
		int i=11;
		while(i<=20)
		{
			System.out.println(i);
			i++;
		}	
	}
}

class demo
{
	public static void main(String args[])
	{
		myThread t1 = new myThread();
		Thread k = new Thread(t1);
		myThread2 t2 = new myThread2();
		Thread k1 = new Thread(t2);

		k.start();
		k1.start();
	}
}