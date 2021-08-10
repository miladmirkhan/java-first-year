import java.util.*;

public class vauls
{
public static int vauls(String sentence)
{
int count = 0;

for (int i=0;i<sentence.length();i++)
{
	char ch=sentence.charAt(i);

if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='u'
 ||ch=='U'||ch=='y'||ch=='Y'||ch=='o'||ch=='O'
 ||ch=='i'||ch=='I')

count ++;

}return count;
}

public static void main(String[]args)
{
Scanner in=new Scanner (System.in);
System.out.println("enter your text: ");
String s=in.nextLine();
System.out.println("the vawels number is: "+vauls(s));
}
}

