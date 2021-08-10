
public class LinearSearch
{
public static int linearSearch(int key,int array[])
{
for(int i=0;i<array.length;i++)
if(key==array[i])
return i;
return -1;
}
public static void main(String[]args)
{
int[]a={0,4,3,5,4,5,4,3,4,5,1,2,5};

System.out.println(linearSearch(2,a));
}
}