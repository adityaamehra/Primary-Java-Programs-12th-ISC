import java.util.*;
class program
{public static void main(String ag[])
{Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements");
int m=sc.nextINt();
int a[]=new int[m];
for(int x=0;x<m;x++)
{a[x]=sc.nextInt();}

for(int x=0;x<m;x++)
{int i=arrange(a[x],a[x+1]);
 }


for(int x=0;x<m;x++)
{System.out.print(a[x]);}
}


static int arrange(int f,int y)
{
int j=f;
int l=y;
int t=f;
int m1=0;
int g=0,n=0;
while(t!=0)
{m1=t%10;
t=t/10;
g++;
}

t=l;
int m2=0;
while(t!=0)
{m2=t%10;
t=t/10;
n++;}

if(m1>m2)
return j;
else if(m2>m1)
return l;
else if(m2=m1)
arrange(j%(Math.pow(10,g-1),l%(Math.pow(10,n-1))

}


}

