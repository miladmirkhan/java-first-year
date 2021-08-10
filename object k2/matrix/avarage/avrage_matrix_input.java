import java.util.Scanner;

public class avrage_matrix_input
{
public static int avarage(int a[][])
{
int temp=0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++){
temp=temp+a[i][j];
}}
temp=temp/(a.length*a[0].length);
return temp;
}

public static void main(String []args)
{
Scanner in=new Scanner(System.in);
System.out.println("enter the number of rows: ");
int a1=in.nextInt();

System.out.println("enter the number of colomns:");
int a2=in.nextInt();

int a[][]=new int[a1][a2];
System.out.println();

for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++)
a[i][j]=in.nextInt();
System.out.println();
}
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++)
System.out.print(""+a[i][j]+" ");
System.out.println();
}

System.out.println("the avarage number of all array element is: "+avarage(a) );
}
}
