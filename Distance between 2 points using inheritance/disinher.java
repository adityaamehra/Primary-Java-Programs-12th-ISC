import java.util.*;
class d2point
{
protected double x,y;
public d2point(double mx,double my)
{
x=mx;
y=my;
}
public double distance2d(d2point a)
{
double d2d=Math.sqrt(Math.pow((a.x-x),2)+Math.pow((a.y-y),2));
return (d2d);
}
}
class d3point extends d2point
{
private double z;
public d3point(double nx,double ny,double nz)
{
super(nx,ny);
z=nz;
}
public double distance3d(d3point b)
{
double d3d=Math.sqrt(Math.pow((b.x-x),2)+Math.pow((b.y-y),2)+Math.pow((b.z-z),2));
return (d3d);
}
}
class disinher
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
d2point x1,x2;
System.out.println("Enter 1 set of points for 2 points");
x1=new d2point(ob.nextDouble(),ob.nextDouble());
System.out.println("Enter 2 set of points for 2 points");
x2=new d2point(ob.nextDouble(),ob.nextDouble());
System.out.println("Distance 2d is :- "+x1.distance2d(x2));
d3point y1,y2;
System.out.println("Enter 1 set of points for 3 points");
y1=new d3point(ob.nextDouble(),ob.nextDouble(),ob.nextDouble());
System.out.println("Enter 2 set of points for 3 points");
y2=new d3point(ob.nextDouble(),ob.nextDouble(),ob.nextDouble());
System.out.println("Distance 3d is :- "+y1.distance3d(y2));
}
}