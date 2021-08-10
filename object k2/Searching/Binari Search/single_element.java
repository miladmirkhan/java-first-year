public class single_element
{
public static int BS(int[]a,int key,int l ,int h)
{
	while(l<=h)
{
int mid=(l+h)/2;

if(a[mid]==key)
return mid;

else if(a[mid]<key)
return BS(a,key,mid+1,h);

else if(a[mid]>key)
return BS(a,key,l,mid-1);

}
return -1;}

public static void main(String[]args)
{
int[]a={1,2,3,4,5,6,7,8,9};
System.out.println(BS(a,9,0,a.length-1));
}}