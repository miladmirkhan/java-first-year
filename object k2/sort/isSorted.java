/*
QA/ Write a predicate method (whose return value is either true or false)
that takes an int array as a parameter and returns true if the array is sorted
in ascending order. Test your method in a complete java program.
*/
public class isSorted
{
public static boolean isSor(int[] array)
{
	 for (int i = 0; i < array.length - 2; i++)
	    {
	        if (array[i] > array[i + 1])
	            return false;
	    }
	    return true;
}

public static boolean isSortedInascendingOrder(int a[])
{
	for(int i=a.length-1;i>=0;i--)
	{
		if(a[a.length-1]<a[a.length-2])
		return true;
	}
return false;
}

public static void main(String[] args)
{
    int ar[] = {0,123,2,3,4};
    System.out.println(isSor(ar));
    int b[]={5,4,3,2,1};
System.out.println(isSortedInascendingOrder(b));
}
}