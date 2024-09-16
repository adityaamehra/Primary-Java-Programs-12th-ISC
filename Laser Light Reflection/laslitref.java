import java.util.*;
class helper
{
public boolean checker(int w1c,int w1r,char a[][],int w2c,int w2r,char ch)
{
boolean b=false;
int k=w1r,m=w1c,r=a.length,c=a[0].length,y=0;
a[k][m]=ch;
while(true)
{
try
{
if(a[k][m]=='l')
{
a[k][m]='X';
m--;
}
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k][m]=='u')
{
a[k][m]='X';
k--;
}
}
catch(ArrayIndexOutOfBoundsException M)
{} 

try
{
if(a[k][m]=='d')
{
a[k][m]='X';
k++;
}
}
catch(ArrayIndexOutOfBoundsException M)
{} 
try
{
if(a[k][m]=='r')
{
a[k][m]='X';
m++;
}
}
catch(ArrayIndexOutOfBoundsException M)
{}
if(k>=w2r-1&&m>=w2c-1)
{
b=true;
break;
}
y++;
if(y>((r*c)+1))
{
b=false;
break;
}
}
System.out.println();
return b;
}
}
class laslitref
{
public static void main(String ag[])
{
Scanner  ob=new Scanner(System.in);
System.out.println("enter the value of rows and columns of the input window");
int w1r=ob.nextInt(),w1c=ob.nextInt();
System.out.println("enter the value of rows and columns of the output window");
int w2r=ob.nextInt(),w2c=ob.nextInt();
System.out.println("enter the number of rows and columns");
int r= ob.nextInt(),c= ob.nextInt(),k=0,m=0,y=0;
char a[][]=new char[r][c],buff='\u0000';
helper x1=new helper();
System.out.println("Enter the direction values");
for( k=0;k<r;k++)
for(m=0;m<c;m++)
{
buff=Character.toLowerCase(ob.next().charAt(0));
if(buff=='u'||buff=='d'||buff=='l'||buff=='r'||buff=='w')
a[k][m]=buff;
else
{
m--;
System.out.println("enter exceptable values");
}
}
System.out.println();
if(x1.checker(w1c,w1r,a,w2c,w2r,'u'))
System.out.print("Light out 1");
else if(x1.checker(w1c,w1r,a,w2c,w2r,'d'))
System.out.print("Light out 2");
else if(x1.checker(w1c,w1r,a,w2c,w2r,'l'))
System.out.print("Light out 3");
else if(x1.checker(w1c,w1r,a,w2c,w2r,'r'))
System.out.print("Light out 4");
else
System.out.print("Light is not out");
}
}