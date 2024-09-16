import java.util.*;
class palin
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
char c='\u0000';
node n1,n2,n3,n4;
n1=n2=n3=n4=null;
String s=ob.nextLine();
int x=0;
do
{
if(n1==null)
n1=n2=new node((int)(s.charAt(x))-(int)('0'));
else
{
n2.next=new node((int)(s.charAt(x))-(int)('0'));
n2=n2.next;
}
x++;
}while(x<s.length());
n2=n1;
x=s.length()-1;
do
{
if(n3==null)
n3=n4=new node((int)(s.charAt(x))-(int)('0'));
else
{
n4.next=new node((int)(s.charAt(x))-(int)('0'));
n4=n4.next;
}
x--;
}while(x>=0);
n4=n3;
for(x=0;x<s.length();x++)
{
if(n2.a!=n4.a)
break;
n2=n2.next;
n4=n4.next;
}
if(x==s.length())
System.out.print("Palindrome");
else
System.out.print("Not a palindrome");
}
}