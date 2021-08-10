/* E.x/ Write a java program to read from the file one character at a time. and outputs it to the
screen.
*/
import java.io.*;
class ReadCharByChar
{
public static void main(String[]args)throws IOException
{

BufferedReader in=new BufferedReader(new FileReader ("Text.txt"));
PrintWriter out=new PrintWriter(new FileWriter("tbt.txt",true));
int line=in.read();
//read(); use to read one charactur
char c=(char)line;

while(line!= -1)
{
	out.print(c);//to the PrintWriter
    System.out.print(c);// to System
    line=in.read();
    c=(char)line;
}

in.close();
out.close();
}
}