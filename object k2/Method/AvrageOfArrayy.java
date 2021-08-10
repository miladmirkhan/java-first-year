/* Write a java method that takes an array as a parameter and returns
average of the array elements. Test your method in a complete java
program.
*/
public class AvrageOfArrayy
{
public static double method(int array[])
{
double sum=0;

for(int i=0;i<array.length;i++){
sum=sum+array[i];}
double v=(sum/array.length);

return v;
}
public static void main(String str[])
{
int array[]={2,4,1,5,7,0};
System.out.println(array.length);
System.out.println(method(array));
}
}