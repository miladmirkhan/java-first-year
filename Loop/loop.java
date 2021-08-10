import java.util.Scanner;
public class loop
{
public static void main(String [] args)
{
Scanner in=new Scanner(System.in);

System.out.println("how many repitin you want \n");
int a=in.nextInt();
do{
	System.out.println(a+"cat");
	a--;
	}
	while(a>0);

System.out.println("-------------------------------------------------------------------------------");
//it goes from 0 to number
for (int i=in.nextInt();i<10;i++){
	System.out.println(i+"cat");}

	System.out.println("-------------------------------------------------------------------------------");
//it goes from number to 0
System.out.println("how many repite you want");
int b =in.nextInt();

while (b>0){
	System.out.println(b+"dog");
	b--;}
	System.out.println("-------------------------------------------------------------------------------");



}
}
