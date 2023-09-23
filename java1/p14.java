
class a
{
	int a;
	a(int a)
	{
		this.a= a;
	}
	void displayA()
	{
		System.out.println("Value of A: "+ a);
	}
}

class b extends a
{
	int b;
	b(int a,int b)
	{
		super(a);
		this.b =b;
	}
	void displayB()
	{
		System.out.println("Value of B: "+ b);
	}
}

class c extends b
{
	int c;
	c(int a,int b,int c)
	{
		super(a,b);
		this.c=c;	
	}
	void displayC()
	{
		System.out.println("Value of C: "+ c);
	}
}



class demo
{
	public static void main(String[] args)
	{
		c val = new c(10,20,30);

		val.displayB();
		val.displayA();
		val.displayC();
	}
}