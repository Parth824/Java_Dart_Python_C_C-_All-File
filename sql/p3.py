import sqlite3
import pandas
import matplotlib.pyplot as plt

"""
.open Bank.db

create table Bank_account(
		account_no int primary key,
		account_type text,
		balance int,
		check(account_type='saving' or account_type='current')
		);

insert into Bank_account values (101,'saving',20000),
(102,'saving',120000),(103,'current',50000),(104,'saving',100000),
(105,'current',10000),(106,'current',160000),(107,'saving',4000),
(108,'saving',1500);

conn.execute('''
		create trigger tr1
		before update on Bank_account
		begin
		select
		case when (new.balance<500) then
		RAISE(ABORT,'Maintan Minimun 500 balancce')
		end;
		end;
		''')


for row in df:
	print(row)

num=int(input("Enter Account no:"))
ba=int(input("Enter balace:"))


conn.execute("update Bank_account set balance = balance - ? where account_no= ?",[ba,num])

for row in df:
	print(row)

conn.commit()
conn.commit()

df=pandas.read_sql("select * from Bank_account where balance>99999",conn)

df.to_csv('Lakhpati.csv')
"""

conn=sqlite3.connect('Bank.db')

df=pandas.read_sql("select * from Bank_account ",conn)

x=df['account_no']
y=df['balance']

plt.scatter(x,y)
plt.show()


