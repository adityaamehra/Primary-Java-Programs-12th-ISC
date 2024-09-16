class sort
{
public static void main( String args[])
DataInputStream ob=new DataInputStream(System.in);
int n,i,k[];
System.out.println("enter total amount of numbers");
n=Integer.parseInt(ob.readLine());
k=new int[n];
for(i=0;i<n;i++)
System.out.println("enter number");
k[i]=Integer.parseInt(ob.readLine());
sort();
for(i=0;i<n;i++)
{


 