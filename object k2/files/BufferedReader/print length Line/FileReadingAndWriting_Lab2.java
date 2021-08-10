/*Q2/ write a java method that takes two file names as parameters,
and print length of each line in first file to the second,
test your method in a complete program, read file names from user.
*/

import java.util.Scanner;
import java.io.*;
public class FileReadingAndWriting_Lab2
{
     public static void main(String [] args) throws IOException
     {
          Scanner input = new Scanner (System.in);

          System.out.print("Enter first filename: ");
          String f1 = input.nextLine();

          System.out.print("Enter second filename: ");
          String f2 = input.nextLine();

          lengthToFile (f2);
     }


     public static void lengthToFile ( String f2) throws IOException
          {
              BufferedReader in=new BufferedReader(new FileReader ("milad.txt"));

              PrintWriter out=new PrintWriter( new FileWriter (f2+".txt", false));


               String s1 = in.readLine();

               while (s1 != null)
               {
                    out.println(s1.length());
                    s1 = in.readLine();
               }


               in.close();
               out.close();
          }
}

