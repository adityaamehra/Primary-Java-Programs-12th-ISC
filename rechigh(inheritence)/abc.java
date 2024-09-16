import java.io.*;
class sb
{
public static void main(String ab[])throws IOException
{
String s="abcdefg",w="cd",w1="GHI",s1,s2,s3;
/* System.out.println("Enter a string");
StringBuffer sb=new StringBuffer(s); */
int p=s.indexOf(w);
s1=s.substring(0,p);
s2=s.substring(p+w.length());
s3=s1+w1+s2;
System.out.print(s3);
}
}
