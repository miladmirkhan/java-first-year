public class identity_matrix
{
	public static int[][] getIdentity(int a [][])
	{
	    int[][] matrix = new int[a.length][a[0].length];

	    for(int i = 0; i < a.length; i++)//rows
	    {
			for(int j=0;j<a[0].length;j++)//colomns
			if(i==j)
			{
	       matrix[i][j] = 1;
	       if(i<j||i>j)/*else*/
	       {
			   matrix[i][j]=0;
		   }
	       }
	       }
 return matrix;
}

public static void main(String []args)
{
 int a[][] = {{1, 0, 0},{9, 6, 4},{2, 2, 1}};

int c[][]=getIdentity(a);

for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[0].length;j++)
	System.out.print(c[i][j]+" ");
	System.out.println();
}

}

}