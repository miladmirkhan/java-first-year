import java.util.Scanner;

public class matrix_transpose
{
public static int[][]transpost(int mat[][])// The method
{
	int [][] resoult=new int [mat[0].length/*colomn of mat is row of resoult*/][mat.length/*row of mat is colomn of resoult*/];
	for(int i=0;i<resoult.length;i++)//for rows of tranpose mat
      {
	   for(int j=0;j<resoult[0].length;j++)//for columns of tranpose mat

			resoult[i][j]=mat[j][i];
			/* the same thing if you change the(rows,colomns)
			resoult[j][i]=mat[i][j];
			*/
}
return resoult;
}

public static void main (String[]args)
{
Scanner in=new Scanner (System.in);
System.out.println("the number of rows: ");
int numberRows=in.nextInt();

System.out.println("the number of colomns: ");
int numberColomns=in.nextInt();


int matrix[][]=new int[numberRows][numberColomns];//the matrix
  System.out.println("enter the elements: ");
for(int i=0;i<matrix.length;i++)//for rows
{
    for(int j=0;j<matrix[0].length;j++)//for columns
    	 matrix[i][j]=in.nextInt();
    	System.out.println();
}

  System.out.println("The matrix you interd: ");

for(int i=0;i<matrix.length;i++)//for rows
{
    for(int j=0;j<matrix[0].length;j++)//for columns
    System.out.print(matrix[i][j]+" ");
    System.out.println();
}


 int   tran[][]=transpost(matrix);
System.out.println("the transpost matrix: ");
 for(int i=0;i<tran.length;i++)//for rows of tranpose mat or(int i=0;j<matrix[0].length;i++)
{
    for(int j=0;j<tran[0].length;j++)//for columns of tranpose mat or(int j=0;j<matrix.length;j++)

    System.out.print(tran[i][j]+" ");
    System.out.println();
    }

    }
    }
