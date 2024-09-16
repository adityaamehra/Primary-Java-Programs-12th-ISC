import java.util.*;
class ttt
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the dimensions of the play area");
int r=ob.nextInt(),c=ob.nextInt(),fa[]=new int[c],x,pc=0,s,lic1=0,lic2=0,lir1=0,lir2=0,tr=0,tc=0,wc=0,temp=1,pr=0,nn=0;
char pa[][]=new char[r][c],fc='O',sc='X';
boolean b=true;
System.out.println("Enter the no. of X's to check for");
nn=ob.nextInt()-1;
while(true)
{
if(b)
{
while(true)
{
System.out.println("Player 1 enter the column and row");
pr=ob.nextInt()-1;
pc=ob.nextInt()-1;
try{
pa[pr][pc]=fc;
lir1=pr;
lic1=pc;
fa[pc]++;
b=false;
break;
}catch(Exception p)
{
System.out.println("Enter exceptable value");
}
}
}
else
{
while(true)
{
System.out.println("Player 2 enter the column and row");
pr=ob.nextInt()-1;
pc=ob.nextInt()-1;
try{
pa[pr][pc]=sc;
lir2=pr;
lic2=pc;
fa[pc]++;
b=true;
break;
}catch(Exception p)
{
System.out.println("Enter exceptable value");
}
}
}
for(s=0;s<r;s++)
{
for(x=0;x<c;x++)
if(pa[s][x]!='\u0000')
System.out.print("|"+pa[s][x]+"|");
else
System.out.print("|_|");
System.out.println();
}//all correct till here
//CHECKING
if(!b)
{

tr=lir1;tc=lic1;
try{
for(x=lic1-1;x>=0;x--)
if(pa[tr][x]==fc)
wc++;
for(x=lic1+1;x<(pa[0].length);x++)
if(pa[tr][x]==fc)
wc++;
if(wc==nn)
{
System.out.print(fc+" won");
System.exit(0);
}
wc=0;
}catch(Exception p){}

tr=lir1;tc=lic1;
try{
for(x=lir1-1;x>=0;x--)
if(pa[x][tc]==fc)
wc++;
for(x=lir1+1;x<(pa.length);x++)
if(pa[x][tc]==fc)
wc++;
if(wc==nn)
{
System.out.print(fc+" won");
System.exit(0);
}
wc=0;
}catch(Exception p){}

tr=lir1;tc=lic1;
try{
for(x=lic1-1;x>=0;x--)
if(pa[--tr][x]==fc)
wc++;
tr=lir1;
for(x=lic1+1;x<(pa[0].length);x++)
if(pa[++tr][x]==fc)
wc++;
if(wc==nn)
{
System.out.print(fc+" won");
System.exit(0);
}
wc=0;
}catch(Exception p){}

tr=lir1;tc=lic1;
try{
for(x=lir1-1;x>=0;x--)
if(pa[x][--tc]==fc)
wc++;
tc=lic1;
for(x=lir1+1;x<(pa.length);x++)
if(pa[x][++tc]==fc)
wc++;
if(wc==nn)
{
System.out.print(fc+" won");
System.exit(0);
}
wc=0;
}catch(Exception p){}

}
else
{


tr=lir2;tc=lic2;
try{
for(x=lic2-1;x>=0;x--)
if(pa[tr][x]==sc)
wc++;
for(x=lic2+1;x<(pa[0].length);x++)
if(pa[tr][x]==sc)
wc++;
if(wc==nn)
{
System.out.print(sc+" won");
System.exit(0);
}
wc=0;
}catch(Exception p){}

tr=lir2;tc=lic2;
try{
for(x=lir2-1;x>=0;x--)
if(pa[x][tc]==sc)
wc++;
for(x=lir2+1;x<(pa.length);x++)
if(pa[x][tc]==sc)
wc++;
if(wc==nn)
{
System.out.print(sc+" won");
System.exit(0);
}
wc=0;
}catch(Exception p){}

tr=lir2;tc=lic2;
try{
for(x=lic2-1;x>=0;x--)
if(pa[--tr][x]==sc)
wc++;
tr=lir2;
for(x=lic2+1;x<(pa[0].length);x++)
if(pa[++tr][x]==sc)
wc++;
if(wc==nn)
{
System.out.print(sc+" won");
System.exit(0);
}
wc=0;
}catch(Exception p){}

tr=lir2;tc=lic2;
try{
for(x=lir2-1;x>=0;x--)
if(pa[x][--tc]==sc)
wc++;
tc=lic2;
for(x=lir2+1;x<(pa.length);x++)
if(pa[x][++tc]==sc)
wc++;
if(wc==nn)
{
System.out.print(sc+" won");
System.exit(0);
}
wc=0;
}catch(Exception p){}

}
for(x=0;x<r;x++)
for(s=0;s<c;s++)
if(pa[x][s]=='\u0000')
temp++;
if(temp==0)
{
System.out.println("No one wins");
System.exit(0);
}
temp=0;
}//main while loop
}//these two are neccessary
}
