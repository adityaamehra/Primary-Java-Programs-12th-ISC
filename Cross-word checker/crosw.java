import java.io.*;
import java.util.*;
class helper
{
private char c[][];
private int sr,sc,wl;
private String ms="",checker="";
public helper(char[][] b)
{
c=b;
sc=0;
sr=0;
wl=0;
checker="";
}
public void ini(int ir,int ic,String ch)
{
sr=ir;
sc=ic;
wl=ch.length();
checker=ch;
}
private boolean urdm()
{
int x,y;
for(x=sr;x>=0;x--)
for(y=sc;y<c[0].length;y++)
ms+= c[x][y];
System.out.println(" ms 1 ="+ms);
if(ms.equalsIgnoreCase(checker))
{
ms="";
return true;
}
else
{
ms="";
return false;
}
}
private boolean drdm()
{
int x,y;
for(x=sr;x<c.length;x++)
for(y=sc;y<c[0].length;y++)
ms+= c[x][y];
System.out.println(" ms 2 ="+ms);
if(ms.equalsIgnoreCase(checker))
{
ms="";
return true;
}
else
{
ms="";
return false;
}
}
private boolean uldm()
{
int x,y;
for(x=sr;x>=0;x--)
for(y=sc;y>=0;y--)
ms+= c[x][y];
System.out.println(" ms 3 ="+ms);
if(ms.equalsIgnoreCase(checker))
{
ms="";
return true;
}
else
{
ms="";
return false;
}
}
private boolean dldm()
{
int x,y;
for(x=sr;x<c.length;x++)
for(y=sc;y>=0;y--)
ms+= c[x][y];
System.out.println(" ms 4 ="+ms);
if(ms.equalsIgnoreCase(checker))
{
ms="";
return true;
}
else
{
ms="";
return false;
}
}
private boolean rsm()
{
int y;
for(y=sc;y<c[0].length;y++)
ms+= c[sr][y];
System.out.println(" ms 5 ="+ms);
if(ms.equalsIgnoreCase(checker))
{
ms="";
return true;
}
else
{
ms="";
return false;
}
}
private boolean lsm()
{
int y;
for(y=sc;y>=0;y--)
ms+= c[sr][y];
System.out.println(" ms 6 ="+ms);
if(ms.equalsIgnoreCase(checker))
{
ms="";
return true;
}
else
{
ms="";
return false;
}
}
private boolean usm()
{
int x;
for(x=sr;x>=0;x--)
ms+= c[x][sc];
System.out.println(" ms 7 ="+ms);
if(ms.equalsIgnoreCase(checker))
{
ms="";
return true;
}
else
{
ms="";
return false;
}
}
private boolean dsm()
{
int x;
for(x=sr;x<c.length;x++)
ms+= c[x][sc];
System.out.println(" ms 8 ="+ms);
if(ms.equalsIgnoreCase(checker))
{
ms="";
return true;
}
else
{
ms="";
return false;
}
}
public boolean[] calc()
{
boolean a[]=new boolean[8];
a[0]=urdm();
a[1]=uldm();
a[2]=drdm();
a[3]=dldm();
a[4]=usm();
a[5]=dsm();
a[6]=rsm();
a[7]=lsm();
return a;
}
public boolean tche(boolean[] a)
{
for(int x=0;x<a.length;x++)
if(a[x])
return true;
return false;
}
}
class crosw
{
public static void main(String ar[])throws IOException
{
DataInputStream obb=new DataInputStream(System.in);
Scanner ob=new Scanner(System.in);
System.out.println("Enter the no. of the words amd the row and column of the crossword");
boolean a[]=new boolean[8];
int nw=ob.nextInt(),nr=ob.nextInt(),nc=ob.nextInt(),x,y;
String w[]=new String[nw],st="";
char c[][]=new char[nr][nc];
System.out.println("Enter the words");
for(x=0;x<nw;x++)
w[x]=obb.readLine();

for(int z=0;z<nw;z++)
System.out.println(w[z]);


System.out.println("Enter the characters in the cross-word");
for(x=0;x<nr;x++)
for(y=0;y<nc;y++)
c[x][y]=obb.readLine().charAt(0);
helper x1=new helper(c);
for(int z=0;z<nw;z++)
for(x=0;x<nr;x++)
{
for(y=0;y<nc;y++)
{
x1.ini(x,y,w[z]);
a=x1.calc();
if(x1.tche(a))
System.out.println(w[z]+" is found");
}
}
}//these two are neccessary
}
