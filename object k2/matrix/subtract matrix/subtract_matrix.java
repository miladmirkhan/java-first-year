public class subtract_matrix
{
public static int[][]sub(int a[][],int b[][])
{
	int c[][]=new int[a.length][a[0].length];

 	for(int i=0;i<a.length;i++)//for rows element
    {
 		for(int j=0;j<a[0].length;j++)//for colomns element
 		c[i][j]=a[i][j]-b[i][j];
    }
 		return c;
    }



 public static void main(String arfsddf[])
 {
 int a[][]={{2,2,3,4},
			{2,3,4,4}};

			System.out.println("your first matrix is: ");
 for(int i=0;i<a.length;i++)
 {
	 for(int j=0;j<a[0].length;j++)
	 System.out.print(a[i][j]+" ");
	 System.out.println();
 }

 int b[][]={{6,7,8,9},
 			{4,5,6,7}};

 			System.out.println("your secound matrix is: ");
 for(int i=0;i<b.length;i++)
 {
	 for(int j=0;j<b[0].length;j++)
	 System.out.print(b[i][j]+" ");
	 System.out.println();
 }
 int matrix[][] =sub(a,b);
System.out.println("you resoult of subtraction is: ");
 for(int i=0;i<matrix.length;i++)
 {
 for(int j=0;j<matrix[0].length;j++)

 System.out.print(matrix[i][j]+" ");
 System.out.println();
}
 }}