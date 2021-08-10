class BinarySearchIteratively
{
public static int binarySearch(int arr[] , int first , int last , int key)
{
int mid=0;
while(first<=last)
{
mid=(first+last)/2;
if(arr[mid]==key)
return mid;
else if(arr[mid]<key)//key is greater than mid
first= mid+1;
else//key is less than mid
last= mid-1;
}//end while
return -1;
}
public static void main(String args[])
{
int arr[]={5,10,15,18,19,20,25};
int key=25;
System.out.println("the element is at index:"+binarySearch(arr,0,arr.length-1,key));
}
}