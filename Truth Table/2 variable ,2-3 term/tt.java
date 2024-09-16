import java.util.*;
class tt
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the expression");
String exp=(ob.nextLine()).toUpperCase();
StringTokenizer st=new StringTokenizer(exp,".'+");
int n[][],sa=0,sb=0,x,y,t1=0,t2=0,t3=0,cv=0;
for(x=0;x<exp.length();x++)
for(y='A';y<='Z';y++)
if(exp.charAt(x)==y)
cv++;
System.out.println(cv);
n=new int [2+cv+st.countTokens()][4];
boolean ba=true,bb=true;
for(x=0;x<n.length;x++)
for(y=0;y<n[0].length;y++)
n[x][y]=-1;
if(exp.indexOf('A')>=0)
System.out.print("A\t");
if(exp.indexOf('B')>=0)
System.out.print("B\t");
for(x=0;x<4;x++)
{
if(exp.indexOf('A')>=0)
{
t3++;
if(ba)
{
n[0][x]=0;
sa++;
if(sa==2)
ba=false;
}
else
{
n[0][x]=1;
sa--;
if(sa==0)
ba=true;
}
}
if(exp.indexOf('B')>=0)
{
t3++;
if(bb)
{
n[1][x]=0;
sb++;
if(sb==1)
bb=false;
}
else
{
n[1][x]=1;
sb--;
if(sb==0)
bb=true;
}
}
}
t3/=4;
bb=true;
ba=true;
t3++;
int pl;
//INITIALIZATIONS COMPLETE
String or[]=exp.split("[+]"),and[],not;
if(or.length<=2)
pl=2;
else
pl=1;
for(x=0;x<or.length;x++)
{
and=or[x].split("[.]");
for(y=0;y<and.length;y++)
{
not=and[y];
for(int z=0;z<not.length();z++)
{
if(not.charAt(z)=='\''&&not.charAt(z-1)=='A')
{
System.out.print("A'\t");
if(ba)
t3++;
ba=false;
for(int h=0;h<4;h++)
{
if(n[0][h]==0)
n[2][h]=1;
else
n[2][h]=0;
}
}
if(not.charAt(z)=='\''&&not.charAt(z-1)=='B')
{
System.out.print("B'\t");
if(bb)
t3++;
bb=false;
for(int h=0;h<4;h++)
{
if(n[1][h]==0)
n[3][h]=1;
else
n[3][h]=0;
}
}
}
}
}
and=exp.split("[.]");
//NOTTING DONE
if(and.length>1)
for(x=0;x<or.length;x++)
{
for(int z=0;z<or[x].length();z++)
{
if(or[x].charAt(z)=='.')
{
if(or[x].substring(0,z).equalsIgnoreCase("A'"))
{
t1=2;
System.out.print("A\'.");
}
if(or[x].substring(0,z).equalsIgnoreCase("B'"))
{
t1=3;
System.out.print("B\'.");
}
if(or[x].substring(0,z).equalsIgnoreCase("A"))
{
t1=0;
System.out.print("A.");
}
if(or[x].substring(0,z).equalsIgnoreCase("B"))
{
t1=1;
System.out.print("B.");
}
if(or[x].substring(z+1,or[x].length()).equalsIgnoreCase("A'"))
{
t2=2;
System.out.print("A\'\t");
}
if(or[x].substring(z+1,or[x].length()).equalsIgnoreCase("B'"))
{
t2=3;
System.out.print("B\'\t");
}
if(or[x].substring(z+1,or[x].length()).equalsIgnoreCase("A"))
{
t2=0;
System.out.print("A\t");
}
if(or[x].substring(z+1,or[x].length()).equalsIgnoreCase("B"))
{
t2=1;
System.out.print("B\t");
}
}
}
for(int h=0;h<4;h++)
{
if(n[t1][h]==1 && n[t2][h]==1)
n[t3][h]=1;
else
n[t3][h]=0;
}
t3++;
}
//ANDING DONE
t1=-1;
t2=-1;
if(or.length>1)
{
for(x=0;x<exp.length();x++)
{
if(exp.charAt(x)=='+')
{
t1=-1;
t2=-1;
int j=exp.length();
for(int k=x+1;k<exp.length();k++)
{
if(exp.charAt(k)=='+')
{
j=k;
break;
}
}
if(exp.substring(0,x).equalsIgnoreCase("A"))
{
t1=0;
System.out.print("A+");
}
if(exp.substring(0,x).equalsIgnoreCase("B"))
{
t1=1;
System.out.print("B+");
}
if(exp.substring(0,x).equalsIgnoreCase("A'"))
{
t1=2;
System.out.print("A\'+");
}
if(exp.substring(0,x).equalsIgnoreCase("B'"))
{
t1=3;
System.out.print("B\'+");
}
if(exp.substring(x+1,j).equalsIgnoreCase("A"))
{
t2=0;
System.out.print("A\t");
}
if(exp.substring(x+1,j).equalsIgnoreCase("B"))
{
t2=1;
System.out.print("B\t");
}
if(exp.substring(x+1,j).equalsIgnoreCase("A'"))
{
t2=2;
System.out.print("A\'\t");
}
if(exp.substring(x+1,j).equalsIgnoreCase("B'"))
{
t2=3;
System.out.print("B\'\t");
}
for(int p=0;p<4;p++)
{
if(n[t1!=-1?t1:t3-pl][p]==1 || n[t2!=-1?t2:t3-1][p]==1)
n[t3][p]=1;
else
n[t3][p]=0;
}
t3++;
}
}
}
System.out.print(exp);
System.out.println();
for(x=0;x<4;x++)
{
for(int z=0;z<n.length;z++)
if(n[z][x]!=-1)
System.out.print(n[z][x]+"\t");
System.out.println();
}
}
}