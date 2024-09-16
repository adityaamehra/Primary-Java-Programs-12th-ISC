import java.util.*;
class node
{
int a;
node next;
}
class ll
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
int k;
node n1=null,n2=null;
char c='\u0000';
do
{
if(n1==null)
{
n1=n2=new node();
n2.a=ob.nextInt();
n2.next=null;
}
else
{
n2.next=new node();
n2=n2.next;
n2.a=ob.nextInt();
n2.next=null;
}
System.out.println("Do you want to continue ?");
c=Character.toUpperCase(ob.next().charAt(0));
}while(c!='N');
n2=n1;
//PRINTING
while(n2!=null)
{
System.out.println(n2);
System.out.println(n2.a);
n2=n2.next;
}
}
}