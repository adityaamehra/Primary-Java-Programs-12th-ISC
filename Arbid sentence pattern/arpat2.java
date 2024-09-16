import java.util.*;
class arpat2
{
public void arpat22()
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the sentence");
String s=ob.nextLine(),s1="";
StringTokenizer st=new StringTokenizer(s);
int n=st.countTokens(),x,y=0;
for(x=0;x<n;x++)
{
s1=st.nextToken();
for(y=0;y<s1.length();y++)
{
for(int z=0;z<y;z++)
System.out.print(" ");
System.out.print(s1.charAt(y));
System.out.println();
}
}
}
}