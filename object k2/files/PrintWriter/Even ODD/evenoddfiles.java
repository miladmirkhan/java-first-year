import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java .util.Scanner;
public class evenoddfiles
{

public static void even(int a[],String b,String c)throws IOException
{

PrintWriter out1=new PrintWriter(new FileWriter(b+".txt",false));
PrintWriter out2=new PrintWriter(new FileWriter(c+".txt",false));

		for(int i=0;i<a.length;i++)
		{
		if(a[i]%2==0){
		out1.println(a[i]);}
		else{
		out2.println(a[i]);}
		}

out1.close();
out2.close();
}


public static void main(String []args)throws IOException
{

Scanner in=new Scanner(System.in);

	System.out.println("Enter file name for Even numbers: ");
	String s2=in.nextLine();

	System.out.println("Enter file name for Odd numbers: ");
	String s3=in.nextLine();

    System.out.println(" ");
    System.out.println("Enter how many Aray Ellement you want:");

/////////////////////////////////////////////////////////////////////////////////

	// for get the Array elements from user
	int o=in.nextInt();

	int a[]=new int[o];

	for(int i=0;i<a.length;i++)
	{
	System.out.println("enter a number :  number"+(i+1));
	a[i]=in.nextInt();
	}

///////////////////////////////////////////////////////////////////////////////////

even(a,s2,s3);

}
}