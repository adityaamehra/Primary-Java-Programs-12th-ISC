import java.io.*;
class helper
{
public boolean check(char c,String a[][])
{
int x;
String s="";
for(x=0;x<a[0].length;x++)
if(a[0][x].equalsIgnoreCase(c+""))
{
s=a[1][x];
break;
}

for(x=0;x<a[0].length;x++)
if(a[0][x].equalsIgnoreCase(c+""))
if(!(s.equalsIgnoreCase(a[1][x])))
return false;
return true;
}
}
class strpatrec
{
public static void main(String ar[])throws IOException
{
DataInputStream ob=new DataInputStream(System.in);
helper he=new helper();
System.out.println("Enter the string");
String s=ob.readLine(),pat="";
System.out.println("Enter the pattern");
pat=ob.readLine();
int x;
String a[][]=new String[2][s.length()];
for(x=0;x<a[0].length;x++)
a[0][x]=Character.toString(s.charAt(x));
a[1]=pat.split(" ");
for(x='a';x<='z';x++)
if(!(he.check((char)(x),a)))
{
System.out.print("false");
System.exit(0);
}
System.out.print("true");
}
}