import java.util.*;
class useless
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
int x=ob.nextInt(),m,mn=3;
String n="";
while(x!=0)
{
m=x%2;
n=m+""+n;
x=x/2;
}
System.out.println(n);
}
}