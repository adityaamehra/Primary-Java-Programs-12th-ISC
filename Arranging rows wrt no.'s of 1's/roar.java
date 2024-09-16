import java.util.*;
class helper
{
public int cal1(String s)
{
int c1=0,x;
for(x=0;x<s.length();x++)
if(s.charAt(x)-'0'==1)
c1++;
return c1;
}
}
class roar
{
public static void  main(String ar[])
{
Scanner ob=new Scanner(System.in);
int x,y,n1=ob.nextInt(),n2=ob.nextInt(),a[][]=new int[n1+2][n2];
String s="";
helper x1=new helper();
for(x=2;x<a.length;x++)
for(y=0;y<a[0].length;y++)
a[x][y]=ob.nextInt();
for(x=0;x<a[0].length;x++)
a[0][x]=x;
for(x=2;x<a.length;x++)
{
for(y=0;y<a[0].length;y++)
s+=a[x][y];
a[1][x-2]=x1.cal1(s);
s="";
}
for(x=0;x<a.length;x++)
{
for(y=0;y<a[0].length-1;y++)
if(a[1][y]>a[1][y+1])
{
int temp=a[1][y];
a[1][y]=a[1][y+1];
a[1][y+1]=temp;
temp=a[0][y];
a[0][y]=a[0][y+1];
a[0][y+1]=temp;
}
}
for(y=0;y<a[0].length;y++)
System.out.print(a[0][y]+" ");
}
}