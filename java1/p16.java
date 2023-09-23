import java.util.Scanner;

class SLL
{
	class node
	{
		int data;
		node next;
		node(int data)
		{
			this.data= data;
			next = null;		
		}
	}
	node temp;
	node first;
	node last;
	node curr;
	int len =1;
	int lo[];
	void create_node()
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter The Value: ");
		int a = s.nextInt();
		temp = new node(a);	
	}
	void create_lineList()
	{
		create_node();
		if(first == null)
		{
			first=last=temp;
		}
		else
		{
			last.next = temp;
			last = temp;
		}
	}
	void delete_last()
	{
		if(first  != null)
		{
			curr = first;
			while(curr.next!= last)
			{
				curr = curr.next;		
			}
			curr.next = null;
			last = curr;
		}
		else
		{
			System.out.println("Node is Empty...");
		}
	}
	void delete_first()
	{
		if(first !=null)
		{
			curr = first.next;
			first.next = null;
			first = curr;
		}
		else
		{
			System.out.println("Node is Empty...");
		}
	}
	void display()
	{
		curr = first;
		while(curr!=null)
		{
			System.out.print("|"+curr.data+"| =>");
			curr = curr.next;
		}
		System.out.println();
	}
	void insert_first()
	{
		create_node();
		temp.next = first;
		first = temp;
	}
	void insert_postion()
	{
		length();
		int k =0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Postion: ");
		int i = s.nextInt();
		if(i == 1)
		{
			insert_first();	
		}
		else if(i<len)
		{
			create_node();
			curr = first;
			k =1;
			while(curr!=null)
			{
				if(i == k)
				{
					break;
				}
				curr = curr.next;
				k++;
			}	
			temp.next = curr;
			curr = first;
			k =1;
			while(curr!=null)
			{
				if(i-1 == k)
				{
					break;
				}
				curr = curr.next;
				k++;
			}
			curr.next = temp;
		}
		else
		{
			System.out.println("INVLIDE POSTION....");
		}			
		
	}

	void length()
	{
		curr = first;
		len = 1;
		while(curr!=null)
		{
			curr = curr.next;
			len++;
		}
	}
	
	void display_rev()
	{
		
		node k = null;
		node m = null;
		curr = first;
		m = last;
		System.out.print("|"+m.data+"| =>");
		while(curr != null)
		{
			k = first;
			while(k != null)
			{
				if(k.next == m)
				{
					System.out.print("|"+k.data+"| =>");
					
					m = k;
					
				}
				
				k = k.next;
			}
			curr = curr.next;
		}
		System.out.println();
	}
	void rev_all()
	{
		length();
		int ii = 1;
		lo = new int [10];
		node k = null;
		node m = null;
		curr = first;
		m = last;
		lo[0] = m.data;
		while(curr != null)
		{
			k = first;
			while(k != null)
			{
				if(k.next == m)
				{
					lo[ii] = k.data;
					m = k;
					ii++;
				}
				
				k = k.next;
			}
			curr = curr.next;
		}
		curr = first;
		int i = 0;
		while(curr != null)
		{
			curr.data = lo[i];
			System.out.print("|"+curr.data+"| =>");
			curr = curr.next;
			i++;
		}
		System.out.println();
	}
}
 

class demo{
	public static void main(String[] args)
	{
		SLL s = new SLL();
		Scanner s1 = new Scanner(System.in);
		int i=1;
		do
		{
			System.out.println("prss 0 Exit");
			System.out.println("prss 1 CreateNode");
			System.out.println("prss 2 Delete_last");
			System.out.println("prss 3 Delete_first");
			System.out.println("prss 4 DisPlay");
			System.out.println("prss 5 Insert_first");
			System.out.println("prss 6 Insert_postion");
			System.out.println("prss 7 Dispaly_rev");
			System.out.println("prss 8 All_rev");
			int a = s1.nextInt();
			switch(a)
			{
				case 0:
					i=0;
					break;
				case 1:
					s.create_lineList();
					break;
				case 2:
					s.delete_last();
					break;
				case 3:
					s.delete_first();
					break;
				case 4:
					s.display();
					break;
				case 5:
					s.insert_first();
					break;
				case 6:
					s.insert_postion();
					break;
				case 7:
					s.display_rev();
					break;
				case 8:
					s.rev_all();
					break;
			}
		}while(i!=0);
	}
}