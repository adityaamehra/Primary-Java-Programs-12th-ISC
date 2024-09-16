import java.util.*;
class qs1
{
public void quicksort(int a[],int lo,int hi)
{
int l=lo;
int r=hi;
int m=a[(l+r)/2];
do
{
while(a[l]<m)
l++;
while(a[r]>m)
r--;
if(l<=r)
{
int t=a[l];
a[l]=a[r];
a[r]=t;
l++;
r--;
}
}while(l<=r);
if(l<hi)
quicksort(a,l,hi);
if(r>lo)
quicksort(a,lo,r);
}
}
class qs
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
qs1 y=new qs1();
System.out.println("Enter the size of the array");
int l=ob.nextInt(),a[]=new int[l];
for(int x=0;x<l;x++)
a[x]=ob.nextInt();
y.quicksort(a,0,(l-1));
for(int x=0;x<l;x++)
System.out.print(a[x]+" ");
}
}