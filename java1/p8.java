final class A
{
	final int a;
	A()
	{
		a=10;
	}
	final void disp()
	{
		System.out.println(a);
	}
}
//final class not extends
//class B extends A
//{
	//final int b;
	//B()
	//{
	//	b =15;
	//}
	//overridden method is final
	//void disp()
	//{
	//	System.out.println(b);
	//}	
//}

class Main{
	public static void main(String[] args)
	{
		A obj = new A();
		obj.disp();
	}
}