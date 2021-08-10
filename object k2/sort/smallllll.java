public class smallllll
{
public static int BS(int[]a,int l)
{
int index=l;
int min=a[index];

for(int i=l+1;i<a.length;i++)
{
if(min>a[i])
{
min=a[i];
index=i;
}
}
return index;}
public static void main(String[]args)
{
int[]a={54,2,1,0,32,23,54,5,6,7,8,9};

System.out.println(BS(a,0));
}
}