import java.util.Scanner;

public class matrix
{
public static void main(String []argfs)
{
Scanner in=new Scanner(System.in);

System.out.println("Enter the number of rows in matrix : ");
int row=in.nextInt();

System.out.println("Enter the number of colomns in matrix : ");
int colomns=in.nextInt();

int matrix[][]=new int [row/*rows*/][colomns/*colomns*/];

for(int i=0;i<matrix.length;i++)//for rows
{
	for(int j=0;j<matrix[0].length;j++)//for colomns

   matrix[i][j]=in.nextInt();//input the element of matrix
   System.out.println(" ");
}
System.out.println("Your inputed elements : ");
for(int i=0;i<matrix.length;i++)
{
	for(int j=0;j<matrix[0].length;j++)

		System.out.print(matrix[i][j]+" ");
      System.out.println();

}
////////////////////////////////////////////////////////////////////////////////

int matrix1[][]=new int[2][3];

matrix1[0][0]=1;
matrix1[0][1]=2;
matrix1[0][2]=3;
matrix1[1][0]=1;
matrix1[1][1]=1;
matrix1[1][2]=1;

System.out.println("The matrix element : ");
for(int i=0;i<matrix1.length;i++)
{
	for(int j=0;j<matrix1[0].length;j++)
	System.out.print(matrix1[i][j]+" ");

	System.out.println();
}
System.out.println("The Identity Matrix is : ");
for(int i=0;i<matrix1.length;i++)
{
	for(int j=0;j<matrix1[0].length;j++)
	if(i==j){
	System.out.print(matrix1[i][j]+" ");}
	else{System.out.print(0+" ");}
	System.out.println();
}

}}