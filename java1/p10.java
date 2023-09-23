class A
{
	int a;
	int b;
	A(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void displ()
	{
		System.out.println("a: "+a+" "+"b: "+b);
	}
}
class B extends A
{
	int c;
	int d;
	B(int c,int d,int a,int b)
	{	
		super(a,b);
		this.c=c;
		this.d=d;
	}
	void displ()
	{
		super.displ();
		System.out.println(super.a + " " + super.b);
		System.out.println("c: "+c+" "+"d: "+d);
	}

}


class Main
{
	public static void main(String[] args)
	{
		B b=new B(30,40,10,20);
		b.displ();
	}
}