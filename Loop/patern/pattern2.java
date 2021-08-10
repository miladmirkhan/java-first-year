import java.util.Scanner;
public class pattern2
{
public static void main(String[] sfjk)
{
	Scanner in=new Scanner(System.in);
System.out.println("how many stars you want");
	int n=in.nextInt();
for(int i=0;i<=n;i++)
{
  for(int j=0;j<i;j++)
{
System.out.print(" * ");
}
System.out.println();
}

//--------------------------------------------------------------------------------------------------------

for(int i=n-1;i>=0;i--)
{
  for(int j=0;j<i;j++)
{
System.out.print(" * ");
}
System.out.println();
}


}}

