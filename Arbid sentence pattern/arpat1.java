import java.util.*;
class arpat1
{
public void arpat11()
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the sentence");
String s=ob.nextLine(),s1="";
StringTokenizer st1=new StringTokenizer(s);
boolean b=true;
int n=st1.countTokens(),x,y=0,dx=0,h=0;
for(x=0;x<n;x++)
{
s1=st1.nextToken();
if(s1.length()>y)
y=s1.length();
}
h=y;
StringTokenizer st=new StringTokenizer(s);
for(x=0;x<n;x++)
{
s1=st.nextToken();
dx=h-s1.length();
if(b)
for(y=0;y<s1.length();y++)
{
for(int z=0;z<y+dx;z++)
System.out.print(" ");
System.out.print(s1.charAt(y));
System.out.println();
}
if(!b)
for(y=s1.length()-1;y>=0;y--)
{
for(int z=0;z<y+dx;z++)
System.out.print(" ");
System.out.print(s1.charAt(y));
System.out.println();
}
if(b)
b=false;
else
b=true;
}
}
}