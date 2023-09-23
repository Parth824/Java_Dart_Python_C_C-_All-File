import java.util.Scanner;

class student
{
	String name;
	int ic,maths,c;
	int total;
	double per;

	
	student(String name,int ic,int maths,int c)
	{
		this.name = name;
		this.ic = ic;
		this.maths = maths;
		this.c = c;
	}	
	
	void sum()
	{
		total = ic+maths+c;
	}
	void person()
	{
		per = (ic+maths+c)/3.0F;
	}
}



class demo
{
	public static void main(String[] args)
	{
		student s[] = new student[2];
		student k;
		s[0] = new student("Parth",50,60,70);
		s[0].sum();
		s[0].person();
		s[1] = new student("om",78,50,90);
		s[1].sum();
		s[1].person();
		
		System.out.println("=============================================");
		System.out.println("Name\tMarks1\tMarks2\tMarks3\ttotal\tper");
		System.out.println("=============================================");
		System.out.println(s[0].name+"\t"+s[0].ic+"\t"+s[0].maths+"\t"+s[0].c+"\t"+s[0].total+"\t"+s[0].per);
		System.out.println(s[1].name+"\t"+s[1].ic+"\t"+s[1].maths+"\t"+s[1].c+"\t"+s[1].total+"\t"+s[1].per);

		for(int i =0;i<2;i++)
		{
			for(int j = i+1;j<2;j++)
			{
				if((s[i].name.compareTo(s[j].name))<1)
				{
					k = s[i];
					s[i]=s[j];
					s[j]=k;	
				}
			}
		}

		
		System.out.println("=============================================");
		System.out.println("Name\tMarks1\tMarks2\tMarks3\ttotal\tper");
		System.out.println("=============================================");
		System.out.println(s[0].name+"\t"+s[0].ic+"\t"+s[0].maths+"\t"+s[0].c+"\t"+s[0].total+"\t"+s[0].per);
		System.out.println(s[1].name+"\t"+s[1].ic+"\t"+s[1].maths+"\t"+s[1].c+"\t"+s[1].total+"\t"+s[1].per);
	}
}