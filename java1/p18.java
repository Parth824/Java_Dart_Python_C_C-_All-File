interface pain
{
	int b =55;
	void drwswcr(int a);
	void drwcircl();
	default void phone(){
		System.out.println("Callinng...");
	}
}
interface pain1
{
	default void getting()
	{
		System.out.println("Good moring...");
	}
}


class b 
{
	void display()
	{
		System.out.println("I am Class B");
	}
}
class a extends b implements pain,pain1
{
	public void drwswcr(int a)
	{
		System.out.println("Value of a: "+a);
	}
	public void drwcircl()
	{
		System.out.println("PAint pcitce..");
	}
	
}

class demo
{
	public static void main(String agrs[])
	{
		a k = new a();
		k.drwswcr(10);
		k.display();
		k.phone();

		System.out.println(k.b);
	}
}