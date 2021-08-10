/*
E.x/ Write a method that takes a file name as its only parameter.
The method will search the file of numbers and write the largest number
on the screen. The file contains nothing but numbers of type int
each in separated line. Test your method in a Java program.
*/

import java.io.*;

class FileOfNumbers
{
public static void file(String s1)throws IOException
{
BufferedReader in = new BufferedReader(new FileReader(s1));
String s = in.readLine();

int x=Integer.parseInt(s); //convert String to int
int Largest=x;
while ( s != null)
{
	x=Integer.parseInt(s);
if(x>Largest)
Largest=x;
s=in.readLine();
}
System.out.println("The Largest number Is: "+Largest);
in.close();
}

public static void main(String[]args)throws IOException
{
	String sd="text.txt";
file(sd);
}}

