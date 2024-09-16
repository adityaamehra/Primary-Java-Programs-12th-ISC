import java.util.*;
class helper
{
public boolean adcheck(long n)
{
String s2=Long.toString(n*n),s1=Long.toString(n),s3="";
StringBuffer sb1=new StringBuffer(s1);
StringBuffer sb2=new StringBuffer(s2);
sb1.reverse();
sb2.reverse();
s3=Long.toString(Long.parseLong(sb1.toString())*Long.parseLong(sb1.toString()));
if(s3.equalsIgnoreCase(sb2.toString()))
return true;
else
return false;
}
public boolean pricheck(long n)
{
long x,v=0;
for(x=2;x<n/2;x++)
if(n%x==0)
v++;
if(v==0)
return true;
else
return false;
}
}
class adpri
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
helper x1=new helper();
System.out.println("Enter the starting number and enter the ending number");
long sn=ob.nextInt(),en=ob.nextInt();
for(long x=sn;x<=en;x++)
if(x1.adcheck(x)&&x1.pricheck(x))
System.out.println(x);
}
}