import java.util.*;
class rmat
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
int n=ob.nextInt(),a[][]=new int[n][n],x,y;
for(x=0;x<a.length;x++)
for(y=0;y<a[0].length;y++)
a[y][n-1-x]=ob.nextInt();
for(x=0;x<a.length;x++)
{
for(y=0;y<a[0].length;y++)
System.out.print(a[x][y]+" ");
System.out.println();
}
}
}