import java.util.Scanner;
public class increment_decrement
{
public static void main(String [] arfd)
{
	Scanner in=new Scanner(System.in);
	{
int m=5;
int n=5;
System.out.println(m+" "+n);

int q=2 * ++m;
int w=2 * n++;

System.out.println(m+" "+n); //m=6  n=6
System.out.println("hi");
System.out.println(q+" "+w); //q=12  w=10

System.out.println("----------------------------------------------------");

int a=-2, b=7, c=3;
b =2+ --c; //a=-2 b=4 c=2
System.out.println(a+" "+b+" "+c);

System.out.println("----------------------------------------------------");

c = b-- + c++ + c - a--; //c=4+2+2+2; c=11; b=3; a=-3
System.out.println(a+" "+b+" "+c);

System.out.println("----------------------------------------------------");

a = b - ++c + a;//a=3 - 12 -3 ; a=-12 c=12 b=3
System.out.println(a+" "+b+" "+c);

System.out.println("----------------------------------------------------");

System.out.println(++a+" "+b+++" "+-c);//a=-11 b=3 c=-12
System.out.println(b);



	}}
}
