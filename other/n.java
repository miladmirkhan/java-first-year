import java.util.Scanner;
public class n
{
public static void main(String[]args){
String password="let me in";
System.out.println("Guess the password: ");

Scanner in=new Scanner(System.in);
String guess=in.nextLine();

int   b=guess.equals("b") ? 0 : 10;
System.out.println(b);

//System.out.println(password.equals(guess));

//System.out.println(password==guess);
if(guess.equals(password)){
	System.out.println("you can get in ");
}
else if("hi".equals(guess)){
	System.out.println("hi?");}

else{
System.out.println("you can not get in ");
}







}}
