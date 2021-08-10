/*
sum the diget of number
*/public class recurtion2
{
public static int sum(int n)
{
if(n<10)
return n;

return n %10+ sum(n /10);//formula
}
public static void main(String[]args)
{
	int i=12342;
System.out.println(sum(i));
System.out.println();
System.out.println(i);
System.out.println();
System.out.println(i%10);
System.out.println(i/10);
System.out.println();
System.out.println(i%100);
System.out.println(i/100);
System.out.println();
System.out.println(i%1000);
System.out.println(i/1000);
System.out.println();
System.out.println(i%10000);
System.out.println(i/10000);
System.out.println();
System.out.println(i%100000);
System.out.println(i/100000);
System.out.println();
System.out.println(i%10000000);
System.out.println(i/10000000);
System.out.println();
}
}
