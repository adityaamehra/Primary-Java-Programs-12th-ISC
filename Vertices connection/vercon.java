import java.util.*;
class vercon
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the number of vertices");
int v=ob.nextInt(),con,a[][]=new int[v][v],x,t1=0,t2=0,y,z,h;
String s="";
boolean b1=false,b2=false;
System.out.println("Enter the no. of connections");
con=ob.nextInt();
//CONNECTIONS TO BE MADE
for(x=0;x<con;x++)
{
t1=ob.nextInt()-1;
t2=ob.nextInt()-1;
a[t1][t2]=x+1;
a[t2][t1]=x+1;
}
s=(t1+1)+" ";
//TAKING THE CONNECTION TO CHECK
System.out.println("Enter the input whom we have to check the connections");
t1=ob.nextInt();
t1--;
t2=ob.nextInt();
t2--;
x=0;
//CHECKING BY RECURRSIONS
int t=0;
while(t<200)
{
for(y=0;y<v;y++)
if(a[x][y]>0)
{
a[y][x]=a[x][y]=-2;
x=y;
s+=(x+1)+" ";
y=0;
}
t++;
x=0;
}
for(x=0;x<v;x++)
for(y=0;y<v;y++)
if(a[x][y]>0)
{
for(int h1=0;h1<v;h1++)
if(a[x][h1]<0)
{
b1=true;
break;
}
if(b1)
a[x][y]=a[y][x]=-2;
}

b1=false;
for(x=0;x<v;x++)
if(a[t1][x]==-2)
b1=true;
for(x=0;x<v;x++)
if(a[t2][x]==-2)
b2=true;
if(b1&&b2)
{
System.out.println("Connection is done");
System.out.print(s);
}
else
System.out.print("Connection is not done");
}
}