public class max_valeue_matrix
{
public static int max(int a[][])
{
int temp=0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++)
if(a[i][j]>temp)
 temp=a[i][j];
}
return temp;
}

public static void main(String args[])
{
int a[][]={{2,3,4,5,6,7,8,9,1},
           {4,4,5,5,2,32,4,4,56}};
System.out.println("you biggest number is matrix: "+max(a));

}}