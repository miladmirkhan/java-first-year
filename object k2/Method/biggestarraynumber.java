public class biggestarraynumber
{
	///////////////////////////////////////////////////////
	public static int biggestarray(int b[])
	{
		int temp=0;
	  for(int i=0;i<b.length;i++)
	  {
		  if(b[i]>temp)
		  temp=b[i];
	  }
      return temp;
}
//////////////////////////////////////////////////////////////
public static void main(String [] ajbkkrgs)
{
int[]x={8,-3,4,5,6,7,-5,-4,-3,-34};

System.out.println("your biggest array is : "+biggestarray(x));

}
}





