/*
Q/ Write java methods to:
1. Return addition of two int numbers.
2. Return addition of three int numbers.
3. Return addition of two double numbers.
Call and test them in a main method
*/
import java.util.Scanner;
public class additions
{

public static int add(int a,int b)//method for Return addition of two int numbers
{
  return a+b;
}

public static int add(int a,int b,int c)//method for Return addition of three int numbers.
{
  return a+b+c;
}

public static double add(double a,double b)//method for Return addition of two double numbers.
{
  return a+b;
}

public static void main(String[]args)//Call and test them in a main method
{
	Scanner in=new Scanner(System.in);

System.out.println("Enter the first Number(for the firts method): ");
int n1=in.nextInt();
System.out.println("Enter the secound Number(for the firts method): ");
int n2=in.nextInt();

System.out.println("Enter the first Number(for the secound method): ");
int n3=in.nextInt();
System.out.println("Enter the secound Number(for the secound method): ");
int n4=in.nextInt();
System.out.println("Enter the third Number(for the secound method): ");
int n5=in.nextInt();

System.out.println("Enter the first Double Number(for the third method): ");
double d1=in.nextDouble();
System.out.println("Enter the secound Double Number(for the third method): ");
double d2=in.nextDouble();

System.out.println();//for seperation the (resoult and input)

System.out.println("Resoult addition the two int numbers : "+add(n1,n2));

System.out.println("Resoult addition the three int numbers : "+add(n3,n4,n5));

System.out.println("Resoult addition the two double numbers : "+add(d1,d2));

}
}
