import java.util.Scanner;
public class ifElse
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);

System.out.println("enter first number ");
int a=input.nextInt();

System.out.println("enter the secound number ");
int b=input.nextInt();

int even=0,odd=0;

if(b%2==0){
	System.out.println("your second number is even ");
	even++;
}
else{
System.out.println("your secound number is odd ");
odd++;}
if(a%2==0){
	System.out.println("your first number is even ");
	even++;
}
else{
System.out.println("your first number is odd ");
odd++;}
System.out.println("odd number is "+odd);
System.out.println("even  number is "+even);
}
}