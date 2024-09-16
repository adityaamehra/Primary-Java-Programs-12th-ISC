import java.util.*;
import java.io.*;
class Record
{
protected int M[],size;
protected String N[];
public void read()
{
Scanner ob=new Scanner(System.in);
DataInputStream obb=new DataInputStream(System.in);
int x;
for(x=0;x<size;x++)
{
System.out.println("Enter the name and the marks");
try{
N[x]=obb.readLine();
}catch(IOException p)
{}
M[x]=ob.nextInt();
}
}
public void disp()
{
int x;
for(x=0;x<size;x++)
System.out.println(N[x]+"\t"+M[x]);
}
public Record(int cap)
{
size=cap;
N=new String[cap];
M=new int[cap];
}
}
class highest extends Record
{
private int ind;
public highest(int cap)
{
super(cap);
ind=-1;
}
public void find()
{
int temp,x,y;
for(y=0;y<size;y++)
for(x=y+1;x<size;x++)
if(M[x]>M[y])
ind=x;
}
public void disp()
{
int x;
for(x=0;x<size;x++)
if(M[x]==M[ind])
System.out.println(N[x]+"\t"+M[x]);
}
}
class rechigh
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the number of students");
highest x1=new highest(ob.nextInt());
x1.read();
x1.find();
x1.disp();
}
}