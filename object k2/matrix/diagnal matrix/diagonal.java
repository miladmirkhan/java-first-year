/*
E.x/ Write a method that takes a matrix as a parameter of type int and changes
the value of every element to 0 except diagonal elements. Test your method in a
complete java program.
The diagonal matrix must fit this form.
*/
import java.util.Scanner;
public class diagonal
{
 public static int[][] diagonal(int a[][])
   {
	for(int i=0;i<a.length;i++)//for rows element
   {
		for(int j=0;j<a[0].length;j++)//for colomns element
		if(i!=j)
		{
		a[i][j]=0;
		}
		}
		return a;
   }

public static void main(String []args)
{
	Scanner in=new Scanner(System.in);
	System.out.print("enter the number of Rows");
	int row=in.nextInt();
	System.out.print("enter the number of colomns");
	int col=in.nextInt();

	int matrix1[][]=new int [row][col];

	for(int i=0;i<matrix1.length;i++)
	{
		for(int j=0;j<matrix1[0].length;j++)
		matrix1[i][j]=in.nextInt();

		System.out.println();
    }

     diagonal(matrix1);
     	for(int i=0;i<matrix1.length;i++)
   		{
			for(int j=0;j<matrix1[0].length;j++)
           System.out.print(matrix1[i][j]+" ");
           System.out.println();
	   }

}}