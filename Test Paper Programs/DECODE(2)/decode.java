import java.util.*;
class Decode
{
private String word,new_word;
private int length;
public Decode()
{
length=0;
word="";
new_word="";
}
public void acceptWord()
{
Scanner ob=new Scanner(System.in);
word=ob.nextLine();
length=word.length();
}
public void findWord()
{
StringBuffer sb=new StringBuffer(word);
int x;
for(x=0;x<word.length();x++)
{
if(x!=(word.length()-1))
if(word.charAt(x)!=word.charAt(x+1))
{
sb.insert(x+1," ");
word=sb.toString();
x=x+1;
}
}
String a[]=word.split(" ");
for(x=0;x<a.length;x++)
{
if(a[x].length()>((a[x].charAt(0))-'a'))
for(int y=0;y<(int)(Math.ceil(a[x].length()/((a[x].charAt(0))-'a'+1)));y++)
new_word+=a[x].charAt(0);
else
for(int y=0;y<a[x].length();y++)
new_word+=a[x].charAt(0);
}
System.out.print(new_word);
}
}
class test2
{
public static void main(String ar[])
{
Decode x1=new Decode();
x1.acceptWord();
x1.findWord();
}
}