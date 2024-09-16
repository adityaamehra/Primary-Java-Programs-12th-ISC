import java.util.*;
class disco
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the length of the array");
int n=ob.nextInt(),a[]=new int[n],x,temp,y;
String s="";
for(x=0;x<n;x++)
a[x]=ob.nextInt();
for(x=0;x<n;x++)
for(y=x;y<n;y++)
if(a[x]>a[y])
{
temp=a[x];
a[x]=a[y];
a[y]=temp;
}
for(y=0;y<=9;y++)
for(x=0;x<n;x++)
{
s=Integer.toString(a[x]);
temp=(int)(s.charAt(0))-48;
if(temp==y)
System.out.print(a[x]+" ");
}
}
}