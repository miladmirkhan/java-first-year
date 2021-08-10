/*
E.x/ Write a method that takes two file names as parameters,
and read the ferst file,and writes everything on the first file
except numbers into the second file. Test your method in Java program.
*/

import java.io.*;

class ReadCharByCharEception
{
public static void file(String s1,String s2)throws IOException
{
BufferedReader in = new BufferedReader(new FileReader(s1));
PrintWriter out=new PrintWriter(new FileWriter(s2, false));

int line= in.read();
char c=(char)line;

while ( line != -1)
{

if(!Character.isDigit(c)&&!Character.isWhitespace(c))
out.print(c);
line = in.read();
c=(char)line ;

}
out.close();
in.close();
}

public static void main(String[]args)throws IOException
{
file("TextRead.txt","TextWrite.txt");
}}

