import java.util.*;

class MobileNumberException extends Exception
{
	String n;

	MobileNumberException(String name)
	{
		n = name;
	}
	public String toString()
	{
		return "MobileNumberException ["+ n + "]";
	}
}

class demo
{
	static void numberValid(String n) throws MobileNumberException
	{
		if(!n.isEmpty() && n.length() == 10 && Cheknumber(n))
		{

			System.out.println(n);
		}
		else
		{
			throw new MobileNumberException(n);
		}
	}
	static boolean Cheknumber(String n)
	{
		for(int i=0;i<n.length();i++)
		{
			if(n.charAt(i)<'0' || n.charAt(i)>'9')
			{
				return false;
			}
		}
		return true;
	
	}
	public static void main(String[] args)
	{
		String s;
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter Mobile Number: ");
		s= s1.nextLine();
		try
		{
			numberValid(s);
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}




