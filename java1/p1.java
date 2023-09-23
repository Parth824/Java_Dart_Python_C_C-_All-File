import java.util.Scanner;

class A
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Loop legth: ");
		int num = s.nextInt();

		for(int i =num;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("*"+" ");
			}
			System.out.print("\n");
		}		
	}

}