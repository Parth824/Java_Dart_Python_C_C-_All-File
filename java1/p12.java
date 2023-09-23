class A
{
	void dis()
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	void dis()
	{
		System.out.println("Class B");
	}
}
class C extends A
{
	void dis()
	{
		System.out.println("Class C");	
	}
}


class Main
{
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		C c = new C();
		A s;
		s=a;
		s.dis();
		s=b;
		s.dis();
		s=c;
		s.dis();
	}
}