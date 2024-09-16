import java.util.*;
import java.io.*;
class node
{
node next;
int a;
node(int p)
{
a=p;
next=null;
}
}
class x
{
private node l1;
public void add(int p)
{
l1=add(p,l1);
}
public node add(int p,node m)
{
if(m==null)
{
m=new node(p);
return m;
}
else
{
m.next=add(p,m.next);
return m;
}
}
public void print()
{
print(l1);
}
public void print(node k)
{
if(k==null)
return;
else
{
System.out.print(k.a+" ");
print(k.next);
}
}
public void evensum()
{
System.out.println(es(l1));
}
public int es(node k)
{
if(k==null)
return 0;
else
{
if(k.a%2==0)
return (k.a+es(k.next));
else
return es(k.next);
}
}
}
class recll
{
public static void main(String ar[])throws IOException
{
Scanner ob=new Scanner(System.in);
DataInputStream obb=new DataInputStream(System.in);
int x2=ob.nextInt(),x3;
x x1=new x();
for(x3=0;x3<x2;x3++)
x1.add(Integer.parseInt(obb.readLine()));
x1.print();
System.out.println();
x1.evensum();
}
}