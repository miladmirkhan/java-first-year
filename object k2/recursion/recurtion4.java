//how many charecter it has
public class recurtion4
{
		public static int countChar(String s,char c)
		{
		if(s.length()==0)
		return 0;
		if(s.charAt(0)/* first char at String */==c)
		return 1+ countChar(s.substring(1),c);
		else
	     return countChar(s.substring(1),c);
	   }

public static int countChar(char c,String s)
{
if(s.length() == 0)
return 0;

//s has at least 1 character
if(s.charAt(0)== c)
return 1 + countChar(c ,s.substring(1));

//first character of s is c
return countChar(c,s.substring(1));
}
public static void main (String[]args)
{
	String d="dsssssdfsssssa";
System.out.println(countChar('d',"dsssssdfsssssa"));
System.out.println(countChar("dsssssdfsssssa",'d'));

System.out.println(d.substring(1));
System.out.println(d.substring(1,5));
}
}