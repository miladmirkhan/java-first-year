import java.util.Scanner;
public class div
{
public static void main(String []str)
{
double number1=0;
double number2=0;


double div=0, reminder=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter the first number: ");
number1=input.nextDouble();

System.out.println("Enter the second number: ");
number2=input.nextDouble();

div=(number1/number2);
reminder=(number1%number2);
System.out.println("Equals: "+div+" With Reminer: "+reminder);
}
}