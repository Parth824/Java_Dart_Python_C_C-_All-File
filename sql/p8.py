import pandas
import matplotlib.pyplot as plt

df=pandas.read_csv('selling.csv')



df['totale_sell']=df['Jan']+df['Feb']+df['Mar']+df['Apr']+df['May']+df['Jun']

df['average_sell']=df['totale_sell']/6

print(df)


x=df['totale_sell']
y=df['average_sell']

plt.plot(x,y,'r^')
plt.legend(labels=['totale_sell','average'])

plt.show()

df.to_csv('sell_analysis.csv')