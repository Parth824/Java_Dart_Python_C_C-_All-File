class LeveNotDo extends Exception
{
	
}

class worksprojects extends Exception
{
	worksprojects(Exception cause)
	{
		super(cause);
	}
}

class projectnotcompilet extends Exception
{
	projectnotcompilet(Exception cause)
	{
		super(cause);
	}	
}

class demo
{
	public static void main(String args[])
	{
		try
		{
			LeveNotDo a1 = new LeveNotDo();
			worksprojects a2 = new worksprojects(a1);
			projectnotcompilet a3 = new projectnotcompilet(a2);
			throw a3;
		}
		catch(Exception e)
		{
			System.out.println("caugth: "+ e);
			System.out.println("Actual Cause: "+ e.getCause());
		}
	}
}