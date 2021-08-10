package arrey;

import java.util.Scanner;
public class arreyinput1

{
public static void main(String[]wedf)
{
    Scanner in = new Scanner(System.in);
System.out.println("how many array you want ");
int a=in.nextInt();

int[]y=new int[a];

for(int e=0;e<y.length;e++)
{
y[e]=in.nextInt();

System.out.println("your " +y[e]+"arrey is :");
System.out.println(y[e]);
}
//y[[1]]=y[1]=second number you enter , so the arey out put the number you inter in y[1]
System.out.println(y[y[1]]);}}

