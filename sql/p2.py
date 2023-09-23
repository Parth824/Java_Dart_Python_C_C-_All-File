import sqlite3
import pandas
import matplotlib.pyplot as plt

conn=sqlite3.connect('Collage.db')
"""
conn.execute(''' 
		create table teacher(
			t_id int primary key,
			t_name text,
			salary int,
			working_hours int
		);

	''')

conn.execute('''
		insert into teacher values(1,'Parth',20000,3),
		(2,'om',60000,8),(3,'Meet',15000,7),
		(4,'Kevin',50000,8),(5,'Hit',97000,10),
		(6,'Komal',100000,4),(7,'Puravesh',7000,1),
		(8,'Jay',7400,1),(9,'zeel',15000,6)
		''')

conn.commit()
"""
df=pandas.read_sql("select * from teacher",conn)

df=df.sort_values(by='salary',ascending=False)
print(df)

m=df['salary'].max()
i=0
while(i<len(df)):
	if(df.loc[i]['salary']==m):
		print(df.iloc[i]['t_name'],df.iloc[i]['working_hours'])
	i=i+1

i=0
while(i<len(df)):
	if(df.iloc[i]['salary']>45000 and df.iloc[i]['salary']<65000):
		print(df.iloc[i]['t_name'])
	i=i+1



x=df['t_id']
y=df['working_hours']

plt.subplot(1,2,1)
plt.bar(x,y)

y=df['salary']
plt.subplot(1,2,2)
plt.plot(x,y)

plt.show()




	


