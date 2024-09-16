import java.util.*;
class dword
{
private int num;
public dword()
{
num=0;
}
public void acceptnum()
{
Scanner ob=new Scanner(System.in);
num=ob.nextInt();
}
public void recword(int n)
{
String s=Integer.toString(n);
if(s.length()==0)
return;
else
{
System.out.print(word(s.charAt(0)-(int)('0'))+" ");
n=Integer.parseInt(s.substring(1,s.length()));
recword(n);
}
}
public String word(int x)
{
String g="";
switch(x)
{
case 0:
g="ZERO";
break;
case 1:
g="ONE";
break;
case 2:
g="TWO";
break;
case 3:
g="THREE";
break;
case 4:
g="FOUR";
break;
case 5:
g="FIVE";
break;
case 6:
g="SIX";
break;
case 7:
g="SEVEN";
break;
case 8:
g="EIGHT";
break;
case 9:
g="NINE";
break;
default:
g="";
}
return g;
}
public void display()
{
recword(num);
}
}
class d1
{
public static void main(String ar[])
{
try{
dword x1=new dword();
x1.acceptnum();
x1.display();
}catch(Exception p){}
}
}