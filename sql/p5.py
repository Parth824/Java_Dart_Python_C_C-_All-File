import sqlite3
import pandas
import matplotlib.pyplot as plt

conn=sqlite3.connect('company.db')
"""
conn.execute(''' 
		create table sales_product(
			order_no int primary key,
			p_id int ,
			p_name text,
			p_unit_price int,
			sales_quantity int,
			sales_unit_price ints
)
	
''')

i=0
while(i<5):
			o=int(input("Enter order_no:"))
			p=int(input("Enter p_id :"))
			p1=input("Enter p_name :")
			p2=int(input("Enter p_unit_price :"))
			p3=int(input("Enter sales_quantity :"))
			p4=int(input("Enter sales_unit_price:"))


			conn.execute("insert into sales_product(order_no,p_id,p_name,p_unit_price,sales_quantity,sales_unit_price ) values(?,?,?,?,?,?)",[o,p,p1,p2,p3,p4])
			conn.commit()
			i=i+1
"""
df=pandas.read_sql("select * from sales_product",conn)

print(df)

df['total_unit_price']=df['p_unit_price']*df['sales_quantity']
df['total_sales_price']=df['sales_quantity']*df['sales_unit_price']
df['total_profit']=df['total_sales_price']-df['total_unit_price']
print(df)

x=df['p_name']
y1=df['total_unit_price']
y2=df['total_sales_price']
y3=df['total_profit']

plt.scatter(x,y1)

plt.scatter(x,y2)

plt.scatter(x,y3)

plt.show()
