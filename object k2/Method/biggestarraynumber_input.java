
import java.util.Scanner;

public class biggestarraynumber_input
{

	///////////////////////////////////////////////////////

	public static int biggestarray(int b[])//the method
	{
		int temp=0;

	        for(int i=0;i <b.length;i++)
	          {
		  if(b[i]>temp)
		  temp=b[i];
	          }
      return temp;
   }

//////////////////////////////////////////////////////////////

public static void main(String [] ajbkkrgs)
{

	//input array
	Scanner in=new Scanner(System.in);
System.out.println("how match array element you want");
int e=in.nextInt();

int[]x=new int [e];
for(int i=0;i<x.length;i++)
{

System.out.println("enter your ("+(i+1)+") number");
 x[i]=in.nextInt();
 System.out.println("the number you entered is " + (x[i]));
System.out.println("\n");
}


System.out.printf("\n"+"your biggest array is : ");
System.out.println(biggestarray(x));

}
}
