package arrey;

import java.util.Scanner;
public class arreyinput
{
public static void main(String[] efds)
{
Scanner in=new Scanner(System.in);

System.out.println("how many arreys you want");
int c=in.nextInt();

int a []=new int [c];

for(int i=0;i<c;i++)
{
System.out.println("enter a number :");
a[i]=in.nextInt();
System.out.println("your "+i+" array is :"+a[i]);
}

System.out.println(a.length);

System.out.println("");
}
}
