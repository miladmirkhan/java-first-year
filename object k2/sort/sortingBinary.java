/*
sorting from bigger to smallest
*/
public class sortingBinary
{
public static void binarySort(int a[])
{
int i,j,temp;
for(i=0;i<a.length;i++)
{
	for(j=i+1;j<a.length;j++)
	{
if(a[i]<a[j])
{          // a[i]=96, a[j]=101, temp=0
temp=a[i];//  temp=96, a[i]=0
a[i]=a[j];//  a[i]=101, a[j]=0
a[j]=temp;//  a[j]=96, temp=0
}
}
}}
/*
or

public static void binarySort(int a[])
{
int i,j,temp;
for(i=0;i<a.length-1;i++)
{

if(a[i]<a[i+1])

{          // a[i]=96, a[j]=101, temp=0
temp=a[i];//  temp=96, a[i]=0
a[i]=a[i+1];//  a[i]=101, a[j]=0
a[i+1]=temp;// a[j]=96, temp=0
}

}}
*/
public static void main(String[]args)
{
int[]a={96,-1,-435,101,5,7,0,12,87,976};
binarySort(a);
for(int i=0;i<a.length;i++)
System.out.print(a[i]+" ");
}
}
/*
for sorting from smalest ro biggest
public static void binarySort(int a[])
{
int i,j,temp;
for(i=0;i<a.length;i++)
{
	for(j=i+1;j<a.length;j++)
	{
if(a[i]>a[j])

{
temp=a[i];//  temp=96, a[i]=0
a[i]=a[j];//  a[i]=87, a[j]=0
a[j]=temp;// a[j]=96, temp=0
}
}
}}
*/