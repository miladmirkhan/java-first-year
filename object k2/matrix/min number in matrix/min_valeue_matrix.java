import java.util.Scanner;
public class min_valeue_matrix
{
public static int min(int a[][])
{
int temp=999999999;

for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++)

if(a[i][j]<temp)
temp=a[i][j];
}
return temp;
}

public static void main (String arfsdff[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter the number of mateix rows: ");
int a=in.nextInt();

System.out.println("enter the nummber of matrix colomns: ");
int b=in.nextInt();

int[][] matrix=new int [a][b];

for(int i=0;i<matrix.length;i++){
for(int j=0;j<matrix[0].length;j++)
 matrix[i][j]=in.nextInt();
 System.out.println();
}
for(int i=0;i<matrix.length;i++){
for(int j=0;j<matrix[0].length;j++)
System.out.print(matrix[i][j]+" ");
System.out.println();
}
System.out.println();
System.out.println(min(matrix));
}
}