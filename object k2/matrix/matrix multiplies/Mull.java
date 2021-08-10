public class Mull
{
public static void main (String[]args)
{
int a[][]={{2,2},
	       {2,2},
	       {2,2}};

int b[][]={{2,2,2},
	       {2,2,2}};

int c[][]=new int[a.length][b[0].length];
int sum=0;

for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
for(int k=0;k<a[0].length;k++)
{
 sum=sum+(a[i][k]*b[k][j]);
}
    c[i][j]=sum;sum=0;
}

}

for(int i=0;i<c.length;i++)
{
for(int j=0;j<c[0].length;j++)
{
System.out.print(c[i][j]+" ");

}System.out.println();
}

}
}