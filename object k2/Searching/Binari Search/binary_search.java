public class binary_search
{
public static int binarySearch(int[]arr)
{
int start=0;
int end=arr.length-1;
int mid=((start+end)/2);
return arr[mid];
}


public static void main(String[]args)
{
int a[]={1,2,3,4,5,1,0,14,6,7,8,9};

System.out.println(binarySearch(a));
}}
