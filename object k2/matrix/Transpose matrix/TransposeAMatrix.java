import java.util.Scanner;
class TransposeAMatrix
{
  public static void main(String args[])
  {
    int rows, coloms, i, j;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns of matrix");
   rows = in.nextInt();
    coloms = in.nextInt();

    int matrix[][] = new int[rows][coloms];

    System.out.println("Enter elements of the matrix");

    for (i = 0; i < rows; i++)
      for (j = 0; j < coloms; j++)
        matrix[i][j] = in.nextInt();

    int transpose[][] = new int[coloms][rows];

    for (i = 0; i < rows; i++)
      for (j = 0; j < coloms; j++)
        transpose[j][i] = matrix[i][j];

    System.out.println("Transpose of the matrix:");

    for (i = 0; i < coloms; i++)
    {
      for (j = 0; j < rows; j++)
        System.out.print(transpose[i][j]+"\t");

      System.out.print("\n");

    }
  }
}