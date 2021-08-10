public class sort
{
	public static int small(int []a,int t)
	{
		int index=t;
		int min=a[t];
		for(int i=0;i<a.length;i++)
		{if(min<a[i]){
	min=a[i];
	index=i;}

		}
		return index;
}
public static void main(String[]args)
{
int a[]={1,2,3,4,6,5,3,2,1,2,3,4};
sort(a);
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}
public static void sort(int a[])
{
	int small=0;
int temp=0;
for(int i=0;i<a.length;i++)
{
	small(a,i);

temp=a[small];
a[small]=a[i];
a[i]=temp;
}}

}


