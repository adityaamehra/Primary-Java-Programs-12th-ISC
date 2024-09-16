import java.util.*;
class pahelper
{
public String[] summer(String a1[])
{
String s="";
int x,a[]=converter(a1);
for(x=0;x<a.length-1;x++)
s+=a[x]+","+(a[x]+a[x+1]+",");
s=s+a[a.length-1];
return s.split(",");
}
public int[] converter(String a1[])
{
int x,a[]=new int[a1.length];
for(x=0;x<a.length;x++)
a[x]=Integer.parseInt(a1[x]);
return a;
}
public void printer(String a[])
{
String s="";
int x;
for(x=0;x<a.length;x++)
s+=a[x]+",";
System.out.print(s.substring(0,s.length()-1));
System.out.println();
}
}
class pa
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
pahelper x1=new pahelper();
System.out.println("Enter the first line");
String s=ob.nextLine(),a1[]=s.split(",");
int x,ite=0;
System.out.println("Enter the no. of iterations");
ite=ob.nextInt();
for(x=0;x<ite;x++)
{
a1=x1.summer(a1);
x1.printer(a1);
}
}
}