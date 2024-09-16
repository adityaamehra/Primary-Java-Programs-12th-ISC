import java.util.*;
class function
{
String pi="";
public String func(int n)
{
String rs1="",rs2="";
int p=1,s=0,x,y;
while(p<n)
{

for(x=0;x<n;x=x+p)
{
s=0;
for(y=x;y<x+p;y++)
{
if(y==n)
break;
s++;
}
if(s!=n)
rs2=rs2+s;
}
rs1=rs1+pi+rs2+"@";
rs2="";
p++;
}
return rs1;
}
}
class sumcom
{
public static void main(String ad[])
{
Scanner ob=new Scanner(System.in);
function x1=new function();
String ts="";
System.out.println("Enter the no.");
int n=ob.nextInt(),x,p=2,y,s=0,c=0;
ts=x1.func(n);
p=1;
while(p<(int)(n/2))
{
for(x=0;x<n;x+=p)
{
s=0;
for(y=x;y<x+n;y++)
{
if(y==n)
break;
s++;
}
x1.pi=Integer.toString(s);
ts=ts+x1.func(n-s);
}
p++;
}
String sr[]=ts.split("@"),temp="";
for(x=0;x<sr.length;x++)
for(y=x+1;y<sr.length;y++)
{
if(sr[y]!=null&&sr[x]!=null)
if(sr[x].equalsIgnoreCase(sr[y]))
sr[y]=null;
}
for(x=0;x<sr.length;x++)
{
for(y=x+1;y<sr.length;y++)
if(sr[y]!=null&&sr[x]!=null)
if(sr[y].compareTo(sr[x])>0)
{
temp=sr[x];
sr[x]=sr[y];
sr[y]=temp;
}
}
for(x=0;x<sr.length;x++)
if(sr[x]!=null)
System.out.println(sr[x].trim());
}
}