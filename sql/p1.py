import sqlite3
import pandas
from matplotlib import pyplot as plt

"""
.open Industry.db

create table Department(
	d_id int primary key,
	d_name text,
	no_of_employee number,
	total_payment int
);

insert into Department values(101,'Sales',5,60000);
insert into Department values(102,'Marketing',8,780000);
insert into Department values(103,'Finance',9,600000);
insert into Department values(104,'Account',2,150000);
insert into Department values(105,'it',10,2000000);

"""
conn=sqlite3.connect('Industry.db')

df=pandas.read_sql("select * from Department",conn)

df['average_pyment']=df['total_payment']/df['no_of_employee']
df.to_csv('dept.csv')
print(df)


x=df['d_name']
y=df['no_of_employee']
y2=df['total_payment']

plt.scatter(x,y)
plt.scatter(x,y2)
plt.show()


