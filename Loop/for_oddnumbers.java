import java.util.Scanner;
public class for_oddnumbers
{
public static void main(String [] args)
{
	Scanner in=new Scanner(System.in);
int n = 100;
	System.out.print("Odd Numbers from 1 to "+n+" are: ");
	for (int i = 1; i <= n; i++) {
	   if (i % 2 != 0)

	   //you can use == for even numbers

	   {
		System.out.println(i + " ");
	   }
	}
   }
}