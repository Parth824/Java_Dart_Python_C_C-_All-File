class A
{
	int id;
	String name;
	int qut;
	int price;
	static int totle_amount;

	A(int id ,String name,int qut,int price)
	{
		this.id = id;
		this.name = name;
		this.qut=qut;
		this.price = price;
		totle_amount = totle_amount+( price * qut);
	}
	void heder()
	{
		System.out.println("===========================================");
		System.out.println("ID\tname\tqut\tprice\tTotleAmount");
		System.out.println("===========================================");
	}
	void display()
	{
		System.out.println(id + "\t"+name+ "\t"+qut+ "\t"+price+"\t"+(qut*price));
	}
	static void TotlePrice()
	{
		System.out.println();
		System.out.print("TotleBile:");
		System.out.print("\t"+ "\t"+ "\t"+totle_amount);
	}
}

class demo
{
	public static void main(String args[])
	{
		A a1 = new A(1,"Super",2,100);
		a1.heder();
		a1.display();
		A a2 = new A(2,"Super",5,200);
		a2.display();
		A a3 = new A(3,"Super",1,300);
		a3.display();
		a3.TotlePrice();
	}
}