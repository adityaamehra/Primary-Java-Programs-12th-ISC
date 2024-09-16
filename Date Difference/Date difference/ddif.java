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
public Diff sub(Diff D)
{
Diff d3=new Diff();
if(mm>D.mm)
{
D.yyyy--;
D.mm+=12;
}
if(dd>D.dd)
{
D.mm--;
switch(D.mm)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
D.dd+=31;
break;
case 4:
case 6:
case 9:
case 11:
D.dd+=30;
break;
case 2:
{
if(D.yyyy%100==0)
{
if((D.yyyy/100)%4==0)
D.dd+=29;
else
D.dd+=28;
}
else 
{
if(D.yyyy%4==0)
D.dd+=29;
else
D.dd+=28;
}
}
}
}
d3.dd=D.dd-dd;
d3.mm=D.mm-mm;
d3.yyyy=D.yyyy-yyyy;
return d3;
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
d3=d1.sub(d2);
d3.out();
}
}