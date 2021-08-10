public class binartsEARCH
{
public static int binarySearch(int a[],int key, int first, int last)
{
while(first<=last)
{
int mid=(first+last)/2;

if(a[mid]==key)
return mid;

else if(a[mid]<key)
return binarySearch(a,key,mid+1,last);

else if(a[mid]>key)
return binarySearch(a,key,first,mid-1);

}
return -1;
}
public static void main(String[]args)
{
int[]a={1,2,5,7,9,12,87};
System.out.println(binarySearch(a,87,0,a.length-1));
}
}