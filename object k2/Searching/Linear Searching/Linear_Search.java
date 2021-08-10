public class Linear_Search
{
	public static int index(int a,int[]b)
	{
		for(int i=0;i<b.length;i++)
		    {
			if(b[i]==a)
			return i;
			}
			return -1;
	}

	public static int index(int[]b,int a)
		{
			for(int i=0;i<b.length;i++)
			    {
				if(b[i]==a)
				return i;
		     	}
				return -1;
     	}

public static void main(String []args)
{
	int []array={2,3,5,34,34,3,4,1123,11,43,23,2,524,5};

	System.out.println(index(34,array));



}}