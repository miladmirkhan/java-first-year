import java.util.Scanner;
public class Rec
{
public static int Factorial(int n)
{
if(n!=0)

return n*(Factorial(n-1));

else
return 1;
}

public static void main(String[]args)
{
	Scanner in=new Scanner (System.in);
	int n=in.nextInt();

	System.out.println(Factorial(n));
}

}
