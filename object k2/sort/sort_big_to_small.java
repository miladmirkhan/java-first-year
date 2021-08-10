/*
sort array from bigger to smaller
*/
public class sort_big_to_small
{
public static void main(String[] args)
{
//creating an instance of an array
int[] arr ={78, 34, 1, 3, 65, 2, -1, -4, 6, 55, 20, -65};
System.out.println("Array elements after sorting:");
//sorting logic
for (int i = 0; i < arr.length; i++)
{
for (int j = i + 1; j < arr.length; j++)
{
int tmp = 0;
if (arr[j] > arr[i])
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