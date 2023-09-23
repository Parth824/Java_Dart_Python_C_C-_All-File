abstract class pert
{
	void base(){
		System.out.println("Welcome to My base class..");
	} 
	abstract void greting();	
}
class chile1 extends pert
{
	@Override
	void greting()
	{
		System.out.println("Good moring..");
	}
}

class demo 
{
	public static void main(String[] args)
	{
		chile1 c = new chile1();
		c.greting();
		c.base();
	}
}