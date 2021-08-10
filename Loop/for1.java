//write a complite java program to find and display the sumatin of all posative odd numbers from 1 to 12

import java.util.Scanner;
public class for1
{
public static void main(String [] args)
{
	Scanner in=new Scanner(System.in);
	//2
	System.out.println("your first number ");
	int a=in.nextInt();

	System.out.println("your secound number ");
	int b=in.nextInt();

	System.out.println("your third number ");
	int c=in.nextInt();

	System.out.println("your fourth number ");
	int d=in.nextInt();

System.out.println("your fifth number ");
	int e=in.nextInt();
//write a complate java program to get 5 number from user count and display number of odd numbers and even numbers
int sum=0;
int sum1=0;
int odd=0;
int even=0;
for(int i=1;i<=12;i=i+2){
	sum=sum+i;
}
if(a%2==1 )
{
	System.out.println(a);
	odd++;
}
for(int i=1;i<=12;i=i+2){
	sum1=sum1+i;

System.out.println("sum is equl to "+sum);
System.out.println("odd number is equal to "+odd);
System.out.println("even number is equal to "+even);


}}}
