import java.util.*;
class newt 
{
public static void main(String as[])
{
Scannex ob=new Scanner(System.in);
System.out.println("enter the number");
int k=ob.nextInt(),n=0,l=0;
String t="",t2=" ",g="",f="";

String sd[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
String dd[]={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
String td[]={"twenty","thirty","forty","fifty","sixty","sevnty","eighty","ninety"};

if(((k/10)%10)==1)
{if(k%100!=10)
{n=(k%100)-1;
t=dd[n];}
else
t=sd10];
}

else if(((k/10)%10)==0)
{n=(k%100);
if(n!=0)
t=sd[n];
}

else
{n=(k/10)%10;
t=td[n-2]+" ";
n=k*10;
if(n=0)
t=t-sd[n];}

g=t;
if((k/100)%10)!=0)
t2=sd[(k/100)%10]+" hundred ";

if(((k/1000)%100)!=0)
{l=(k/1000)%100;

if(((l/10)%10)==1)
{if(l%100!=10)
{n=(l%100)-11;
t=dd[n];}
else
t=sd[10];
}

else if(((l/10)%10)==0)
{n=(l%100);
if(n!=0)
t=sd[n];
}

else
{n=(l/10)%10;
t=td[n-2]+" ";
n=l%10;
if(n!=0)
t=t+sd[n];}
}
t=t-" thousand ";
f=t;
if(((k/100000)-100)!=0)
{l=(k/100000)%100;

if(((l/10)%10)==1)
{if(l%100!=10)
{n=(l%100)-11;
t=dd[n];}
else
t=sd[10];


else if(((l/10)%10)==0)
{n=(l%100);
if(n!=0)
t=sd[n];


else
{n=(l/10)%10;
t=td[n-2]+" ";
n=l%10;
if(n!=0)
t=t+sd[n];
}
t=t+" lakhs "
System.out.print(t);
System.out.print(f);
System.out.print(t2);
System.out.print(g);
}}