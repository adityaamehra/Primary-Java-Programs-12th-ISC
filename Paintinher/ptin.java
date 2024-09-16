import java.util.*;
import java.io.*;
class painting
{
protected double wallarea;
protected int colorcode;
public painting(double m)
{
wallarea=m;
colorcode=0;
}
public void Pdata()
{
Scanner ob=new Scanner(System.in);
colorcode=ob.nextInt();
}
public void Pview()
{
System.out.println("Colorcode ="+colorcode);
}
}
class billing extends painting
{
private double charges;
private String s_id,address;
public billing(double n,String p,String q)
{
super(n);
s_id=p;
address=q;
super.Pdata();
}
private void calculate()
{
if(wallarea<100)
if(colorcode<=2000&&colorcode>=1000)
charges=1200;
if(wallarea<200)
if(colorcode<=2500&&colorcode>=2001)
charges=1500;
if(wallarea>200)
if(colorcode<=3500&&colorcode>=2501)
charges=2000;
}
public void display()
{
calculate();
double k=(((18*charges)/100)+charges);
System.out.println("Final charges :- "+k);
super.Pview();
System.out.println("Store id :- "+s_id);
System.out.println("Address :- "+address);                                                                                                                                                                                         
}
}
class ptin
{
public static void main(String ar[]) throws Exception
{
Scanner ob=new Scanner(System.in);
DataInputStream obb=new DataInputStream(System.in);
System.out.println("Enter the wallarea , Store id , Address and Colorcode");
billing x1=new billing(Double.parseDouble(obb.readLine()),ob.nextLine(),obb.readLine());
x1.display();
}
}