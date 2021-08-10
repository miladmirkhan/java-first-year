public class multiplie_Matrix
{
	public static void main(String[]args)
	{
		int a[][]={{3,2,3,2,3},
		           {2,3,2,3,2}};//(2 rows) 5 colomns

		int b[][]={{3,2},
				   {2,3},
		 	       {3,2},
		 	       {2,3},
		 	       {3,2}};//5 rows (2 colomns)

// for moltiplie the matrix (first matrix colomns = rows of second matrix )
// and the output will depends on(first matrix row =colomns of second matrix)


		     int c[][]=new int[2/*a rows*/][2/*b colomns*/];
		     int sum=0;

		for(int i=0;i<a.length/*c row(a row,b colomns)*/;i++)
		{
			for(int j=0;j<a.length/*c colomns(a row,b colomns)*/;j++)
			{
				for(int k=0;k<a[0].length/*a colomns(a colomns,b row)*/;k++)
				{
				sum=sum+a[i/*i*/][k]* b[k][j/*i*/];
			}
		     	c[i][j]=sum;
		     	sum=0;
     }}
			for(int i=0;i<2/*c row*/;i++)
			{
				for(int j=0;j<2/*c colomns*/;j++)
					System.out.print(c[i][j]+" ");
					System.out.println();
			}}
		}