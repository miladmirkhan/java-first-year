/*
E.x/ Write a method that takes two matrices, add the two matrices, puts the result
into the first matrix and returns it. Test your method in complete java program,
read the size and elements of the arrays from the user.
*/
import java.util.Scanner;
  public class Matrix_Addition
   {
    public static int [][] addition(int a[][],int b[][])
   {
	for(int i=0;i<a.length;i++)//for rows element
   {
		for(int j=0;j<a[0].length;j++)//for colomns element
		a[i][j]=a[i][j]+b[i][j];
   }
		return a;
   }

  public static void main(String[]arfs)
{
Scanner in=new Scanner(System.in);
System.out.print("Enter nomber  of rows: ");
int a=in.nextInt();

System.out.print("Enter nomber  of colomns: ");
int b=in.nextInt();
//////////////////////////////////////////////////
//first matrix
int matrix[][]=new int[a][b];

System.out.println("Enter element: ");
for(int i=0;i<matrix.length;i++)
 {
    for(int j=0;j<matrix[0].length;j++)
    matrix[i][j]=in.nextInt();
    System.out.println();
 }
//////////////////////////////////////////////////////
//second matrix
int matrix1[][]=new int[a][b];

System.out.println("Enter element : ");
for(int i=0;i<matrix1.length;i++)
{
    for(int j=0;j<matrix1[0].length;j++)
    matrix1[i][j]=in.nextInt();
    System.out.println();
}
//the method
matrix=addition(matrix,matrix1);

//output the method
System.out.println("your resoult is :");
for(int i=0;i<matrix.length;i++)
{
	for(int j=0;j<matrix[0].length;j++)
System.out.print(matrix[i][j]+" ");
System.out.println();
}
}
}