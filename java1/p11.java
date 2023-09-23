abstract class A
{
	public abstract void display();
	A()
	{
		System.out.println("Komal");	
	}
	void pp()
	{
		System.out.println("om");
	}
}

class B extends A
{
	public void display()
	{
		System.out.println("Parth");
	}
}

class Main
{
	public static void main(String[] args)
	{
		B b = new B();
		b.display();
		b.pp();
	}
}