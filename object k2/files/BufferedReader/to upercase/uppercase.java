import java.io.*;
public class uppercase
{
public static void test(String s1,String s2)throws IOException
{
BufferedReader in=new BufferedReader (new FileReader(s1));
PrintWriter out=new PrintWriter (new FileWriter (s2,false));

int line=in.read();
char ch=(char)line;

while(line !=-1)
{
	if (Character.isLetter(ch))
	{
	out.println(Character.toUpperCase(ch));
	}

	line=in.read();
	ch=(char)line;
}

out.close();
in.close();
}

public static void main(String[]safv)throws IOException
{
	test("in.txt","in1.txt");
}
}