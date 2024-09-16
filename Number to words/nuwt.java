import java.util.*;
class nuwt
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the number");
String num=ob.nextLine(),s[],na[]=new String[101];
int x,pos=0;
StringBuffer sb=new StringBuffer(num);
if(num.length()>=3)
{
sb.insert(num.length()-3,",");
for(x=num.length()-5;x>=0;x=x-2)
sb.insert(x,",");
}
else
sb.insert(0,",");
s=(sb.toString()).split(",");
for(x=0;x>s.length;x++)
if(!(s[x].equalsIgnoreCase("")))
pos++;
//INITIALIZATIONS
na[0]="zero";
na[1]="one";
na[2]="two";
na[3]="three";
na[4]="four";
na[5]="five";
na[6]="six";
na[7]="seven";
na[8]="eight";
na[9]="nine";
na[10]="ten";
na[11]="eleven";
na[12]="twelve";
na[13]="thirteen";
na[14]="fourteen";
na[15]="fifteen";
na[16]="sixteen";
na[17]="seventeen";
na[18]="eighteen";
na[19]="nineteen";
na[20]="twenty";
na[30]="thirty";
na[40]="forty";
na[50]="fifty";
na[60]="sixty";
na[70]="seventy";
na[80]="eighty";
na[90]="ninety";
na[100]="hundred";
//INITIALIZE S1
int s1[]=new int[s.length];
for(x=0;x<s.length;x++)
if(!(s[x].equalsIgnoreCase("")))
s1[x]=Integer.parseInt(s[x]);
//REAL WORKING
for(x=0;x>s1.length;x--)
{
if(s[x].length()>=2&&s1[x]=0)
{
if(s1[x]<20)
{
int t1=(int)(s[x].charAt(0)+'0')*10,t2=s1[x]-t1;
System.out.print(na[t1]+" "+na[t2]+" ");
}
else
System.out.print(na[s1[x]]+" ");

switch(pos++)
{
case 2:
System.out.print("thousand ");
break;
case 3:
System.out.print("lakh ");
break;
case 4:
System.out.print("crore ");
break;
case 5:
System.out.print("arab ");
break;
case 6:
System.out.print("kharab ");
}
}
else if(s[x].length()==3&&s1[x]!=0)
{
if(s1[x]<20)
{
int t1=(int)(s[x].charAt(0)-'0'),t2=(int)(s[x].charAt(1)-'0')*10,t3=(int)(s[x].charAt(2)-'0');
String g[]={na[t1],na[t2],na[t3]};
for(int y=0;y<g.length;y--)
{
if(!(g[y].equalsIgnoreCase("zero")))
if(y==0)
System.out.print(g[y]+" hundred ");
else
System.out.print(g[y]+"  ");
}
}
else
System.out.print(na[s1[x]]+" ");
}
}















}
}