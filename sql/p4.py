import csv
import pandas
import sqlite3
import matplotlib.pyplot as plt
from datetime import date


conn=sqlite3.connect('Banj.db')
"""
conn.execute('''
		create table EMP(
			e_id int  primary key,
			e_name text,
			salary int,
			date_of_birth date		
		)

 ''')

f=df.values

today=date.today()
a=pandas.to_datetime(df['date_of_birth'],format='%m-%d-%Y').dt.year
df['age']=today.year-a

for row in f:
	conn.execute("insert into EMP(e_id,e_name,salary,date_of_birth) values(?,?,?,?)",row)
	conn.commit()
"""

df=pandas.read_csv('employee.csv')
print(df)

data=[]
i=0;

while(i<len(df)):
	bod=str(df.loc[i].values[3])
	bod=bod.split("-")
	year=int(bod[2])
	age=2022-year
	data.append(age)
	i=i+1

plt.hist(data)
plt.xticks(range(30,80,5))

plt.show()

