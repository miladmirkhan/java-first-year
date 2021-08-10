import java.util.Scanner;
public class reversstring
{
	///////////////////////////////////////////////////////////////////////////////////
	public static String reverse(String a)
	{
		String c="";
		for(int i=a.length()-1; i>=0; i--)
		{
		  c=c+a.charAt(i);
        }
        return c;
   }
   	 ///////////////////////////////////////////////////////////////////////
public static int counter(String v)
	{
		int counter1=0;
		for(int i=0;i<v.length(); i++)
		{
      counter1 ++;
      }
return counter1;
}
	////////////////////////////////////////////////////////////////////////
public static void main(String[]args)
		{
			Scanner in=new Scanner(System.in);
			System.out.println("enter a sentens: ");
			String s=in.nextLine();

			System.out.println("the reverse of the sentens: ");
			System.out.println(reverse(s));

		System.out.println("how many letter ther is: " + counter(s));



	}
}


