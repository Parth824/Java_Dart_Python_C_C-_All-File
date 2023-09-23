class a
{
	static int sum(int ...arr)
	{
		int r =0;
		for(int i: arr)
		{
			r=r+i;
		}
		return r;
	}
	public static void main(String[] agrs)
	{
		System.out.println("The sum of 5 and 6 is: "+sum(5,6));
		System.out.println("The sum of 8,9,5 and 6 is: "+sum(8,9,5,6));	
	}
}