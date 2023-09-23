import java.util.*;
class demo
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String[] name = new String[5];
		int i;
		for(i=0;i<5;i++)
		{
			System.out.print("Enter the Name("+(i+1)+"): ");
			name[i] = s.nextLine();
		}		
		System.out.println("Who Name Is start in P: ");
		for(i=0;i<5;i++)
		{
			if(name[i].startsWith("P"))
			{
				System.out.println("Name: "+name[i]);
			}
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{}
		}
	}
}