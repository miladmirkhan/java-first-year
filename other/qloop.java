import java.util.Scanner;
public class qloop
{
  public static void main(String[] args) {
Scanner in= new Scanner(System.in);

System.out.printf("wright the sentens");
String s=in.nextLine();

System.out.println("How many time you want to print the sentens ");
 int n =in.nextInt();

    for (int i = 1; i <= n; ++i) {
      System.out.println(i+". "+s);
    }
  }
}