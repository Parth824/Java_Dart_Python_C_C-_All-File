import sqlite3
import pandas


conn=sqlite3.connect('om.db')
"""
conn.execute(''' 
		create table EMP
		(
			e_id int primary key,
			e_name text,
			salary int
		)
		''')

a=df.values

i=0
while(i<len(a)):
	conn.execute("insert into EMP(e_id,e_name,salary) values(?,?,?)",a[i])
	i=i+1

conn.commit()
"""

df=pandas.read_csv('emp_details.csv')

print(df)