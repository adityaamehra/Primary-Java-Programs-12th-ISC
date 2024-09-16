import java.util.*;
class Diff
{
private int dd,mm,yyyy;
public void in()
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the day");
dd=ob.nextInt();
System.out.println("Enter the month");
mm=ob.nextInt();
System.out.println("Enter the year");
yyyy=ob.nextInt();
}
public void add(int N)
{
dd+=N;
}
public void out()
{
System.out.println(dd+"/"+mm+"/"+yyyy);
}
//REAL PROGRAM
public int sub(Diff D)
{
int x,y,md=0,s=0,tm=mm,ty=yyyy;
for(x=0;x<D.yyyy-yyyy;x++)
{
if(x==0)
y=tm+1;
else
y=1;
for(y=tm;y<=12;y++)
{
switch(y)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
md=31;
break;
case 4:
case 6:
case 9:
case 11:
md=30;
break;
case 2:
{
if(ty%100==0)
{
if((ty/100)%4==0)
md=29;
else
md=28;
}
else
{
if(ty%4==0)
md=29;
else
md=28;
}
}
}
s+=md;
//CORRECT FOR BRACKETS
}
ty++;
}
for(y=mm+1;y<D.mm;y++)
{
switch(y)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
md=31;
break;
case 4:
case 6:
case 9:
case 11:
md=30;
break;
case 2:
{
if(yyyy%100==0)
{
if((yyyy/100)%4==0)
md=29;
else
md=28;
}
else
{
if(yyyy%4==0)
md=29;
else
md=28;
}
}
}
s+=md;
//CORRECT FOR BRACKETS
}
s+=D.dd;
switch(mm)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
md=31;
break;
case 4:
case 6:
case 9:
case 11:
md=30;
break;
case 2:
{
if(yyyy%100==0)
{
if((yyyy/100)%4==0)
md=29;
else
md=28;
}
else
{
if(yyyy%4==0)
md=29;
else
md=28;
}
}
}
s+=md-dd;
return s;
}
}
class ddif
{
public static void main(String ar[])
{
Diff d1,d2,d3;
d1=new Diff();
d1.in();
d2=new Diff();
d2.in();
System.out.println(d1.sub(d2));
}
}