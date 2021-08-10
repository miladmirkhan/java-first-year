import java.util.Scanner;
public class String_method
{
public static void main(String [] ards)
{
	Scanner in=new Scanner(System.in);
	System.out.println("inter your name:");
	String s=in.nextLine();

	String s1=s.concat(" is your name");

	//you can use{ +" is your name "} isted of concat
System.out.println(s1);

System.out.println("\n");

	//extract a substring: substring 0 is the first charecter and 5 is the fifth charecter
System.out.println("get the first to fifth char ");
String s2=s1.substring(0,5);
System.out.println(s2);

System.out.println("\n");

//for lenght of String
System.out.println("lenght of String");
System.out.println(s.length());

System.out.println("\n");

System.out.println("lenght of the substing of the String");
System.out.println(s2.length());

System.out.println("\n");

//to get a character of string (at spesified index)
System.out.println("character 4 of string");
char s3=s.charAt(4);
//first char is 0 and 4 is fifth char
System.out.println(s3);

System.out.println("\n");

System.out.println("character 6 of string");
System.out.println(s.charAt(6));

System.out.println("\n");

System.out.println("enter the first String:");
String a1=in.nextLine();
System.out.println("enter the secound String:");
String a2=in.nextLine();

System.out.println("\n");

//if you want to know your string is equals use this method
//in this method should be the same
System.out.println("your two Strings is equals");

if(a1.equals(a2)){
	System.out.println("equals");}

	else{
		System.out.println("not equals ");}

System.out.println("\n");

// you can use s.o.p and it get you bolean expretion
System.out.println("with s.o.p form ");
		System.out.println(a1.equals(a2));

		System.out.println("\n");

// if you want to know you string is equals with Ignoring case use this method
System.out.println("you two Strings is Equals (ignore case)");
if(a1.equalsIgnoreCase(a2)){
	System.out.println("equals");}
	else{
		System.out.println("not equals ");}

		System.out.println("\n");

//is your string are equals with (s.o.p)method
System.out.println("you string is equals(s.o.p) method");
System.out.println(a1.equals(a2));

System.out.println("\n");

//is your two strings end with the same suffix
System.out.println("is your to Strings endsWhith");
		boolean b=a1.endsWith(a2);
		System.out.println(b);

System.out.println("\n");

System.out.println("is your two inpots endswith ");

//is your two strings end with the same suffix
		if(a1.endsWith(a2)){
			System.out.println("yes");}

			else{
			System.out.println("no");}

System.out.println("\n");

//to know how many charecter is on your String
int a3=a1.indexOf("m");
System.out.println(a3);

System.out.println("\n");

//if you string not have that charecter (-1)
int a4=a1.indexOf("i");
System.out.println(a4);

System.out.println("\n");

int a8=a1.indexOf("i",5);
System.out.println(a8);





}
}