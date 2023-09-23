class A
{
	int a;
	void setA()
	{
		a=10;	
	}	
	void display()
	{
		System.out.println("Value of A:"+ 10);
	}
}

class B extends A
{
	int b;
	void setB()
	{
		b=10;	
	}	
	void display()
	{
		System.out.println("Value of B:"+ 15);
	}
}


class demo
{
	public static void main(String[] args)
	{
		A sup = new B();
		sup.display();
		sup.setA();
	}
}