import java.util.Scanner;

class NumberException extends Exception
{
	String num;
	
	NumberException(String number)
	{
		num = number;
	}

	public String toString()
	{
		return "NumberException[ "+ num +" ]";
	}
}

class demo
{
	static void CheckNumber(String num) throws NumberException
	{
		if(num.length() == 10 && !num.isEmpty() && ChekDigin(num))
		{
			System.out.println(num);
		}
		else
		{
			throw new NumberException(num);
		}
	}

	static boolean ChekDigin(String num)
	{
		for(int i = 0;i<num.length();i++)
		{
			if(num.charAt(i) < '0
' || num.charAt(i)>'9')
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		try
		{
			Scanner s1 = new Scanner(System.in);
			System.out.print("Enter The MobileNumber: ");
			String num = s1.nextLine();
			CheckNumber(num);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}