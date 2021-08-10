/*Q1/ write a java method that takes a file name and a message as parameters, and print all
non-vowel letters into the file, test your method in a complete program, read file name and string from user.
*/
import java.util.Scanner;
import java.io.*;
public class FileReadingAndWriting_Lab
{
	     public static void nonVowels (String s, String filename) throws IOException
	          {
	               FileWriter writer = new FileWriter (filename, false);
	               PrintWriter out = new PrintWriter (writer);


	               for (int i=0; i<s.length(); i++)
	               {
	                    char ch = s.charAt(i);//convert String i ellement to Char
	                    if (Character.isLowerCase(ch))
	                    out.print(ch);
	               }

	               out.close();
     }

     public static void main(String [] args) throws IOException
     {
          Scanner input = new Scanner (System.in);

			System.out.print("Enter your filename: ");
			String filename = input.nextLine();

           System.out.print("Enter your message: ");
           String message = input.nextLine();

          nonVowels(message, filename+".txt");
     }


}
