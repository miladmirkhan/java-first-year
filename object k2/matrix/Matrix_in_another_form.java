import java.util.Scanner;
public class Matrix_in_another_form
{
public static void main(String[]args)
{
    int[][]a={{1,2,3,8,1,5},{8,3,4,3,2,2},{7,6,8,3,4,4},{6,5,4,3,6,7},{1,2,3,4,5,5},{9,8,7,6,5,3}};

     Scanner in=new Scanner (System.in);

       int x=in.nextInt();

    gr(a,x);
    for(int i=0;i<a.length;i++)
	{
	for(int j=0;j<a[0].length;j++)
     {
		 System.out.print(a[i][j]+" ");

	 } System.out.println();}

}

public static int[][]gr(int[][]a,int x)
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++)
{
if(i<j||i>j)
{
a[i][j]=x;
}
else if(i==j)
{
  a[i][j]=1;
	}
}
}
return a;
}}