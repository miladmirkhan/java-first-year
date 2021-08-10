/*ex/
wright a metod that takes a number adius
of a cercle and return area of it
test your method in a compleat java program.
*/
import java.util.*;
public class adius
{
public static double adius(double b)
	{
double c=(b*b)*(3.14);

return c;
	}
public static void main(String[]args)
	{
Scanner in=new Scanner(System.in);


System.out.println("write a adius to find the area of a cercle ");
double r=in.nextDouble();
System.out.println(adius(r));
	}
}