import java.util.Scanner;
public class do_while2
{
public static void main(String[] ares)
{
	Scanner in=new Scanner(System.in);
//---------------------------------------------------------------------------------
System.out.println("enter the double les than 0,1");
	double i=in.nextDouble();
do{
	System.out.println(i+".milad");
	i=i+0.0022;
	}
	//while
	while(i<1.0);{

	}
//--------------------------------------------------------------------------------
	System.out.println("enter the number");
	int i1=in.nextInt();

	do{
		System.out.println(i1+"mirkhan");
		i1--;}
		while(i1>0);
	//---------------------------------------------------------------------------------
	System.out.println("enter the number");
		int n=in.nextInt();
		int sum=0;
		while(n<100){
			System.out.println(n+"majeed"+sum);
			n++;
			sum=sum+1;
		}
//---------------------------------------------------------------------------------

}
}
