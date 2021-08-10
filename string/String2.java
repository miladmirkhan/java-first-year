public class String2
{
	public static void main(String[] a)
	{
		String s1 ="hello", s2="world";
String result;
result=s1+s2;
System.out.println(result);

	  System.out.println(s1);
	   System.out.println(s2);
	 //String s=s1+"world";
	 String s=s1+"gh";
	 System.out.println(s);
	 System.out.println(s1);
	 System.out.println(s.concat("  concat"));
	 System.out.println(s+" +");
	 // if you use s1 it just output hello

//you can extract a substring from a large string
String s3=s1.substring(0,3);
System.out.println(s3);
System.out.println("substring from    -3        -1");
System.out.println(s1.substring(s1.length()-3,s1.length()-1));

//substring use for extract
//s3=hel
System.out.println(s1.length());
//length show how mach number the are
//System.out.println(s2.length()); s2 show witch s you want to know haw match letter is


// to get individual characters use  char ch=s.charAt();
char ch=s1.charAt(3);
//if you right ani nomber in hire[charAt(3)] it show the letter
System.out.println(ch);
System.out.println(s2.indexOf('d'));
System.out.println(s2.indexOf('d',5));
System.out.println(s1.equals(s2));

//indexOf(char,number)
System.out.println(result.indexOf("l",5));


}

}

