//Display Sum of n Natural Numbers from 0 to 50
import java.util.Scanner;
public class sumofnaturalnumbers
{
  public static void main(String[] args) {
Scanner in= new Scanner(System.in);

 int sum = 0;
    int n = 50;

    // for loop
    for (int i = 1; i <= n; ++i) {
      // body inside for loop
      sum += i;     // sum = sum + i
      }
    System.out.println("Sum = " + sum);
  }}