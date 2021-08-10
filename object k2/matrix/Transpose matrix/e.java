public class e
{
public static int[][]arraytr(int a[][])
{
int b[][]=new int[a[0].length][a.length];

for(int i=0;i<b.length;i++)
for(int j=0;j<b[0].length;j++)
{
b[i][j]=a[j][i];
}
return b;
}

public static void main(String[]absd)
{
int[][]a={  {1,2},
			{2,1},
			{4,5},
			{0,9}};

     arraytr(a);

for(int i=0;i<a[0].length;i++){
for(int j=0;j<a.length;j++)

 System.out.print(a[j][i]+" ");
  System.out.println();
  }
  }
}