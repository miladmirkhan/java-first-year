import java.io.*;
public class Count
{
public static void main(String[]args)throws IOException
{
	BufferedReader in=new BufferedReader(new FileReader("text.txt"));//for Char
	BufferedReader in1=new BufferedReader(new FileReader("text.txt"));//for Lines

int	letter=0,digit=0,space=0,lines=0,UpperCase=0,LowerCase=0;

	int line=in.read();
	char c=(char)line;

	while(line !=-1)
	//while((line=in.read()) !=-1)
	{
		   if(Character.isLetter(c))
		        letter++;
		   if(Character.isUpperCase(c))
		        UpperCase++;
		   if(Character.isLowerCase(c))
                LowerCase++;
           if(Character.isDigit(c))
        		digit++;
		   if(Character.isWhitespace(c))
         		space++;

		line=in.read();
    	c=(char)line;
}

String s=in1.readLine();

    while(s!=null)
{
	s=in1.readLine();
	lines++;
}

System.out.println("The number of letters equals to : "+letter);
System.out.println("The number of Digits equals to : "+digit);
System.out.println("The number of Space equals to : "+space);
System.out.println("The number of UpperCase equals to : "+UpperCase);
System.out.println("The number of LowerCase equals to : "+LowerCase);
System.out.println("The number of Lines equals to : "+lines);
}}