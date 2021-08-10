import java.util.Scanner;
public class wile
{
public static void main(String [] args)
{
Scanner input=new Scanner(System.in);

System.out.println("enter a number to count to 10");
int a=input.nextInt();

//count from 0 to 10

while(a<11){

	System.out.println(a);
a++;
}
}
}