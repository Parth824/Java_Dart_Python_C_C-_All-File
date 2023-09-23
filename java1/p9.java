class A
{
	int a;
	A()
	{
		a=10;
		System.out.println(a);
	}

}
class B extends A
{
	int b;
	B()
	{
		b=20;
		System.out.println(b);
	}
}
class C extends B
{
	int c;
	C()
	{
		c=30;
		System.out.println(c);
	}
}


class Main{

	public static void main(String[] args)
	{
		C c = new C();
	}
}