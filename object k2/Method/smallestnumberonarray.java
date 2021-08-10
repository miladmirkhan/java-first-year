public class smallestnumberonarray
{
	//-------------------------------------------------------------
	public static int smallar(int b[])
	{int temp=0 ;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]<temp)
			temp=b[i];
		}

		return temp;
	}
	//--------------------------------------------------------------------
	public static int smallar1(int b[])
	{
		int temp=0;
		for(int t=0;t<b.length;t++)
		{
			if(temp>b[t])
			temp=b[t];
		}
		return temp;
		}

	public static int biggestar(int a[])
	{
		int temp=0;
		for(int i =0;i <a.length;i++)
		{
			if(a[i]>temp)
			temp=a[i];
	}
	return temp;
}

	//---------------------------------------------------------------------
    public static void main(String []fsdfghj)
    {
		int[]x={8,-3,4,5,6,7,-5,-4,-3,-34};
		System.out.println("your smallest array is : ");
		System.out.println(smallar(x));
		System.out.println("your smallest array is : ");
		System.out.println(smallar1(x));
		System.out.println("your biggest array is : ");
		System.out.println(biggestar(x));

	}
}