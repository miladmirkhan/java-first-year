/*
Q/ Write a Java program that can maintain information about a personal
bookshelf. The program asks for information about a new book such as
the title, author and price. Use a class to hold book information, and two
methodsqniha one to get information from the user,
second one to print information in the text file like this:
1- "Java how to program", Deitel , 200
2- "Java The Complete Reference", Scheldt, 400
3- …
4- …
In the main method create an array of type your class and test your
methods.
*/

import java.util.Scanner;
import java.io.*/*to use all io extenshens*/;// use to export import data to another file

class bookshelf// the object
{
String name_of_book;
String auther_of_book;
int price_of_book;
}

public class book
{
public static void main(String []args)throws IOException/*use for text file*/
{
	Scanner in=new Scanner(System.in);

System.out.println("enter the name of text file: ");
String textname=in.nextLine();

System.out.println("How many book you have: ");
int namebook=in.nextInt();

bookshelf b[]=new bookshelf[namebook]; // object declarer
for(int i=0;i<b.length;i++)
{
b[i]=new bookshelf();
}

fill_array(b);

print_book_information(b,textname);
}




public static void fill_array(bookshelf array[]) //object input
{
Scanner in=new Scanner(System.in);
for(int i=0;i<array.length;i++)
{
System.out.println("Enter the "+"("+(i+1)+") "+"book title: ");
array[i].name_of_book=in.nextLine();
System.out.println("Enter the "+"("+(i+1)+") "+"book auther: ");
array[i].auther_of_book=in.nextLine();
System.out.println("Enter the "+"("+(i+1)+") "+"book price: ");
array[i].price_of_book=in.nextInt();

in.nextLine();//becouse the Scanner can not read the first line after the last line
}
}




public static void print_book_information(bookshelf array[],String w)/*object output*/throws IOException/*use for text file*/
{
 FileWriter writer = new FileWriter (w+".text", true);
 PrintWriter outprint = new PrintWriter (writer);

for(int i=0;i<array.length;i++)
{
outprint.println(/*we can not use quotation marks in String unless we use back slash*/"\""+array[i].name_of_book+"\""+", "+array[i].auther_of_book+", "+array[i].price_of_book);
}
outprint.close();//you shoud close outprint(PrintWriter)
}
}




