import java.util.*;
interface x
{
public void out();
}
class y implements x
{
protected int a;
public void out()
{
System.out.println("In y");
}
public void in()
{
System.out.println("Taking an input");
Scanner ob=new Scanner(System.in);
a=ob.nextInt();
System.out.println(a);
}
}
class z extends y
{
private int b;
public void out()
{
System.out.println("In z");
}
public void a()
{
System.out.println("Parent nahi chala payega yaaay");
}
public void in()
{
Scanner ob=new Scanner(System.in);
a=ob.nextInt();
b=ob.nextInt();
System.out.println(a+" "+b);
}
}
class inher
{
public static void main(String ar[])
{
y y1=new z();
z z1=new z();
y1.out();
y1.in();
y y2=new y();
y2.out();
y2.in();
}
}