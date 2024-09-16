import java.util.*;
class mtt
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the expression");
String exp=(ob.nextLine()).toUpperCase();
int x,y,cv=0,cs=0,fa[][],temp=0,c=0,nn=0;
boolean b=true;
for(y='A';y<='Z';y++)
for(x=0;x<exp.length();x++)
if(exp.charAt(x)==y)
{
cv++;
break;
}
for(x=0;x<exp.length();x++)
{
if(exp.charAt(x)=='+'||exp.charAt(x)=='.'||exp.charAt(x)=='\'')
cs++;
if(exp.charAt(x)=='\'')
nn++;
}
fa=new int[(int)(Math.pow(2,cv))][cs+cv];
for(x=0;x<fa.length;x++)
for(y=0;y<fa[0].length;y++)
fa[x][y]=-1;
temp=(int)(Math.pow(2,cv-1));
//ALL INITIALIZATIONS ARE DONE
for(x=0;x<cv;x++)
{
c=1;
b=true;
for(y=0;y<fa.length;y++)
{
if(c==temp+1)
{
if(b)
b=false;
else
b=true;
c=1;
}
if(b)
fa[y][x]=0;
else
fa[y][x]=1;
c++;
}
temp/=2;
}
temp=cv;
//INITIALIZATIONS DONE
//COMPUTING ALL NOTS
for(x=0;x<exp.length();x++)
if(exp.charAt(x)=='\'')
{
for(y=0;y<fa.length;y++)
{
if(fa[y][exp.charAt(x-1)-'A']==0)
fa[y][temp]=1;
else
fa[y][temp]=0;
}
temp++;
}
//NOTTING DONE
//SOLVING ORS
String or[]=exp.split("[+]"),a[],and[];
int s1=0,s2=0,temp2=temp,t3=cv;
for(x=0;x<or.length;x++)
{
a=or[x].split("[.]");
for(y=0;y<a.length;y=y+2)
{
try{
s1=a[y].charAt(0)-'A';
}catch(Exception p)
{
s1=-1;
}
try{
s2=a[y+1].charAt(0)-'A';
}catch(Exception p)
{
s2=-1;
}
System.out.println(s1+" "+s2);
try{
if(a[y].length()==2)
s1=t3++;
}catch(Exception p){}
try{
if(a[y+1].length()==2)
s2=t3++;
}catch(Exception p){}
System.out.println(s1+" "+s2);
if(s1!=-1&&s2!=-1)
for(int z=0;z<fa.length;z++)
fa[z][temp]=fa[z][s1]*fa[z][s2];
temp++;
}
}
temp--;
System.out.println(temp);
for(x=0;x<fa.length;x++)
{
for(y=0;y<fa[0].length;y++)
System.out.print(fa[x][y]+" ");
System.out.println();
}
























}
}