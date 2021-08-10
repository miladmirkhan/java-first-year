/*
Q/ Write a method that takes an array as a parameter and returns the last number in the array.
*/
public class last_array_element
{
public static void main(String []args)
{
int a[]={1,2,1,2,3,4,5,6};
System.out.println(a.length);
System.out.println(c(a));
}
public static int c(int b[])
{
    return b[b.length-1];//for 2 last element return b[b.length-2];
}

}