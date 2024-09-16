import java.util.*;
class power
{
public int pow(int base,String number)
{
int x=0,sum=0,y=0,z=0;
for(x=number.length()-1;x>=0;x--)
{
y=number.charAt(x)-'0';
z=(int)(Math.pow(base,Math.abs(number.length()-x-1)));
sum+=y*z;
}
return sum;
}
}
class sbe
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
String n1="",n2="";
power x1=new power();
int x,s1=0,s2=0,h=0,y=0; 
//STARTED WITH PRINTING
System.out.print("x =");
n1=ob.nextLine();
System.out.print("y =");
n2=ob.nextLine();
System.out.println();
//CHECKING FOR THE HIGHEST BASE THAT CAN BE USED
for(x=0;x<n1.length();x++)
if(((int)(n1.charAt(x))-(int)('0'))>h)
h=(int)(n1.charAt(x))-(int)('0');
s1=++h;
h=0;
for(x=0;x<n2.length();x++)
if(((int)(n2.charAt(x))-(int)('0'))>h)
h=(int)(n2.charAt(x))-(int)('0');
s2=++h;
//STARTING TO FIND THE NUMBER IN ANY POWER
a:for(x=s2;x<=20;x++)
{
for(y=s1;y<=20;y++)
{
if(x1.pow(y,n1)==x1.pow(x,n2))
break a;
}
}
if((y>20)||(x>20))
System.out.print("Invalid input");
else
System.out.print(n1+" (base "+y+" ) = "+n2+" (base "+x+" )");
}
}