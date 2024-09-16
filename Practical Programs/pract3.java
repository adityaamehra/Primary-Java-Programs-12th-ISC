import java.util.*;
import java.io.*;
class pract3
{
public static void main(String ar[])throws IOException
{
Scanner ob=new Scanner(System.in);
DataInputStream obb=new DataInputStream(System.in);
String d1[],bo1[];
d1=(ob.nextLine()).split(" ");
int t,x,y,t1,d[]=new int[d1.length],bo[],boo=0;
bo1=(obb.readLine()).split(" ");
bo=new int[bo1.length];
for(x=0;x<d1.length;x++)
d[x]=Integer.parseInt(d1[x]);
for(x=0;x<bo1.length;x++)
bo[x]=Integer.parseInt(bo1[x]);
for(x=0;x<d.length;x++)
for(y=x+1;y<d.length;y++)
if(d[x]>d[y])
{
t=d[x];
t1=bo[x];
d[x]=d[y];
bo[x]=bo[y];
d[y]=t;
bo[y]=t1;
}
t=d[0];
for(x=0;x<d.length;x++)
d[x]=d[x]-t;
for(x=0;x<d.length;x++)
for(y=0;y<d[x];y++)
{
boo+=bo[x];
bo[x]=0;
try{
if(d[x+1]==d[x])
{
continue;
}
}catch(Exception p){}
}
System.out.println(boo+bo[0]);
}
}