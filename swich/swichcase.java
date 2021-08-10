import java.util.Scanner;
public class swichcase
{
public static void main(String [] arfd)
{
	Scanner in=new Scanner(System.in);
	{

System.out.println("enter a day number");
		int day=in.nextInt();
//-------------------------------------------------------------------------
		switch(day){

		case 1:
					System.out.println("sunday");
					break;
		case 2:
					System.out.println("Monday");
					break;
		case 3:
					System.out.println("tuesday");
					break;
		case 4:
					System.out.println("wensday");
					break;
		case 5:
					System.out.println("thursday");
					break;
		case 6:
					System.out.println("friday");
					break;
		case 7:
					System.out.println("saturday");
					break;
		default:
					System.out.println("not a valid day");
					break;
//--------------------------------------------------------------------------
}}}}

/*
   switch(num) {

   case 1:
           //do this
           break;
   case 2:
           //do this
           break;

   default:
            //do this
}
*/