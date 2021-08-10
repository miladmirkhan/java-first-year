import java.util.*;
public class Void2
{
    public static void main(String[] args)
    {
final Scanner in=new Scanner(System.in);
  int o=0;
  System.out.println(o);
  u(o);
  System.out.println(o);
  a(o);


  int a[]=new int [5];
  arr(a);/* for array you can use input and output and if still exist out side method be couse array is a storage holder */

  for(int i=0;i<a.length;i++)
  {
  	System.out.println(a[i]+" ");
  }

    }
    public static void arr(int[]a)
    {
Scanner in=new Scanner(System.in);
for(int i=0;i<a.length;i++)
{
	a[i]=in.nextInt();
}


	}
    public static void u(int o)
    {

    Scanner in=new Scanner(System.in);
    o=in.nextInt();
    System.out.println(o);
    }
    public static void a(int o)
	    {
	System.out.println(o);
    }
}