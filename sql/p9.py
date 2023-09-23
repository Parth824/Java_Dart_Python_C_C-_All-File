import sqlite3


conn=sqlite3.connect('pop.db')

print("1). create table and create trigger")
print("2). insert recored")
print("3). Update spcifi record")
print("4). delete specific record")
print("5). highest totls marks")
print("6). Dispaly recored")
print("7). exti")
i=int(input("Enter the number:"))

if(i==1):
	try:
		conn.execute("drop table student")

	except:
		print("")
	
	conn.execute('''
			create table student (
				Rollno int primary key,
				Name text,
				Sub1 int,
				Sub2 int,
				Sub3 int,
				total int
			)
			''')

	conn.execute(''' 
			create trigger tr1
			after insert on student
			begin
			update student set total=new.Sub1+new.Sub2+new.Sub3 where Rollno=new.Rollno;
			end;
		''')

	conn.execute(''' 
			create trigger tr2
			after update on student
			begin
			update student set total=new.Sub1+new.Sub2+new.Sub3 where Rollno=new.Rollno;
			end;
		''')


if(i==2):
	num=int(input("How many number insert: "))
	y=0
	while(y<num):	
		r=int(input("Enter the Rollno: "))
		n=input("Enter name: ")
		s1=int(input("Enter sub1: "))
		s2=int(input("Enter sub2: "))
		s3=int(input("Enter sub3: "))

		conn.execute("insert into student(Rollno,Name,Sub1,Sub2,Sub3) values(?,?,?,?,?)",[r,n,s1,s2,s3])	
		y=y+1
		conn.commit()