
public class Sortarray
{
	public static void sort(int array[])
	{
		int small;
	for(int i=0;i<array.length-1 ;i++)
     	{
	 small=smallest(array,i);

	//swap
	int temp = array[small];
	    array[small] =array[i];
	    array[i] =temp;
     	}
    }
	public static int smallest(int[]a ,int from)
	{
		int min=a[from];
		int index=from;
	for(int j=from+1/*we +1 to not comper to it self */ ; j<a.length ;j++)
	{
		if(a[j]<min)
		{
			min=a[j];//swap the a[j](content) to min
			index=j;//swap j(index) to index
		}
	}
		return index;
	}

public static void main(String[]args)
{int []a={1,2,8,3,5,1,9,8,4334,12};

System.out.println("the original array: ");
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");

}System.out.println();
sort(a);
System.out.println("the sorted array: ");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");


}System.out.println();
}

}
