import java.util.Scanner;
public class qfor
{
  public static void main(String[] args) {
Scanner in= new Scanner(System.in);


 System.out.println(" Enter a Char :");
    char e=in.nextLine().charAt(0);

    System.out.println(" you char "+e);



System.out.printf("wright the sentens :");
String s=in.nextLine();

System.out.println("How many time you want to print the sentens ");
 int n =in.nextInt();

    for (int i = 1; i <= n; ++i) {
      System.out.println(i+". "+s);
    }



  }
}