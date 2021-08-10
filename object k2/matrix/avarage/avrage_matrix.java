public class avrage_matrix
{
public static double avrage(int[][]a)
{
double temp=0;

for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++)
temp=temp+a[i][j];
}
temp= temp/(a[0].length*a.length);
return temp;
}
public static void main(String[]args)
{
int[][]a={{2,2,73,79},{2,2,2,2}};
System.out.println(avrage(a));
}}
