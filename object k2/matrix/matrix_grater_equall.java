public class matrix_grater_equall
{
public static int [][]ac(int a[][])
{

/*

1,2,3
2,3,4
3,4,5

*/
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++)
{
if(i>j)
{
a[i][j]=0;
}
}
}
return a;
}
public static void main(String[]args)
{
int ax[][]={{1,2,3,1},
	        {4,5,6,3},
	        {7,4,9,2},
	        {7,4,9,2},
	        {7,4,9,2},
	        {7,4,9,2},
	        {7,4,9,2},
	        {7,4,9,2},
	        {7,4,9,2}};
	      System.out.println(ax.length);
	       System.out.println(ax[0].length);
ac(ax);
     for(int i=0;i<ax.length;i++)
          {
    	for(int j=0;j<ax[0].length;j++)
	{
System.out.print(ax[i][j]+" ");
}
System.out.println();
}
}

}