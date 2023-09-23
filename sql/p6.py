import sqlite3
import pandas
conn=sqlite3.connect('cricket.db')
"""
conn.execute(''' 
		create table Cricketer(
			player_no int primary key,
			player_name text,
			runs int
)
a=[
	[1,'Kl rahul',50000],
	[2,'virat kohali',10000],
	[3,'Rohit',12000],
	[4,'Suriy kumar',40000],
	[5,'ishan kishan',60000],
	[6,'Hardik',70000],
	[7,'jadeja',68000],
	[8,'sarudur thakor',1000],
	[9,'kudeep',600],
	[10,'bumra',600],
	[11,'axshidep',100]
]
i=0
while(i<11):
	conn.execute("insert into Cricketer(player_no,player_name,runs) values(?,?,?)",a[i])
	i=i+1
	
conn.commit()
	
''')
"""

df=pandas.read_sql("select * from Cricketer",conn)

a=df.values

m=df['runs'].min()
print(m)
i=0
while(i<len(df)):
	if(df.iloc[i][2]==m):
		print(df.iloc[i][1])
	i=i+1

k=df.sort_values(by='runs',ascending=False)
print(k)

print(k.iloc[0:3])
