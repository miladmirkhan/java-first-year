/* Write a java method that takes a string as a parameter and returns
just the string non-vowels letters in reverse order. Test your method in a
complete java program.
*/
public class NonVaulsLetters
{
public static String method(String s)
{
String temp="";

//this is for regular
//for(int i=0;i<s.length();i++)
/*
you can writed this way
char ch=s.charAt(i);

but you have to initialize int i befor for
*/
for(int i=s.length()-1;i>=0;i--)
{
	char ch=s.charAt(i);
         if(ch!='a' && ch!='A'
&& s.charAt(i)!='i' && s.charAt(i)!='I'
&& s.charAt(i)!='o' && s.charAt(i)!='O'
&& s.charAt(i)!='e' && s.charAt(i)!='E'
&& ch!='u' && ch!='U')
temp=temp+s.charAt(i);
}

return temp;
}
public static void main(String str[])
{
String s="Test your program";
System.out.println(method(s));
}
}