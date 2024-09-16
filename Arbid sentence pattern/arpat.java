import java.util.*;
class arpat
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the choice \n1.)More complex\n2.)Easy");
int ch=ob.nextInt();
switch(ch)
{
case 1:
arpat1 x1=new arpat1();
x1.arpat11();
break;
case 2:
arpat2 x2=new arpat2();
x2.arpat22();
break;
default:
System.out.println("Enter a valid input");
}
}
}