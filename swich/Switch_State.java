import java.util.Scanner; // Import the Scanner class
public class Switch_State
{
public static void main(String str[])
{
Scanner input= new Scanner(System.in);
System.out.println("Enter your grade:");
int grade=input.nextInt();
switch (grade){
case 100:
System.out.println(" Excellent.");
break;
case 80:
System.out.println(" Very good.");
break;
case 60:
System.out.println(" Passing");
break;
case 50:
case 30:
System.out.println(" Too bad, go study");
break;
default:
System.out.println("This is not a possible grade");
}}}