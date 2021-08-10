/* Making Calculator using the switch statement, the
program below takes three inputs from the user: one
operator (-, +, *, /) and 2 numbers. Based on the
operator provided by the user, it performs the
calculation on the numbers. Then the result is
displayed on the screen. */


import java.util.Scanner;

public class Switch_lab
{
public static void main(String []str)
{
char operator;
double number1, number2, result;

// create an object of Scanner class

Scanner input = new Scanner(System.in);

// ask users to enter operator

System.out.print("Choose an operator: +, -, *, / , or %: ");
operator = input.next().charAt(0);

// ask users to enter numbers

System.out.print("Enter first number: ");
number1 = input.nextInt();

System.out.println("Enter second number: ");
number2 = input.nextInt();

		switch (operator)
{
// performs addition between numbers
		case '+':
result = number1 + number2;
System.out.println(number1 + "+" + number2 + " = " + result);
		break;


// performs subtraction between numbers

		case '-':
result = number1 - number2;
System.out.println(number1 + "-" + number2 + " = " + result);
		break;


// performs multiplication between numbers
		case '*':
result = number1 * number2;
System.out.println(number1 + "*" + number2 + " = " + result);
		break;


// performs division between numbers
		case '/':
result = number1 / number2;
System.out.println(number1 + "/" + number2 + " = " + result);
		break;

		case'%':
		result=number1 % number2;
		System.out.println(number1 + "%" + number2 + " = " + result);
		break;


		default:
System.out.println("Invalid operator!");
		break;
}//end switch
}//end main method
}//end class