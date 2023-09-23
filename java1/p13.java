class demo
{

	static int sum(int ...arr)
	{
		
		int result=0;
		for(int i =0;arr[i]!='\0';i++)
		{
			result += arr[i];
		}
		return result;
	}		

	public static void main(String args[])
	{
		System.out.println("Parth Dhameliya");
		System.out.print("Sum of :" + sum(10,20,30));
	}
}