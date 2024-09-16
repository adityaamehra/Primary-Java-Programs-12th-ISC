import java.util.*;
import java.io.*;
class bst
{
bst left,right;
int a;
bst(int p)
{
a=p;
left=right=null;
}
}
class x
{
private bst l1;
public void add(int p)
{
l1=add(p,l1);
}
private bst add(int p,bst m)
{
if(m==null)
{
m=new bst(p);
return m;
}
else if(m.a>p)
{
m.left=add(p,m.left);
return m;
}
else if(m.a<p)
{
m.right=add(p,m.right);
return m;
}
else
{
System.out.println("No. already there");
return m;
}
}
public void inorder()
{
in(l1);
}
private void in(bst m)
{
if(m==null)
return ;
else
{
in(m.left);
System.out.println(m.a);
in(m.right);
}
}
}
class bist
{
public static void main(String ar[])throws IOException
{
Scanner ob=new Scanner(System.in);
DataInputStream obb=new DataInputStream(System.in);
int x,x2=ob.nextInt();
x x1=new x();
for(x=0;x<x2;x++)
x1.add(Integer.parseInt(obb.readLine()));
x1.inorder();
}
}