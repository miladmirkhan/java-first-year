/*
Q2/ Write a method that takes two matrices, multiplies the two matrices, puts
the result into a new matrix and returns it. Test your method in complete java
program, read the sizes and elements of the arrays from the user.
*/
import java.util.Scanner;
public class multiplies_matrix_input
{
public static int[][] multiplies_matrix(int[][]a,int[][]b)
{
	// for moltiplie the matrix (first matrix colomns = rows of second matrix )
    // and the output will depends on(first matrix row = colomns of second matrix)

	 int[][]c=new int[a.length/*a rows*/][b[0].length/*b colomns*/];
     int sum=0;

	  for(int i=0;i<a.length/*c row(a row,b colomns)*/;i++)
	  {
		for(int j=0;j<a.length/*c colomns(a row,b colomns)*/;j++)
		{
			for(int k=0;k<a[0].length/*(a colomns,b row) */;k++)
			{
                  /*

                  */
			sum=sum+(a[i/*a(row)*/][k/*a(colomns)*/] *b[k/*b(rows)*/][j/*b(colomns)*/]);

    }
            c[i/*c(row)*/][j/*c(colomns)*/]=sum;
			sum=0;//you shoud empty the sum other ways it will sum all multiplition

    }

    }
		        return c;
    }

public static void main(String[]args)
{
	Scanner in=new Scanner (System.in);

	System.out.println("Enter the rows of first matrix (shoud be equals to number of second colomns):");
	int a=in.nextInt();

	System.out.println("Enter the colomns of first matrix(shoud be equals to number of secound rows) :");
	int b=in.nextInt();

	int[][]matrix1=new int[a][b];
	for(int i=0;i<matrix1.length;i++)
	{
		for(int j=0;j<matrix1[0].length;j++)
		 matrix1[i][j]=in.nextInt();
		 System.out.println();//i make an empty line to seprate rows
	}
		for(int i=0;i<matrix1.length/*a raws*/;i++)
	{
		for(int j=0;j<matrix1[0].length/*a coloms*/;j++)
	     System.out.print(matrix1[i][j]+" ");
	     System.out.println();
   }

   System.out.println("Enter the rows of secound matrix(shouls be equals to colomns of first matrix):");
   	int x=in.nextInt();

   	System.out.println("Enter the colomns of secound matrix(shoud be equals rows of first matrix) :");
   	int y=in.nextInt();

   	int[][]matrix2=new int[x][y];
   	for(int i=0;i<matrix2.length;i++)
   	{
   		for(int j=0;j<matrix2[0].length;j++)
   		 matrix2[i][j]=in.nextInt();
   		 System.out.println();//i make an empty line to seprate rows
   	}

   		for(int i=0;i<matrix2.length/*b rows*/;i++)
   	{
   		for(int j=0;j<matrix2[0].length/*b colomns*/;j++)
   	   System.out.print(matrix2[i][j]+" ");
   	   System.out.println();
   }
System.out.println("Your multiple matrix equals to :");

   int c[][]=multiplies_matrix(matrix1,matrix2);//method
    for(int i=0;i<c.length/*c row*/;i++)
    {
   	for(int j=0;j<c[0].length/*c colomns*/;j++)

      	   System.out.print(c[i][j]+" ");
   	   System.out.println();
}
}}



