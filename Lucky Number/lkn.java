import java.util.*;
class node
{
int a;
node next,prev;
public node(int k)
{
a=k;
next=null;
prev=null;
}
}
class lkn
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
int p=0,c=0,x,c1=0;
node n1,n2,n3,n4;
n1=n2=null;
do
{
if(n1==null)
{
System.out.println("Enter the value to be stored");
n2=n1=new node(ob.nextInt());
}
else
{
System.out.println("Enter the value to be stored");
n2.next=new node(ob.nextInt());
n2.next.prev=n2;
n2=n2.next;
}
System.out.println("Do you want to add more:-\n4:-No\nEverything else:-Yes");
p=ob.nextInt();
}while(p!=4);
n2.next=n1;
n1.prev=n2;
n3=n1;
p=0;
do
{
c1++;
n3=n3.next;
}while(n3!=n1);
n3=n1;
//PRINTING OF CIRCULAR QUEUE
/*do
{
System.out.println(n3.a);
n3=n3.next;
}while(n3!=n1);*/
//ENDING OF PRINTING
//STARTING OF LUCKY NUMBER
n3=n4=n1;
do
{
c=0;
p=n3.a;
if(p>0)
for(x=0;x<p;x++)
n3=n3.next;
else
for(x=0;x<p*(-1);x++)
n3=n3.prev;
n1.prev.next=n1.next;
n1.next.prev=n1.prev;
n1=n3;
n4=n1;
do
{
c++;
if(c>(c1+10))
break;
n4=n4.next;
}while(n4!=n1);
if(c>(c1+10))
break;
}while(c!=1);
if(c>(c1+10))
System.out.print("Not lucky number");
else
System.out.print("Lucky number");
}
}
//1 2 2 3 3 5 4 4