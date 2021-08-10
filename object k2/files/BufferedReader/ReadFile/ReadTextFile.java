/*  E.x/ Write a java program that outputs all
	the contents of a file to the screen.
*/
import java.io.*;

class ReadTextFile
{
public static void main(String[]args)throws IOException
{

BufferedReader in=new BufferedReader(new FileReader ("Text.txt"));

			String Line=in.readLine();
			//readLine use to read file lines
	    	int lines=0;
        	while(Line!=null)
		{
			System.out.println(Line);
			  lines++;
			  Line=in.readLine();//always write in last of while
			}
System.out.println("how many lines we have :"+lines);
in.close();
}
}