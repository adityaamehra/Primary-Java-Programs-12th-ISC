import java.util.*;
class spdf
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the atomic number");
int an=ob.nextInt(),t[][]=new int[7][],x,y,tx=0,ty=0,tan=0;
boolean b=true;
for(x=0;x<7;x++)
t[x]=new int[x+1];
for(x=0;x<t.length;x++)
for(y=0;y<t[x].length;y++)
t[x][y]=-1;
//FILLING THE 2-D MATRIX TILL ATOMIC NO. 20
a1:for(x=0;x<t.length;x++)
{
tx=x;
if(an>0)
{
if(b)
{
tx=x;
for(y=t[x].length-1;y>=0;y--)
{
ty=y;
while(ty>=0)
{
if(an>(4*ty+2))
{
t[tx][ty]=4*ty+2;
tan+=4*ty+2;
if(tan==20)
break a1;
an-=4*ty+2;
tx++;
}
else
{
t[tx][ty]=an;
tan+=an;
if(tan==20)
break a1;
an=0;
tx++;
}
ty--;
if(ty==0)
break;
}
}
b=false;
}
else
{
tx=x;
for(y=t[x].length-2;y>=0;y--)
{
ty=y;
while(ty>=0)
{
if(an>(4*ty+2))
{
t[tx][ty]=4*ty+2;
tan+=4*ty+2;
if(tan==20)
break a1;
an-=4*ty+2;
}
else
{
t[tx][ty]=an;
tan+=an;
if(tan==20)
break a1;
an=0;
}
tx++;
ty--;
if(ty==0)
break;
}
}
b=true;
x=-t[x].length+x+1;
}
}
}

//PRINTING
for(x=0;x<t.length;x++)
{
for(y=0;y<t[x].length;y++)
{
b=true;
System.out.print(t[x][y]+" ");
}
System.out.println();
}

an-=2;
System.out.println(an+" AAA "+tan);
//FILLING TILL ATOMIC NO. 21 AND ONWARDS
if(tan>=20)
for(x=2;x<t.length;x++)
{
if(x%2==0)
{
y=t[x].length-1;
System.out.println(y+" "+x+" "+an+" A");
}
else
{
y=t[x].length-2;
System.out.println(y+" "+x+" "+an+" B");
}
tx=x;
for(;y>=0;y--)
{
if(an<=0)
break;
ty=y;
System.out.println(ty+" C1 "+tx);
while(ty>=0)
{
if(an<=0)
break;
System.out.println(ty+" C2 "+tx);
if(an>(4*ty+2))
{
t[tx][ty]=4*ty+2;

an-=4*ty+2;
System.out.println(t[tx][ty]+" D "+an);
}
else
{
t[tx][ty]=an;
an=0;
System.out.println(t[tx][ty]+" E "+an+" "+tx+" "+ty);
}
ty--;
tx++;
}
}
}

//PRINTING
for(x=0;x<t.length;x++)
{
for(y=0;y<t[x].length;y++)
{
b=true;
System.out.print(t[x][y]+" ");
}
System.out.println();
}


/**
b=false;
for(x=0;x<t.length;x++)
{
for(y=0;y<t[x].length;y++)
{
if(t[x][y]>0)
{
b=true;
System.out.print(t[x][y]+" ");
}
}
if(b)
{
System.out.println();
b=false;
}
}**/


}
}