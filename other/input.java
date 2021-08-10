import java.util.Scanner;
public class input
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("pleras enter twe numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		int result=(a+b)/2;
		System.out.println("the result="+result);
	}
}
