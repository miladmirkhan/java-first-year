import java.util.Scanner;
public class string
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String s1=" Milad is a";
String s2=" milad is a";

System.out.println("for   s1 + s2");
String s9=s1.concat(s2);
System.out.println(s9);
System.out.println("\n");
//--------------------------------------------------------------------
System.out.println("for substring ");
String s3=s2.substring(0,4);
System.out.println(s3);
System.out.println(s9.substring(0,9));
System.out.println("\n");
//--------------------------------------------------------------------
System.out.println("for Knownig how many leters you have");
System.out.println(s2.length());
System.out.println("\n");
//--------------------------------------------------------------------
System.out.println("for get char 4");
char ch=s2.charAt(4);
System.out.println(ch);
System.out.println("\n");
//--------------------------------------------------------------------
System.out.println("if s1 equals s2 ");
if(s1.equals(s2)){
	System.out.println("yes is equals");}
	else{
		System.out.println("no is not equals");}
		System.out.println("\n");
	//----------------------------------------------------------------
	System.out.println("if s1 equals s2 with egnore case");
	if(s1.equalsIgnoreCase(s2)){
		System.out.println(" yes is equals");}
		System.out.println("\n");
//--------------------------------------------------------------------
System.out.println("know ends with");
boolean b=s1.endsWith(s2);
System.out.println(b);

if(s1.endsWith(s2)){
	System.out.println("ends with same sufecs");}
	else{
		System.out.println("not ends with");}
		System.out.println("\n");
//---------------------------------------------------------------------
System.out.println("know the index");
int a=s9.indexOf("a");
System.out.println(a);
System.out.println(s9.indexOf("a",5));
System.out.println("\n");
//---------------------------------------------------------------------
System.out.println("last 3 char");
String s5=s9.substring(s9.length()-3);
System.out.println(s5);
System.out.println("\n");
//---------------------------------------------------------------------
System.out.println("last -3 char  -5 ");
System.out.println(s9.substring(s9.length()-3,s9.length()-2));
System.out.println(s5);
System.out.println("\n");
//---------------------------------------------------------------------
System.out.println("last carecter of string 3");

System.out.println(s9.charAt(s9.length()-1));

System.out.println("\n");
//---------------------------------------------------------------------
System.out.println("the last third carecter of string 3");

System.out.println(s9.charAt(s9.length()-3));
//---------------------------------------------------------------------

//indexOf(char,number)
System.out.println(s9.indexOf("l",5));
//---------------------------------------------------------------------
String ss="programming";

System.out.println("length -5 ,length -2 ");
System.out.println(ss.substring(ss.length()-8,ss.length()-5));
System.out.println("\n");


}}

