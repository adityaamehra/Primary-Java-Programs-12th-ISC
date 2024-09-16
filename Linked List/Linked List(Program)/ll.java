import java.util.*;
class node
{
int a;
node next;
node(int k)
{
a=k;
next=null;
}
}
class ll
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
int k,h,x,n;
node n1=null,n2=null;
boolean b=true;
char c='\u0000';
//FILLING OF THE NODES
do
{
if(n1==null)
n1=n2=new node(ob.nextInt());
else
{
n2.next=new node(ob.nextInt());
n2=n2.next;
}
System.out.println("Do you want to continue ?");
c=Character.toUpperCase(ob.next().charAt(0));
}while(c!='N');
n2=n1;
//SWITCH-CASE
while(b)
{
n2=n1;
System.out.println("1:-Insertion of node\n2:-Deletion of node");
k=ob.nextInt();
switch(k)
{
//INSERTION
case 1:
System.out.println("Enter the value");
node n3=new node(ob.nextInt());
System.out.println("1:-Position\n2:-Value");
h=ob.nextInt();
switch(h)
{
case 1:
System.out.println("Enter the position");
n=ob.nextInt();
for(x=0;x<n-2;x++)
n2=n2.next;
n3.next=n2.next;
n2.next=n3;
break;
case 2:
System.out.println("Enter the value");
n=ob.nextInt();
while(n2!=null)
{
if(n==n2.next.a)
break;
n2=n2.next;
}
n3.next=n2.next;
n2.next=n3;
break;
default:
System.out.println("Enter correct value");
}
break;
//DELETION
case 2:
System.out.println("1:-Position\n2:-Value");
h=ob.nextInt();
switch(h)
{
case 1:
System.out.println("Enter the position");
n=ob.nextInt();
for(x=0;x<n-2;x++)
n2=n2.next;
n2.next=n2.next.next;
break;
case 2:
System.out.println("Enter the value");
n=ob.nextInt();
while(n2!=null)
{
if(n==n2.next.a)
break;
n2=n2.next;
}
n2.next=n2.next.next;
break;
default:
System.out.println("Enter correct value");
}
break;
default:
System.out.println("Please enter correct value");
}
n2=n1;
while(n2!=null)
{
System.out.println(n2.a);
n2=n2.next;
}
System.out.println("Do you want to exit the program(true/false)");
b=!(ob.nextBoolean());
}
n2=n1;
while(n2!=null)
{
System.out.println(n2.a);
n2=n2.next;
}
}
}