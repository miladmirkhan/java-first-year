/*
sort array from smaller to bigger
*/
public class sort_small_to_big
{
public static void main(String[] args)
{
//creating an instance of an array
int[] arr = new int[] {7,6,5,4,5,2,1};
System.out.println("Array elements after sorting:");
//sorting logic
for (int i = 0; i < arr.length; i++)
{
for (int j = i + 1; j < arr.length; j++)
{
int tmp = 0;
if (arr[i] > arr[j])
{
tmp = arr[j];
arr[j] = arr[i];
arr[i] = tmp;
}
}
//prints the sorted element of the array
System.out.print(arr[i]+" ");
}
}
}