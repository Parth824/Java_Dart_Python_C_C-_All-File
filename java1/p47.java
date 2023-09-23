import java.util.Scanner;

class demo
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		String name[] = new String[5];

		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Name: ");
			name[i] = s1.nextLine();
		}
		System.out.println("Name start with 'j'...");
		for(int i=0;i<5;i++)
		{
			if(name[i].startsWith("j"))
			{
				System.out.println(name[i]);
				try{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{}
			}
		}
	}
}	