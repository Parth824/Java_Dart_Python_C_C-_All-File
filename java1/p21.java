class fu1 extends Thread
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
class fu2 extends Thread
{
	public void run()
	{
		int i=10;
		while(i<=20)
		{
			System.out.println(i);
			i++;
		}	
	}
}

class demo
{
	public static void main(String[] args)
	{
		fu1 f1 = new fu1();
		fu2 f2 = new fu2();
		f1.start();
		f2.start();
	}
}