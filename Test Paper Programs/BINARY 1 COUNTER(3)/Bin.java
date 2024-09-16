import java.util.*;
class Bin
{
private int Arr[][],n,m;
public Bin(int mm,int nn)
{
m=mm;
n=nn;
Arr=new int[mm][nn];
}
public void input()
{
Scanner ob=new Scanner(System.in);
int x,y,in=0;
String s;
for(x=0;x<Arr.length;x++)
{
in=bin(ob.nextInt());
s=Integer.toString(in);
for(y=0;y<Arr[0].length;y++)
Arr[x][y]=Integer.parseInt(s.charAt(y)-'0');
}
}
public int bin(int n)
{
String s=Integer.toString(n),s2="";
if(s.length()==0)
return 0;
else
{
int m=n/2;
s2=m+""+s2;
return bin(n%2)+Integer.parseInt(s2);
}
}
}