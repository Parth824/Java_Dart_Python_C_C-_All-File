interface simpal
{
	void mod1();
	void mod2();
}

interface simpal1
{
	void mod3();
	void mod4();
}

interface all extends simpal,simpal1
{
	//void geting();
}

class my
{
	public void mod1(){
		System.out.println("Mod1");
	}
	public void mod2(){
		System.out.println("Mod2");
	}
	public void mod3(){
		System.out.println("Mod3");
	}
	public void mod4(){
		System.out.println("Mod4");
	}
	/*public void geting()
	{
		System.out.println("Good moring..");
	}*/
}
class demo
{
	public static void main(String[] args)
	{
		my m = new my();
		m.mod1();
		m.mod2();
		m.mod3();
		m.mod4();
		//m.geting();
	}
}